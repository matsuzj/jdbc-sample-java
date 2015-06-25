package app.sample.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import app.sample.bean.TasksBean;

public class Tasks{

    public List<TasksBean> selectAll() throws SQLException {
        Connection con = null;
        try {
            String sql = "SELECT * FROM tasks";
            con = DatabaseManager.getConnection();
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            ArrayList<TasksBean> taskList = new ArrayList<TasksBean>();
            while (result.next()) {
                TasksBean tasks = new TasksBean();
                tasks.setId(result.getInt(1));
                tasks.setTitle(result.getString(2));
                tasks.setFinished(result.getInt(3));
                tasks.setVersion(result.getInt(4));
                tasks.setCreatedAt(result.getTimestamp(5));
                tasks.setUpdatedAt(result.getTimestamp(6));
                taskList.add(tasks);
            }
            return taskList;
        } finally {
            if (con != null){
                con.close();
            }
        }
    }

    public TasksBean selectById(int id) throws SQLException{
        Connection con = null;
        try {
            String sql = "SELECT * FROM tasks where id = ? ";
            con = DatabaseManager.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.clearParameters();
            ps.setInt(1, id);
            ResultSet result = ps.executeQuery();
            TasksBean tasks = new TasksBean();
            while (result.next()) {
                tasks.setId(result.getInt(1));
                tasks.setTitle(result.getString(2));
                tasks.setFinished(result.getInt(3));
                tasks.setVersion(result.getInt(4));
                tasks.setCreatedAt(result.getTimestamp(5));
                tasks.setUpdatedAt(result.getTimestamp(6));
            }
            return tasks;
        } finally {
            if (con != null){
                con.close();
            }
        }
    }

    public TasksBean selectLikeTitle(String title) throws SQLException{
        Connection con = null;
        try {
            String sql = "SELECT * FROM tasks where title like ?";
            con = DatabaseManager.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.clearParameters();
            ps.setString(1, "%" +  title + "%");
            ResultSet result = ps.executeQuery();
            TasksBean tasks = new TasksBean();
            while (result.next()) {
                tasks.setId(result.getInt(1));
                tasks.setTitle(result.getString(2));
                tasks.setFinished(result.getInt(3));
                tasks.setVersion(result.getInt(4));
                tasks.setCreatedAt(result.getTimestamp(5));
                tasks.setUpdatedAt(result.getTimestamp(6));
            }
            return tasks;
        } finally {
            if (con != null){
                con.close();
            }
        }
    }

    public int insert(TasksBean tasks) throws SQLException{
        Connection con = null;
        try {
            String sql = "INSERT INTO tasks(`title`, `finished`, `version`, `created_at`, `updated_at`) values(?, ?, ?, ?, ?)";
            con = DatabaseManager.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.clearParameters();
            ps.setString(1,tasks.getTitle());
            ps.setInt(2,tasks.getFinished());
            ps.setInt(3,tasks.getVersion());
            ps.setTimestamp(4,tasks.getCreatedAt());
            ps.setTimestamp(5,tasks.getUpdatedAt());
            System.out.print(ps);
            int num = ps.executeUpdate();
            System.out.print(num);
            return num;
        } finally {
            if (con != null){
                con.close();
            }
        }
    }

    public int deleteById(int id) throws SQLException{
        Connection con = null;
        try {
            String sql = "DELETE FROM tasks where id = ?";
            con = DatabaseManager.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.clearParameters();
            ps.setInt(1, id);
            int num = ps.executeUpdate();
            return num;
        } finally {
            if (con != null){
                con.close();
            }
        }
    }

}