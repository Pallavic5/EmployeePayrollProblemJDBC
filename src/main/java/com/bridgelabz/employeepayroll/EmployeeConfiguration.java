package com.bridgelabz.employeepayroll;
/*
 * Problem Statement - UC2 Ability for Employee Payroll Service to retrieve the Employee Payroll from the Database
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeeConfiguration {
	private static Connection connection = null;

	static {
		try {
			/*
			 * load driver class
			 */
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded...");
			/*
			 * Make Connection
			 */
			String DataBaseName = "payroll_service";
			String URL = "jdbc:mysql://localhost:3306/" + DataBaseName;
			String DataBaseUserName = "root";
			String dbPass = "admin";
			Connection connection = DriverManager.getConnection(URL, DataBaseUserName, dbPass);
			System.out.println("Successfull Connection with " + DataBaseName + "....");
			connection.close();
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	public static Connection getConfig() {
		return connection;
	}

}
