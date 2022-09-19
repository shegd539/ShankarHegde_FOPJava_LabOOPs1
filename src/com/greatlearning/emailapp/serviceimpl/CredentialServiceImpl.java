/**
 * 
 */
package com.greatlearning.emailapp.serviceimpl;

import java.util.Random;

import com.greatlearning.emailapp.model.Employee;
import com.greatlearning.emailapp.service.CredentialService;

/**
 * @author Shankar Hegde
 *
 */
public class CredentialServiceImpl implements CredentialService{

	private String empDomain;
	
	public CredentialServiceImpl(String empDomain) {
		this.empDomain=empDomain;
	}
	
	
	@Override
	public String genarateEmailId(String empFName, String empLName, String empDepartment) {
		//For to genarate employee email address
		String genaratedEmailId=empFName+empLName+"@"+empDepartment+"."+empDomain;
		
		return genaratedEmailId;
	}

	@Override
	public String genaratePassword() {
		//For to genarate employee Password
		
		Random randomNr=new Random();
		StringBuilder stringBuilder=new StringBuilder();
		for(int count=0;count<8;count++) {
			int number=randomNr.nextInt(127-32)+32;
			
			stringBuilder.append((char)number);
			
		}
		
		return stringBuilder.toString();
	}

	@Override
	public void showCredentials(Employee employee) {
		System.out.println("");
		System.out.println("Dear "+employee.getEmpFirstName()+" your generated credentials are as follows");
		System.out.println("Email ---> "+employee.getEmapEmailId());
		System.out.println("Password ---> "+employee.getEmpPassword());
	}

}
