package com.tech.blog.helpher;

import java.sql.*;

public class ConnectionProvider {

    private static Connection con;

    public static Connection getConnection() {
        try {
            if (con == null) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3307/amanblog", "root", "password");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
