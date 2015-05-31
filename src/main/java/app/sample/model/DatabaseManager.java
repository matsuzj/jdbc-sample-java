package app.sample.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {

    private static String driverName = "com.mysql.jdbc.Driver";
    private static String database = "sample";
    private static String host = "localhost";
    private static String url = "jdbc:mysql://" + host + "/" + database;
    private static String user = "root";
    private static String pass = "password";


    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName(driverName);
            con = DriverManager.getConnection(url,user,pass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }



}


