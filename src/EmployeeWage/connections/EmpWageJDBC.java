package EmployeeWage.connections;



import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.SQLException;


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
		String query = "update employee_payroll set NetPay = ? where EmployeeName = ?;";

		//Statement statement = connection.createStatement();
		PreparedStatement statement = connection.prepareStatement(query);
		statement.setInt(1, employeePojo.getNetPay());
		statement.setString(2, employeePojo.getEmployeeName());


		int res = statement.executeUpdate();
		System.out.println(res+" :: records inserted");

		statement.close();
		connection.close();


	}
}
