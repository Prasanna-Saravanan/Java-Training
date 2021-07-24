package com.zoho.training.level1.methodoverriding;

/**
 * This is the Child class which extends the Parent Class and it is mainly
 * implemented to understand the concept of method overriding
 * 
 * @author DELL
 *
 */
public class Child extends Parent {

	/**
	 * This is an Overriden method
	 */
	@Override
	public void display() {
		System.out.println("Inside Child Display Method");
	}

}
