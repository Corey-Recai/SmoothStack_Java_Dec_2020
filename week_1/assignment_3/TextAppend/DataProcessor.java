/**
 * 
 */
package com.ss.basics.TextAppend;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * @author coreyrecai
 *
 */
public interface DataProcessor {
	public ArrayList<String> getFileContent();

	public void displayFileContent();

	void writeFileContent(String userContent);

}
