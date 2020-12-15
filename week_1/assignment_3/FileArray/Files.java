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

	public String[] getContent(){
		File directoryPath = new File(workingDirectory);
		String contents[] = directoryPath.list();
		
		return contents;
	}

	@Override
	public void display() {

		System.out.println("List of files and directories in the specified directory:");
		String contents[] = getContent();
		for (int i = 0; i < contents.length; i++) {
			System.out.println(contents[i]);
		}
	}

}
