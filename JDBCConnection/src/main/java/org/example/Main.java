package org.example;

import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:postgresql://localhost:8080/Student";
        String uname = "postgres";
        String password = "YogeshRoyal@03";
        Connection con = DriverManager.getConnection(url, uname, password);
        System.out.println("Connection Established");

        Statement st = con.createStatement();

        String sql = "SELECT sname, smarks FROM student WHERE sid=1";

        ResultSet rs = st.executeQuery(sql);
        rs.next();

        String name = rs.getString("sname");
        int m = rs.getInt("smarks");
        System.out.println("Name of the Student: " + name + " ,Marks: " + m);

        con.close();
        System.out.println("Connection Closed!!");



    }
}