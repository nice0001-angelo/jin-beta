/**
 * 
 */
package com.jin;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @author njh
 *
 */
public class InputStreamReadMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:\\Temp/test1.txt");
		while (true) {
			int data = is.read();
			if (data == -1)
				break;
			System.out.println(data);
		}
		System.out.println("End of read");
		is.close();
	}

}
