package com.JavaStudent.jdbc_test.dao;

import java.sql.*;

public class ConnectDao {
    public static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    public static final String DATABASE_URL = "jdbc:mysql://localhost/DevelopmentDB";

    public static final String USER = "root";
    public static final String PASSWORD = "root";

    public static Connection connection = null;
    public static Statement statement = null;
    public static PreparedStatement preparedStatement = null;

    public static void ConnectDB() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
    }

    public static ResultSet selectRecord(String sql) throws SQLException {
        statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        statement.close();
        return resultSet;
    }

    public static void changeRecord(String sql, int...id) throws SQLException {
        preparedStatement = connection.prepareStatement(sql);
        int i = 1;
        for (int x : id){
            preparedStatement.setInt(i, x);
            ++i;
        }
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }

    public static void changeRecord(int id, String sql, String name) throws SQLException {
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, name);
        preparedStatement.setInt(2, id);
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }

    public static void addRecord(String sql, String name, int...id) throws SQLException {
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id[0]);
        preparedStatement.setString(2, name);
        if (id.length == 2){
            preparedStatement.setInt(3, id[1]);
        }
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }

    public static void closeConnect() throws SQLException {
        connection.close();
    }
}
