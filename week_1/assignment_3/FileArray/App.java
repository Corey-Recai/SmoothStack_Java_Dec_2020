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
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Directory files = new Files((System.getProperty("user.dir") + "/src/resources"));
		files.display();

	}

}
