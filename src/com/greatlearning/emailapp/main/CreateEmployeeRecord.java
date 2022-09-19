package com.greatlearning.emailapp.main;

import java.util.Scanner;

import com.greatlearning.emailapp.model.Employee;
import com.greatlearning.emailapp.service.CredentialService;
import com.greatlearning.emailapp.serviceimpl.CredentialServiceImpl;

public class CreateEmployeeRecord {
	
	public static final String[] empDepartments={"Technical", "Admin", "Human Resource", "Legal"};
	public static final String[] empDepartmentCodes={"tech", "adm", "hr", "lg"};
	
	
	public static void main(String[] args) {
		
		CredentialService credentialService=new CredentialServiceImpl("gl.in");
		
		Scanner input= new Scanner(System.in);
		System.out.println("Enter Employee First Name:");
		String empFirstName=input.next();

		System.out.println("Enter Employee Last Name:");
		String empLastName=input.next();
		Employee employee=new Employee(empFirstName,empLastName);
		System.out.println("");
		System.out.println("Please Enter the Department from following ---->");
		System.out.println("");
		for(int count=1;count<=empDepartments.length;count++)
			System.out.println(count+". "+empDepartments[count-1]);
			int deptNumber=input.nextInt();
		String empEmailId=credentialService.genarateEmailId(empFirstName, empLastName, empDepartmentCodes[deptNumber-1]);
		employee.setEmapEmailId(empEmailId);
		String empPassword=credentialService.genaratePassword();
		employee.setEmpPassword(empPassword);
		credentialService.showCredentials(employee);
		
	}

}
