package com.greatlearning.emailapp.model;


/**
 * @author Shankar Hegde
 *
 */

public class Employee {
	
	private String empFirstName;
	private String empLastName;
	private String emapEmailId;
	private String empPassword;
	private String empDepartment;
		
	//Creating required argument Constructor of Employee class
		public Employee(String empFirstName, String empLastName) {
			super();
			this.empFirstName = empFirstName;
			this.empLastName = empLastName;
			
		}

		public String getEmpFirstName() {
			return empFirstName;
		}

		public void setEmpFirstName(String empFirstName) {
			this.empFirstName = empFirstName;
		}

		public String getEmpLastName() {
			return empLastName;
		}

		public void setEmpLastName(String empLastName) {
			this.empLastName = empLastName;
		}

		public String getEmapEmailId() {
			return emapEmailId;
		}

		public void setEmapEmailId(String emapEmailId) {
			this.emapEmailId = emapEmailId;
		}

		public String getEmpPassword() {
			return empPassword;
		}

		public void setEmpPassword(String empPassword) {
			this.empPassword = empPassword;
		}

		public String getEmpDepartment() {
			return empDepartment;
		}

		public void setEmpDepartment(String empDepartment) {
			this.empDepartment = empDepartment;
		}
	
	// added the getter and settor methed to attribute
	
	
	
	
}
