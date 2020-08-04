/**
 * 
 */
package com.jin;

import java.io.FileOutputStream;

/**
 * @author njh
 *
 */
public class CharacterConvertStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		write("문자변환 스트림을 사용합니다");
		String data = read();
		System.out.println(data);
	}
	
	public static void write(String str) throws Exception{
		FileOutputStream fos = new FileOutputStream("C:\\Temp/test9.txt");
	}
	
	public static String read() throws Exception {
		String data = new String(buffer, 0, readCharNum);
		return data;
	}

}
