package com.zoho.training.level1.methodoverloading;

/**
 * This class example for an Method Overloading
 * 
 * @author DELL
 *
 */
public class MethodOverloading {

	/**
	 * This method two integer and returns the multiplication of two integer
	 * 
	 * @param a
	 * @param b
	 * @return a*b
	 */
	public int multiple(int a, int b) {
		return a * b;
	}

	/**
	 * This method is overloaded version of an multiple method which takes three
	 * parameters and returns the multiplication of three parameters
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return a*b*c
	 */
	public double multiple(int a, int b, float c) { /*
													 * Eventhough the third parameter is the integer while calling the
													 * compiler automatically type promote to float
													 */
		return a * b * c;
	}

}
