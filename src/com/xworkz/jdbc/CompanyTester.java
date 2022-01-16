package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class CompanyTester {
	static String url = "jdbc:mysql://localhost:3306/kavyajdbc";
	static String userName = "root";
	static String password = "root";

	static String sqlStatement = "insert into kavyajdbc.company_details values(5,'B-workz','BTM layput','1',6000000,1500,'A',5)";
	static String updateQuery = "update kavyajdbc.company_details set c_name='X-workz odc' where c_id=1;";
	static String deleteQuery = "delete from kavyajdbc.company_details  where c_id=4;";

	public static void main(String args[]) {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println(connection + url);
			Statement statement = connection.createStatement();
			statement.executeUpdate(deleteQuery);
		} catch (SQLException e) {
			System.out.println("query is not executed" + e.getMessage());
		} finally {
			try {
				if (connection != null) {
					connection.close();
					System.out.println("connection is closed");
				} else

				{
					System.out.println("connection is not created");
				}
			}

			catch (SQLException e) {

			}

		}
	}
}
