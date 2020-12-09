/**
 * 
 */
package com.ss.basics.SumArray;

import java.util.ArrayList;
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
		int sum = numbers.stream().mapToInt(Integer::intValue).sum();
		System.out.println("The sum of all numbers is: " + sum);
	}

}
