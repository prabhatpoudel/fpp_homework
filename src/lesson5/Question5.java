package lesson5;

import java.util.Scanner;

public class Question5 {

	public static void getShape() {
		System.out.println("Enter your Choice: \n R for Rectangle \n C for Circle \n T for Triangle");
		Scanner input = new Scanner(System.in);
		String choice = input.nextLine();
		// input.close();
		Shape s1 = null;
		switch (choice) {
		case "R":
			s1 = new Rectangle();

			break;
		case "C":
			s1 = new Circle();
			break;
		case "T":
			s1 = new Triangle();
			break;
		default:
			break;

		}
		System.out.println("Area and Perimeter of " + s1.getShapeName() + " for given values are: ");
		System.out.println("Perimeter: " + s1.computePerimeter());
		System.out.println("Area: " + s1.computeArea());

	}

	public static void main(String[] args) {
		getShape();
	}

}
