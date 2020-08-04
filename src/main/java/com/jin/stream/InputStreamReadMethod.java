/**
 * 
 */
package com.jin.stream;

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
		InputStream is = new FileInputStream("C:\\Temp/test2.txt");
		
		byte[] buffer = new byte[5];
		
		int readByteNum = is.read(buffer,2,3);
		
		if (readByteNum != -1) {
			for(int i=0; i<readByteNum; i++) {
				System.out.println(buffer[i]);
			}
		}
		System.out.println("End of read");
		is.close();
	}

}
