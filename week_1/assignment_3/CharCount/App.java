/**
 * 
 */
package com.ss.basics.CharCount;

/**
 * @author coreyrecai
 *
 */
public class App {

	/**
	 * @param args
	 *
	 */
	public static void main(String[] args) {
		DataProcessor file = new FileHandler((System.getProperty("user.dir") + "/src/resources/File_1.txt"), 'e');
		file.displayCharCount();
		

	}

}
