package com.zoho.training.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * This class is an example class for sorting the list using collections class
 * and to display the largest and smaller number in the List.
 * 
 * @author DELL
 *
 */
public class ListSorting {

	/**
	 * This method is used to get the input from the user and to add it into the
	 * list and to call the sortAndDisplay method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int noOfIntegers;
		ListSorting listSorting = new ListSorting();
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();

		System.out.println("Enter the no of integers want to add into the List");
		noOfIntegers = sc.nextInt();
		for (int i = 0; i < noOfIntegers; i++) {
			list.add(sc.nextInt());
		}
		listSorting.sortAndDisplay(list);
		sc.close();
	}

	/**
	 * This method is used to sort the list using Collections and to display the
	 * smaller and larger number
	 * 
	 * @param list Accept the List of Integers
	 */
	public void sortAndDisplay(List<Integer> list) {

		Collections.sort(list);
		System.out.println("Sorted List= " + list);
		System.out.println("Smaller Number= " + list.get(0));
		System.out.println("Larger Number= " + list.get(list.size() - 1));
	}

}
