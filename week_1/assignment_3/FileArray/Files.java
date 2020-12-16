/**
 * 
 */
package com.ss.basics.FileArray;

import java.io.File;

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
		String fileList[] = directoryPath.list();
		
		return fileList;
	}

	@Override
	public void display() {

		System.out.println("List of files and directories in the specified directory:");
		String fileList[] = getContent();
		for (int i = 0; i < fileList.length; i++) {
			System.out.println(fileList[i]);
		}
	}

}
