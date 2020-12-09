/**
 * 
 */
package com.ss.basics.shapes;

/**
 * @author coreyrecai
 *
 */
public class CreateShape {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Shape circle = new Circle(10);
		circle.display();
		
		Shape rectangle = new Rectangle(10,20);
		rectangle.display();
		
		Shape triangle = new Triangle(20,30);
		triangle.display();

	}

}
