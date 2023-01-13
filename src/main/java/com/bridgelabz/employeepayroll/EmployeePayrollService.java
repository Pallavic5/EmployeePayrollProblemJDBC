package com.bridgelabz.employeepayroll;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/*
 * Problem Statement UC 1: Ability to create a payroll service database and have java program connect to database
 */
public class EmployeePayrollService {

	public static void main(String[] args) {
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
}
