package com.zoho.training.level1;

import java.util.Scanner;

/**
 * This is an Pattern Printer class
 * @author DELL
 *
 */
public class PatternPrinter1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PatternPrinter1 pattern = new PatternPrinter1();
		
		pattern.printPattern(sc.nextInt());
		sc.close();

	}

	/**
	 * This method is used to print the pattern like 
	 * 1 
	 * 2 3 
	 * 4 5 6
	 * 
	 * @param noOfRows Accepts the no of rows
	 */
	public void printPattern(int noOfRows) {
		int flag = 0;

		for (int i = 0; i < noOfRows; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(++flag + " ");
			}
			System.out.println();
		}
	}

}
