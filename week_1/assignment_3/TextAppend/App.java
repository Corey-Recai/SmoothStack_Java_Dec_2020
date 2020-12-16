/**
 * 
 */
package com.ss.basics.TextAppend;

import java.io.FileNotFoundException;


/**
 * @author coreyrecai
 *
 */
public class App {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args){
		DataProcessor file = new FileHandler((System.getProperty("user.dir") + "/src/resources/File_1.txt"));
		file.displayFileContent();
		file.writeFileContent("Here is some text to add to the document.");
		file.displayFileContent();

	}

}
