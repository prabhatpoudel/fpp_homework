package lesson5;

public interface Employee {
	final int baseSalary=10;
	final int bonus =2;
	final int extrahour =15;
	
	default public void getEmpolyeeDetails(String Employeename, String Employeeid, String SSN, String  DOB, String Address)
	{
		System.out.println("Employee Name: "+Employeename);
		System.out.println("Employee ID: "+Employeeid);
		System.out.println("Employee SSN: "+SSN);
		System.out.println("Employee DOB: "+DOB);
		System.out.println("Employee Address: "+Address);
	}
	
	public double calculateSalary() ;



}
