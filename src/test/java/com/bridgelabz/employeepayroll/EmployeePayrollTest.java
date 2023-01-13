package com.bridgelabz.employeepayroll;
/*Problem Statement
 * UC 4 - Ability to update the salary i.e. the base pay for Employee Terisa to 3000000.00 and sync it with Database
using JDBC PreparedStatement 
 */
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class EmployeePayrollTest {
	EmployeePayrollService employeePayRollService = new EmployeePayrollService();

	@Test
	public void givenEmployeePayrollDB_WhenRetrieved_ShouldMatchEmployeeCount() {
		String sql = "select * from employee_payroll";
		List<Employee> employeePayrollDataList = employeePayRollService.queryExecute(sql);
		Assert.assertEquals(8, employeePayrollDataList.size());
	}
	@Test
	public void givenUpdatingTerisaBasicPay_whenUpdate_ShouldReturnUpdatedPay() {
		double BasicPay = 3000000;
		String Name = "Terisa";
		double salaryUpdated = employeePayRollService.updateBasicPay(Name, BasicPay);
		Assert.assertEquals(BasicPay, salaryUpdated, 0.0);
	}
	@Test
	public void givenUpdatingMackBasicPay_whenUpdate_ShouldReturnUpdatedPay() {
		double BasicPay = 800000;
		String Name = "Pallavi";
		double salaryUpdated = employeePayRollService.updateBasicPay(Name, BasicPay);
		Assert.assertEquals(BasicPay, salaryUpdated, 0.0);
	}
}
