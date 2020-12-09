/**
 * 
 */
package com.ss.basics.shapes;

/**
 * @author coreyrecai
 *
 */
public class Triangle implements Shape{
	private int height;
	private int base;

	public Triangle(int height, int base) {
		this.height = height;
		this.base = base;
	}
	@Override
	public double calculateArea() {
		double area = (base* height)/2;
		return area;
	}

	@Override
	public void display() {
		System.out.println("The area of the triangle is: " + calculateArea());
		
	}

}
