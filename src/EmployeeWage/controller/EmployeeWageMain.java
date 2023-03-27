package EmployeeWage.controller;



import java.util.Scanner;

import EmployeeWage.model.EmployeeWagePojo;







public class EmployeeWageMain 
{
private static Scanner userInput = new Scanner(System.in);
	
	public static EmployeeWagePojo getDetails() {
		EmployeeWagePojo employeePojo = new EmployeeWagePojo();
		
		System.out.println("Enter Employee Name");
		employeePojo.setEmployeeName(userInput.next());
		
		
		System.out.println("Enter netPay");
		employeePojo.setNetPay(userInput.nextInt());

//		System.out.println("Enter city");
//		employeePojo.setCity(userInput.next());
//		
//		System.out.println("Enter country");
//		employeePojo.setCountry(userInput.next());
//		
//		System.out.println("Enter phoneNumber");
//		employeePojo.setPhoneNumber(userInput.nextLong());
//		
//		System.out.println("Enter department");
//		employeePojo.setDepartment(userInput.next());
//		
//		System.out.println("Enter basicPay");
//		employeePojo.setBasicPay(userInput.nextInt());
//		
//		System.out.println("Enter deductions");
//		employeePojo.setDeductions(userInput.nextInt());
//		
//		System.out.println("Enter taxAblePay");
//		employeePojo.setTaxAblePay(userInput.nextInt());
//		
//		System.out.println("Enter tax");
//		employeePojo.setTax(userInput.nextInt());
//		
//		System.out.println("Enter address");
//		employeePojo.setAddress(userInput.next());
		
		return employeePojo;
	}

}	
