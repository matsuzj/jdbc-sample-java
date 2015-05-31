package app.sample.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import app.sample.bean.TasksBean;

public class Tasks{

    private String selectAll = "SELECT * FROM tasks";

    public ArrayList<TasksBean> printSelectAll() throws SQLException {
        Connection con = DatabaseManager.getConnection();
        Statement stmt = con.createStatement();
        ResultSet result = stmt.executeQuery(selectAll);
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
    }

}