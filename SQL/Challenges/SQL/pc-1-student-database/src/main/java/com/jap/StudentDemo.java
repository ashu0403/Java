package com.jap;

import java.sql.*;

public class StudentDemo {

    public void getAllStudentDetails() throws SQLException, ClassNotFoundException {
        // Load the Drivers
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Get the connection from database
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "admin");
        // Create statement object
        Statement statement = connection.createStatement();
        // execute the query
        ResultSet resultSet = statement.executeQuery("select * from Student");
        // display the ResultSet Data
        System.out.println("Name" + " " + "Roll_No" + " " + "Grade");
        while (resultSet.next()) {
            System.out.println(resultSet.getString(1) + " " + resultSet.getInt(2) + " " + resultSet.getString(3));
        }
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        StudentDemo studentDemo = new StudentDemo();
        studentDemo.getAllStudentDetails();
    }
}
