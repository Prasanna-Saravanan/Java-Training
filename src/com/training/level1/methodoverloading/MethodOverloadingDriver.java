package com.zoho.training.level1.methodoverloading;

/**
 * This class is an Driver Class for an MethodOverloading class
 * 
 * @author DELL
 *
 */
public class MethodOverloadingDriver {

	public static void main(String[] args) {
		MethodOverloading methodOverloading = new MethodOverloading();

		System.out.println(methodOverloading.multiple(10, 2));
		System.out.println(methodOverloading.multiple(30, 3, 10));
	}

}
