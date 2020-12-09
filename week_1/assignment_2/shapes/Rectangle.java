/**
 * 
 */
package com.ss.basics.shapes;

/**
 * @author coreyrecai
 *
 */
public class Rectangle implements Shape{
	private int height;
	private int width;

	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}
	@Override
	public double calculateArea() {
		double area = (width * height) ;
		return area;
	}

	@Override
	public void display() {
		System.out.println("The area of the rectangle is: " + calculateArea());
		
	}

}
