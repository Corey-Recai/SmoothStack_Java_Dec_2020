/**
 * 
 */
package com.ss.basics.randomNumbers;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author coreyrecai
 *
 */
public class PrintSequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create a new empty list to contain stars
		ArrayList<String> stars = new ArrayList<String>(5);
		// Create a String variable for star
		String x = "*";
		// Print the number of the pattern in the sequence
		System.out.println("1)");
		// Create the for loop to iteratively print each star and append to list
		for (int i = 0; i < 4; i++) {
			stars.add(x);
			System.out.println(x);
			x = (String) (x + "*");
		}
		// Print sequence separator
		stars.add(".........");
		System.out.println(".........");

		// Print number for pattern in sequence
		System.out.println("2)");
		// Reverse the order of the first list
		Collections.sort(stars, Collections.reverseOrder());
		// Create a for loop to iteratively print the list in reverse order
		for (String i : stars) {
			System.out.println(i);
		}

		// Create a new empty list to contain triangle sequence stars
		ArrayList<String> triStars = new ArrayList<String>(5);
		// Create a String variable for star
		String y = "    *";
		// Print the number of the pattern in the sequence
		System.out.println("3)");
		// Create the for loop to iteratively print each star and append to list
		for (int i = 0; i < 4; i++) {
			triStars.add(y);
			System.out.println(y);
			y = (String) (y.replaceFirst("\\s", "") + "**");
		}
		// Print sequence separator
		triStars.add("..........");
		System.out.println("..........");

		// Print number for pattern in sequence
		System.out.println("4)");
		// Reverse the order of the first list
		Collections.sort(triStars, Collections.reverseOrder());
		// Create a for loop to iteratively print the list in reverse order
		for (String i : triStars) {
			System.out.println(i);
		}

	}
}
