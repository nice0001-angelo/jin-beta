/**
 * 
 */
package com.jin;

import java.io.FileWriter;
import java.io.Writer;

/**
 * @author njh
 *
 */
public class WriterWriteMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		Writer writer = new FileWriter("C:\\Temp/test7.txt");
		
		char a = 'A';
		char b = 'B';
		char c = 'C';
		
		writer.write(a);
		writer.write(b);
		writer.write(c);
		
		writer.flush();
		writer.close();

	}

}
