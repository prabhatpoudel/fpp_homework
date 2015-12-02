package lesson5;

import java.util.Scanner;

public class Triangle extends Shape {

	private double base;
	private double height;

	String state;
	// private String Shape="Circle";

	public Triangle() {
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
		return height * base / 2;
	}

	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return base + height + Math.sqrt(base * base + height * height);
	}

	@Override
	public void readShapeData() {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Base: ");
		this.base = input.nextDouble();
		System.out.println("Enter the Height: ");
		this.height = input.nextDouble();
		input.close();

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub

		state = Circle.class.getName().substring(8);
		return state;
	}

}