package lesson5;

import java.util.Scanner;

public class Rectangle extends Shape{

	private double width;
	private double height;
	String state;
	private String Shape="Rectangle";
	
	
	public Rectangle ()
	{
		readShapeData();
		System.out.println("This is :"+getShapeName());
		System.out.println("Area is: "+computeArea());
		System.out.println("Perimeters: "+computePerimeter());
//		this.width=inWidth;
//		this.height=inHeight;
	}
	
	@Override
	public String getShapeName() {
		// TODO Auto-generated method stub
		return Shape;
	}

	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return width*height;
	}

	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return (2*width)+(2*height);
	}

	@Override
	public void readShapeData() {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Width: ");
		 this.width= input.nextDouble();
		System.out.println("Enter the Height: ");		
		 this.height= input.nextDouble();
		input.close();
		
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		state= "Shape is: "+Shape;
		return state;
	}
	

}
