package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class AirportTester {
	static String url = "jdbc:mysql://localhost:3306/kavyajdbc";
	static String userName = "root";
	static String password = "root";

	//static String sqlStatement = "insert into kavyajdbc.airport_details values(1,'KIA','KIA','IGIA',3,'Devanahalli','1')";
	//static String sqlStatement = "insert into kavyajdbc.airport_details values(2,'MIA','MIA','KIA',3,'Mangalore','1')";
	static String sqlStatement = "insert into kavyajdbc.airport_details values(3,'IGIA','IGIA','KIA',3,'Delhi','1')";

	static String updateQuery = "update kavyajdbc.airport_details set a_name='Kempegowda International Airport' where a_id=1;";
	static String deleteQuery = "delete from kavyajdbc.airport_details  where a_id=3;";

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
