package com.zoho.training.level1.inheritence;

/**
 * This class extends the Shape method and implements the getPerimeter and
 * getArea for Triangle
 * 
 * @author DELL
 *
 */
public class Triangle extends Shape {

	private double base;
	private double height;
	private double side1;
	private double side2;

	public Triangle() {
		super();
		this.shape = "Triangle";
	}

	public Triangle(double base, double height, double side1, double side2) {
		super();
		this.shape = "Triangle";
		this.base = base;
		this.height = height;
		this.side1 = side1;
		this.side2 = side2;
	}

	/**
	 * This method calculates the area and assign it to the area variable.
	 */
	@Override
	public double getArea() {
		area = height * base / 2;
		return area;
	}

	/**
	 * This method calculates the perimeter and assign it to the perimeter variable.
	 */
	@Override
	public double getPerimeter() {
		perimeter = side1 + side2 + base;
		return perimeter;
	}

	/**
	 * This method print the details of the Triangle.
	 */
	@Override
	public void printDetails() {

		System.out.println("Side1 of a Triangle= " + side1);
		System.out.println("Side2 of a Triangle= " + side2);
		System.out.println("Base of a Triangle= " + base);
		System.out.println("Height of a Triangle= " + height);
		System.out.println("Area of the Triangle= " + getArea());
		System.out.println("Perimeter of the Triangle= " + getPerimeter());

	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

}
