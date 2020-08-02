/**
 * 
 */
package com.jin;

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
		OutputStream os = new FileOutputStream("C:\\Temp/test1.txt");
		
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		os.write(a);
		os.write(b);
		os.write(c);
		
		os.flush();
		os.close();
		
		System.out.println("FileOutputStream End");
	}

}
