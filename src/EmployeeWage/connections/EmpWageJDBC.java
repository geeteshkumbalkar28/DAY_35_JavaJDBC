package com.bz.EmployeeWage.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpWageJDBC {
	
public static void main(String[] args) throws ClassNotFoundException, SQLException {


		
		Class.forName("com.mysql.jdbc.Driver");
		final String url = "jdbc:mysql://localhost:3306/payroll_service";
		final String userName = "root";
		final String password = "babayaga@12345";
		Connection connection = DriverManager.getConnection(url,userName,password);
		
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from employee_payroll");
		
		while(resultSet.next()) {
			String EmployeeName = resultSet.getString("EmployeeName");
			int NetPay = resultSet.getInt("NetPay");
			
			System.out.println("EMployeeName :: " + EmployeeName +'\n'+ "NetPay :: " + NetPay+'\n');
		}
		
		statement.close();
		connection.close();
		

	}

}
