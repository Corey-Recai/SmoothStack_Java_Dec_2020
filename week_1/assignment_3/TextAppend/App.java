/**
 * 
 */
package com.ss.basics.TextAppend;

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
		DataProcessor file = new FileHandler((System.getProperty("user.dir") + "/src/resources/File_1.txt"));
		file.displayFileContent();
		file.writeFileContent("Here is some text to add to the document.");
		file.displayFileContent();

	}

}
