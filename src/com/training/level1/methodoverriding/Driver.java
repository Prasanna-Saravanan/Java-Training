package com.zoho.training.level1.methodoverriding;

/**
 * This is the Driver method which is used to call the overridden methods
 * 
 * @author DELL
 *
 */
public class Driver {

	public static void main(String[] args) {

		Parent parent = new Parent();
		Child child = new Child();
		Parent parent1 = new Child(); /*
										 * The reference variable is created for parent but it referring to the object
										 * of Child so when the display method is called only overridden method will be
										 * called.
										 */
		parent.display();
		child.display();
		parent1.display();

	}

}
