/**
 * 
 */
package com.jin;

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
		Reader reader = new FileReader("C:\\Temp/test7.txt");
		while (true) {
			int data = reader.read();
			if (data == -1) {
				break;
			}
			System.out.println((char) data);
		}
		reader.close();
	}

}
