/**
 * 
 */
package com.ss.basics.MaxArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @author coreyrecai
 *
 */
public class App {
	/**
	 * @param args
	 */
	static Random rand = new Random(); // instance of random class
	static int upperbound = 10;
	// generate random values from 0-24
	static int n = rand.nextInt(upperbound);

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>(10);
		for (int i = 0; i < n; i++) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a number:");
			int userNumber = scanner.nextInt();
			numbers.add(userNumber);
		}
		Integer maxValue = Collections.max(numbers);
		Integer indexPosition = numbers.indexOf(maxValue);
		System.out.println("The max of all numbers is: " + maxValue + ". The index postion of the max is: " + indexPosition);
	}

}
