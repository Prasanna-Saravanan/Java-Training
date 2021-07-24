package com.zoho.training.level1.inheritence;

/**
 * This is the driver class which is used to create objects and to call the
 * respective methods
 * 
 * @author DELL
 *
 */
public class Driver {

	public static void main(String[] args) {

		Square square = new Square(10);
		Triangle triangle = new Triangle(1, 2, 1, 1);
		Circle circle = new Circle(4);
		Shape circle1 = new Circle(5);

		square.printDetails();
		System.out.println();
		triangle.printDetails();
		System.out.println();
		circle.printDetails();
		System.out.println();
		circle1.printDetails();

	}

}
