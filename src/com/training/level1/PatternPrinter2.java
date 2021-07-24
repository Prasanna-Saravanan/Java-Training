package com.zoho.training.level1;

import java.util.Scanner;

/**
 * This is the pattern printer class
 * @author DELL
 *
 */
public class PatternPrinter2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PatternPrinter2 pattern = new PatternPrinter2(); 
		
		pattern.printPattern(sc.nextInt());
		sc.close();

	}

	/**
	 * This method is used to print a pattern like
	 * 
	 * 9 9 9 9 9 
	 * 7 7 7 7 
	 * 5 5 5 
	 * 3 3 
	 * 1
	 * 
	 * @param noOfRows Accept the no of rows
	 */
	public void printPattern(int noOfRows) {
		int initialFlag = noOfRows * 2 - 1;

		for (int i = noOfRows; i > 0; i--, initialFlag -= 2) {
			for (int j = 0; j < i; j++) {
				System.out.print(initialFlag + " ");
			}
			System.out.println();
		}
	}

}
