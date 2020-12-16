/**
 * 
 */
package com.ss.basics.TextAppend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author coreyrecai
 *
 */
public class FileHandler implements DataProcessor {
	private String filePath;

	public FileHandler(String filePath) {
		this.filePath = filePath;
	}

	public StringBuffer getFileContent() {
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
		return fileContent;
	}

	@Override
	public void displayFileContent() {

		System.out.println("Here is the text that your file contains:\n\n");

		System.out.println(getFileContent());

	}

	@Override
	public void writeFileContent(String userContent) {
		StringBuffer fileContent = getFileContent();
		fileContent.append((userContent + System.lineSeparator()));
		String[] fileLines = fileContent.toString().split(System.lineSeparator());
		try {
			FileWriter userFile = new FileWriter(filePath);
			for (String s : fileLines) {
				userFile.write((s + System.lineSeparator()));
			}
			userFile.close();
			System.out.println("\n\n*********************************** \n" + "*********************************** \n"
					+ "Successfully wrote to the file. \n" + "*********************************** \n"
					+ "*********************************** \n\n");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}
