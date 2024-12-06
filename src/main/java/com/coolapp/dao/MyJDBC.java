package com.coolapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyJDBC {
    public static void main(String[] args) throws Exception {

        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/login_schema",
                "root",
                "041221"
        );
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM products");

        while (resultSet.next()) {
            System.out.println(resultSet.getString("Nome"));
            System.out.println(resultSet.getString("Id"));


        }
    }
}