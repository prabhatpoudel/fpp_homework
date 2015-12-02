package lesson5;

import java.util.Scanner;

public class Question5 {
	
		public static void getShape() 
		{
			System.out.println("Enter your Choice: \n R for Rectangle \n C for Circle \n T for Triangle");
			Scanner input = new Scanner(System.in);
			String choice = input.nextLine();
			//input.close();
			
			switch (choice){
				case "R":
					 new Rectangle();
					 
					 default: break;
					
			}
		}
	public static void main(String [] args)
	{
		getShape();
	}



}
