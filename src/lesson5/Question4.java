package lesson5;

import java.util.Scanner;

public class Question4 {
	public static void main(String [] args)
	{
		
		Employee [] obj = { new Secretary_1(100,4),new Manager(100,4,0)};
		Scanner input = new Scanner(System.in);		
		for(Employee emp: obj )
		{
			System.out.println("Enter the Details of "+emp.getClass().getName().substring(8));
			System.out.println("Please enter Name: ");
			String name=input.nextLine();
			System.out.println("Please enter ID: ");
			String ID=input.nextLine();
			System.out.println("Please enter DOB: ");
			String DOB=input.nextLine();
			System.out.println("Please Enter Address");
			String Address=input.nextLine();
			System.out.println("Please enter SSN: ");
			String SSN=input.nextLine();
			
			emp.getEmpolyeeDetails(name, ID, SSN, DOB, Address);
			System.out.println("Salary of "+emp.getClass().getName().substring(8)+ " is: "+emp.calculateSalary());
			System.out.println("****************************************");
		}
		input.close();

	}

}
