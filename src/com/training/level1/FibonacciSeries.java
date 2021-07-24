package com.zoho.training.level1;

import java.util.Scanner;

/**
 * This class is used to print the fibonacci series
 * 
 * @author DELL
 *
 */
public class FibonacciSeries {

	public static void main(String[] args) {
		FibonacciSeries fibonacci = new FibonacciSeries();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number for upto which Fibonacci Series Needed : ");
		fibonacci.printFibonacciSeries(sc.nextInt());
		sc.close();
	}

	/**
	 * This method prints the fibonacci series by using while loop
	 * 
	 * @param number
	 */
	public void printFibonacciSeries(int number) {
		int flag = 0;
		int flag1 = 1;
		int flag2 = 1;

		do {
			System.out.println(flag);
			flag1 = flag2;
			flag2 = flag;
			flag = flag1 + flag2;
		} while (flag <= number);

	}

}
