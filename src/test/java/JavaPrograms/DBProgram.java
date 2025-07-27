package JavaPrograms;

import java.sql.*;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class DBProgram {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

// TODO Auto-generated method stub

        String host="localhost";

        String port= "3306";

        Connection con=DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/intro_sql", "root", "password");

//        Statement s=con.createStatement();
//        ResultSet rs=s.executeQuery("select * from customers where id=1");
//
//        while(rs.next())
//        {
//            System.out.println(rs.getString("employee_id"));
//            System.out.println(rs.getString("company_name"));
//
//        }

        String query = "select * from customers where id = ?";
        PreparedStatement stmt = con.prepareStatement(query);
        stmt.setString(1, "1");

        ResultSet rs=stmt.executeQuery();

        while(rs.next())
        {
            System.out.println(rs.getString("employee_id"));
            System.out.println(rs.getString("company_name"));

        }


        rs.close();
        stmt.close();
        con.close();






    }

}
