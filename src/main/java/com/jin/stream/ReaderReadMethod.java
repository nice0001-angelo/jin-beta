/**
 * 
 */
package com.jin.stream;

import java.io.FileReader;
import java.io.Reader;

/**
 * @author njh
 *
 */
public class ReaderReadMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:\\Temp/test9.txt");

		char[] buffer = new char[5];

		int readCharNum = reader.read(buffer, 2, 3);
		if (readCharNum != -1) {
			for (int i = 0; i < buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}
		reader.close();

	}

}
