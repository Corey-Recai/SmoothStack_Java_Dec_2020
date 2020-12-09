/**
 * 
 */
package com.ss.basics.shapes;

/**
 * @author coreyrecai
 *
 */
public class Circle implements Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		// Area = PI*radius*radius
		double area = Math.PI * (radius * radius);
		
		return area;

	}

	@Override
	public void display() {
		System.out.println("The area of the circle is: " + calculateArea());
	}

}
