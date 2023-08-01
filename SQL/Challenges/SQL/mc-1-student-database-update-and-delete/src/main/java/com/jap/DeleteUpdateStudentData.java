package com.jap;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class DeleteUpdateStudentData {

    public Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "admin");
        return connection;

    }

    public void deleteStudentData() throws SQLException, ClassNotFoundException {
        // call getConnection() method
        Statement statement = getConnection().createStatement();
        statement.executeUpdate("delete from student where rollno =21");
        // execute delete query
    }

    public void updateStudentData() throws SQLException, ClassNotFoundException {
        // call getConnection() method
        Statement statement = getConnection().createStatement();
        statement.executeUpdate("update student set grades ='A' where name ='Ram' ");
        // execute update query
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DeleteUpdateStudentData salesDataDemo = new DeleteUpdateStudentData();
        salesDataDemo.deleteStudentData();
        salesDataDemo.updateStudentData();
    }
}
