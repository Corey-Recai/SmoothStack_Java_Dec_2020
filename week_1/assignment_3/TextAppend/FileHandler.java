/**
 * 
 */
package com.ss.basics.TextAppend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
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

	public ArrayList<String> getFileContent() {
		ArrayList<String> fileContent = new ArrayList<String>();
		try {
			File fileObj = new File(filePath);
			Scanner fileData = new Scanner(fileObj);
			while (fileData.hasNextLine()) {
				String data = fileData.nextLine();
				fileContent.add((data + "\n"));
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

		System.out.println("Here is the text that your file contains:");
		ArrayList<String> fileContent = getFileContent();
		for (int i = 0; i < fileContent.size(); i++) {
			System.out.println(fileContent.get(i));
		}
	}

	@Override
	public void writeFileContent(String userContent) {
		ArrayList<String> fileContent = getFileContent();
		fileContent.add((userContent + "\n"));
		try {
			FileWriter userFile = new FileWriter(filePath);
			for (int i = 0; i < fileContent.size(); i++) {
				userFile.write(fileContent.get(i));
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
