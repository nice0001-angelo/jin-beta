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
		Writer writer = new FileWriter("C:\\Temp/test9.txt");
		
//		char a = 'A';
//		char b = 'B';
//		char c = 'C';
//		
//		writer.write(a);
//		writer.write(b);
//		writer.write(c);
		
		char[] array = {'A','B','C','D','E'};
		
		writer.write(array,1,3);
		
		
		writer.flush();
		writer.close();

	}

}
