package org.testing;

public class EmployeeDetails {
	
	//method name
	private void empName() {
		
		//business logic
		System.out.println("Greens Tech");		
	}
	
	private void empLoc() {
		
		System.out.println("Chennai");
	}
	
	private void empMob() {
		System.out.println("1234567890");

	}
	
	// Main Method 
	public static void main(String[] args) {	
		//classname objname=new Classname();
		
		EmployeeDetails e = new EmployeeDetails();    //---> Object Creation
		
		e.empName();
		e.empLoc();
		e.empMob();	
	}

}
