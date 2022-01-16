package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class Tester {
static String url="jdbc:mysql://localhost:3306/kavyajdbc";
static String userName="root";
static String password="root";
static String sqlStatement="insert into kavyajdbc.family_table values('Lingappa',6,15000,'Sira')";
public static void main(String args[]) throws SQLException{
	Connection connection = DriverManager.getConnection(url, userName, password);
	Statement statement = connection.createStatement();
	statement.executeUpdate(sqlStatement);
	System.out.println(connection +url); 
}
}
