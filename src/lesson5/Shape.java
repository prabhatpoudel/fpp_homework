package lesson5;

public abstract class Shape {
	final String shapeName = "Circle";

	public abstract String getShapeName();

	public abstract String toString();

	public abstract double computeArea();

	public abstract double computePerimeter();

	public abstract void readShapeData();

}
