/**
 * 
 */
package com.ss.basics.randomNumbers;

import java.util.Objects;
import java.util.Random;

import java.util.Scanner;

/**
 * @author coreyrecai
 *
 */
public class GenerateNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO
		Random randNum = new Random();
		int upperBound = 100;
		int intRandom = randNum.nextInt(upperBound);
		int userNum = intRandom;
		int userMin = (userNum - 10);
		int userMax = (userNum + 10);
		System.out.println(
				"Your number is: " + userNum + "\n" + "Please guess a number between " + userMin + " and " + userMax);

		Scanner userContinue = new Scanner(System.in);
		System.out.println("Ready to continue (y/n)?");
		String userResponse = userContinue.nextLine();

		if (Objects.equals(userResponse, "n")) {
			Scanner newUserContinue = new Scanner(System.in);
			System.out.println("Ready to continue (y/n)?");
			userResponse = newUserContinue.nextLine(); 
		}
		if (Objects.equals(userResponse, "y")) {
			Scanner checkGuess = new Scanner(System.in);
			int sysGuess = (int) (Math.random() * ((userMax - userMin) + 1) + userMin);
			System.out.println(sysGuess);
			System.out.println("Is this your number (y/n)?");
			String guessValid = checkGuess.nextLine(); 
			for (int i = 0; i < 4; i++) {

				if (Objects.equals(guessValid, "y")) {
					System.out.println("I am so smart.");
					break;
				}
				Scanner checkNewGuess = new Scanner(System.in);
				int newGuess = (int) (Math.random() * ((userMax - userMin) + 1) + userMin);
				System.out.println(newGuess);
				System.out.println("Is this your number (y/n)?");
				guessValid = checkNewGuess.nextLine();
			}

		}
	}

}
