package com.zoho.training.level1.inheritence;

/**
 * This class extends the Shape method and implements the getPerimeter and
 * getArea for Circle
 * 
 * @author DELL
 *
 */
public class Circle extends Shape {

	private float radius;

	public Circle() {
		this.shape = "Circle";
	}

	public Circle(float radius) {
		this.radius = radius;
	}

	/**
	 * This method calculates the area and assign it to the area variable.
	 */
	@Override
	public double getArea() {
		area = Math.PI * radius * radius;
		return area;
	}

	/**
	 * This method calculates the perimeter and assign it to the perimeter variable.
	 */
	@Override
	public double getPerimeter() {
		perimeter = 4 * Math.PI * radius;
		return perimeter;
	}

	/**
	 * This method print the details of the square.
	 */
	@Override
	public void printDetails() {

		System.out.println("Radius of a Circle = " + radius);
		System.out.println("Area of the Circle= " + getArea());
		System.out.println("Circumference of the Circle = " + getPerimeter());

	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

}
