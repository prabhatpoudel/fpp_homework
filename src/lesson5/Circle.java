package lesson5;

import java.util.Scanner;

public class Circle extends Shape {

	private double radius;

	String state;
	// private String Shape="Circle";

	public Circle() {
		readShapeData();
		// System.out.println("This is :"+getShapeName());
		// System.out.println("Area is: "+computeArea());
		// System.out.println("Perimeters: "+computePerimeter());
		// this.width=inWidth;
		// this.height=inHeight;
	}

	@Override
	public String getShapeName() {
		// TODO Auto-generated method stub
		return toString();
	}

	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}

	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * radius;
	}

	@Override
	public void readShapeData() {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Radius: ");
		this.radius = input.nextDouble();
		input.close();

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub

		state = state = Circle.class.getName().substring(8);
		return state;
	}

}