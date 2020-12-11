/**
 * 
 */
package com.ss.basics.FileArray;

import java.io.File;
import java.util.ArrayList;

/**
 * @author coreyrecai
 *
 */
public class Files implements Directory {
	private String workingDirectory;

	public Files(String workingDirectory) {
		this.workingDirectory = workingDirectory;
	}

	public ArrayList<String> getContent(){
		File directoryPath = new File(workingDirectory);
		ArrayList<String> Files = new ArrayList<String>();
		String contents[] = directoryPath.list();
		for(int i=0; i<contents.length; i++) {
	           Files.add(contents[i]);
	        }
		
		return Files;
	}

	@Override
	public void display() {

		System.out.println("List of files and directories in the specified directory:" + getContent());

	}

}
