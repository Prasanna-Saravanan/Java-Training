package com.zoho.training.level1.inheritence;

/**
 * This class extends the Shape method and implements the getPerimeter and
 * getArea for Square
 * 
 * @author DELL
 *
 */
public class Square extends Shape {

	private double side;

	public Square() {
		super();
		this.shape = "Square";
	}

	public Square(int side) {
		super();
		this.side = side;
		this.shape = "Square";
	}

	/**
	 * This method calculates the area and assign it to the area variable.
	 */
	@Override
	public double getArea() {
		return side * side;
	}

	/**
	 * This method calculates the perimeter and assign it to the perimeter variable.
	 */
	@Override
	public double getPerimeter() {
		return 4 * side;
	}

	/**
	 * This method print the details of the square.
	 */
	@Override
	public void printDetails() {

		System.out.println("Side of a Sqare= " + side);
		System.out.println("Area of the Square= " + getArea());
		System.out.println("Perimeter of the Square= " + getPerimeter());

	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
}
