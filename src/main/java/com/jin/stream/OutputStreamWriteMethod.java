/**
 * 
 */
package com.jin.stream;

import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * @author njh
 *
 */
public class OutputStreamWriteMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
//		OutputStream os = new FileOutputStream("C:\\Temp/test1.txt");
//		
//		byte a = 10;
//		byte b = 20;
//		byte c = 30;
//		
//		os.write(a);
//		os.write(b);
//		os.write(c);
		
		OutputStream os = new FileOutputStream("C:\\Temp/test2.txt");
		
		byte[] array = {10,20,30,40,50};
		
		os.write(array, 1, 3);
		
		os.flush();
		os.close();
		
		System.out.println("FileOutputStream End");
	}

}
