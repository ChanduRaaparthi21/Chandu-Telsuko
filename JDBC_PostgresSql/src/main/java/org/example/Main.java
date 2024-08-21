package org.example;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception{

        String url="jdbc:postgresql://localhost:5432/Demo";
        String uname="postgres";
        String pswd = "chandu242638";
        String sql= "Select * from student";
//        String sql = "select sname from student where sid=1";

        Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection(url,uname,pswd);
        System.out.println("Connected");

        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
//        rs.next();
//        String name = rs.getString("sname");
//        System.out.println("name of the student "+name);

        while (rs.next()){
            System.out.print(rs.getInt(1) +" - ");
            System.out.print(rs.getString(2)+" - ");
            System.out.print(rs.getInt(3));
            System.out.println();


        }
        System.out.println("connection closed");
        con.close();


    }
}