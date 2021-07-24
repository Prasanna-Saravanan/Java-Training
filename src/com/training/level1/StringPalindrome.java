package com.zoho.training.level1;

import java.util.Scanner;

/**
 * This class is used to reverse the string and to check whether the string is
 * palindrome or not
 * 
 * @author DELL
 *
 */
public class StringPalindrome {

	public static void main(String[] args) {
		StringPalindrome stringPalindrome = new StringPalindrome();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String");
		stringPalindrome.reverseAndCheckPalindrome(sc.nextLine());
		sc.close();

	}

	/**
	 * This method takes the string as a parameter and reverse the string and prints
	 * whether the string is palindrome or not
	 * 
	 * @param str
	 */
	public void reverseAndCheckPalindrome(String str) {
		char[] stringInArray = str.toCharArray();
		int stringLength = str.length();
		char tempChar;
		boolean isPalindrome = true;

		for (int i = 0; i < stringLength / 2; i++) {
			if (stringInArray[i] != stringInArray[stringLength - i - 1]) {
				isPalindrome = false;
				tempChar = stringInArray[i];
				stringInArray[i] = stringInArray[stringLength - i - 1];
				stringInArray[stringLength - i - 1] = tempChar;
			}
		}

		String reverseString = new String(stringInArray);
		System.out.println("Orginal String: " + str);
		System.out.println("Reversed String " + reverseString);
		if (isPalindrome) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("String is not a Palindrome");
		}

	}

}
