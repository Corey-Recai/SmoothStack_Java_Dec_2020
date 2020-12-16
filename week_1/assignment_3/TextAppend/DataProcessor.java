/**
 * 
 */
package com.ss.basics.TextAppend;

/**
 * @author coreyrecai
 *
 */
public interface DataProcessor {
	public StringBuffer getFileContent();

	public void displayFileContent();

	void writeFileContent(String userContent);

}
