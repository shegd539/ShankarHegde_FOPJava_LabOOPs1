/**
 * 
 */
package com.greatlearning.emailapp.service;

import com.greatlearning.emailapp.model.Employee;

/**
 * @author Shankar Hegde
 *
 */
public interface CredentialService {

	public String genarateEmailId(String empFName,String empLName,String empDepartment);
	public String genaratePassword();
	public void showCredentials(Employee employee);
	
}
