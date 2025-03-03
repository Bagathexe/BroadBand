package com;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
public class DataBaseConnection {
    private static final String url="jdbc:mysql://localhost:3306/Broadband";
    private static final String user="root";
    private static final String password="@6551singh";


    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(url,user,password);
    }
}
