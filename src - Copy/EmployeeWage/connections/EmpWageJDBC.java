package EmployeeWage.connections;



import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import EmployeeWage.controller.EmployeeWageMain;
import EmployeeWage.model.EmployeeWagePojo;

public class EmpWageJDBC {



	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		EmployeeWageMain employeeObj = new EmployeeWageMain();
		EmployeeWagePojo employeePojo = employeeObj.getDetails();

		Class.forName("com.mysql.jdbc.Driver");
		final String url = "jdbc:mysql://localhost:3306/payroll_service";
		final String userName = "root";
		final String password = "babayaga@12345";
		Connection connection = DriverManager.getConnection(url,userName,password);
		
		String query = "select * from employee_payroll where StartDate between cast('2015-01-01' as date) and date(now()); ";
		
		Statement statement = connection.createStatement();
		
		ResultSet resultSet = statement.executeQuery(query);
		while(resultSet.next()) {
			//int employeeID = resultSet.getInt("EmployeeID");
			String employeeName = resultSet.getString("EmployeeName");
			int netPay = resultSet.getInt("NetPay");
			String startDate = resultSet.getString("StartDate");
			String city = resultSet.getString("City");
			String country = resultSet.getString("Country");
			String address = resultSet.getString("Address");
			String department = resultSet.getString("Department");
			int basicPay = resultSet.getInt("BasicPay");
			int deductions = resultSet.getInt("Deductions");
			int taxAblePay = resultSet.getInt("TaxablePay");
			int tax = resultSet.getInt("Tax");
			
			System.out.println("employeeID=" + ", employeeName=" + employeeName
				+ ", netPay=" + netPay + ", startDate=" + startDate + ", city=" + city + ", country=" + country
				+ ", address=" + address + ", department=" + department + ", basicPay="
				+ basicPay + ", deductions=" + deductions + ", taxAblePay=" + taxAblePay + ", tax=" + tax);
			
		}
		
		statement.close();
		connection.close();
		

	}
}
