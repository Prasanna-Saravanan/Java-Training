package com.zoho.training.level1.inheritence;

public abstract class Shape {

	public String shape;
	public double area;
	public double perimeter;

	public abstract double getArea();

	public abstract double getPerimeter();
	
	public abstract void printDetails();

}
