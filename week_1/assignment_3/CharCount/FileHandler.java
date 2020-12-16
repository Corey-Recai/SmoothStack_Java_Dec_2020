/**
 * 
 */
package com.ss.basics.CharCount;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author coreyrecai
 *
 */
public class FileHandler implements DataProcessor {
	private String filePath;
	private char searchChar;

	public FileHandler(String filePath, char searchChar) {
		this.filePath = filePath;
		this.searchChar = searchChar;
	}

	public Object[] getCharCount() {
		StringBuffer fileContent = new StringBuffer();
		try {
			File fileObj = new File(filePath);
			Scanner fileData = new Scanner(fileObj);
			while (fileData.hasNextLine()) {
				String data = fileData.nextLine();
				fileContent.append((data + System.lineSeparator()));
			}
			fileData.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		
		 int count = 0;

		    for(int i=0; i < fileContent.length(); i++)
		    {    if(fileContent.charAt(i) == searchChar)
		            count++;
		    }
		  
		   Object[] charInfo = {searchChar, count};
		return charInfo;
	}

	@Override
	public void displayCharCount() {

		System.out.println("The character " + getCharCount()[0] + " appears " + getCharCount()[1] + " times in your file.");


	}


}
