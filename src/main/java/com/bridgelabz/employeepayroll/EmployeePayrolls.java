package com.bridgelabz.employeepayroll;
/*
 * UC 3 - Ability to update the salary i.e. the base pay for Employee Terisa to 3000000.00 and sync it with Database
 */
import java.util.Scanner;

public class EmployeePayrolls {

	public static void main(String[] args) {
		EmployeePayrollService employeePayRollService = new EmployeePayrollService();
		Scanner scanner = new Scanner(System.in);

		final int EXIT = 10;
		int choice = 0;
		while (choice != EXIT) {
			System.out.println("Enter Your Choice\n1. Get employee data\n2. update basic pay\n3. EXIT\n");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				String query = "select * from employee_payroll";
				employeePayRollService.queryExecute(query);
				employeePayRollService.display();
				break;

			case 2:
				System.out.println("enter employee name");
				String empName = scanner.next();
				System.out.println("enter basic pay you want to update");
				double basicPay = scanner.nextDouble();
				employeePayRollService.updateBasicPay(empName, basicPay);
				break;

			case 3:
				System.out.println("good bye");
				break;

			}
		}
		scanner.close();
	}
}
