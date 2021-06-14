/**
 * 
 */
package com.interveiw.amazon.assessment;

import java.util.*;

/**
 * @author njh
 *
 */
public class Encode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println("Pirnt");
		System.out.println(encode(str));
	}

	static String encode(String input) {
		//validation check
		if(input == null|| input.length()==0) {
			return "Please enter String value";
		}
		StringBuilder sb = new StringBuilder();
		char[] inputArray = input.toCharArray();
		char prevArray = 0;
		int counter = 0;
		for(char c: inputArray) {
			//System.out.println(c);
			if(c==prevArray) {
				counter++;
			}else if(prevArray!=0){
				sb.append(counter).append(prevArray);
				prevArray = c;
				counter = 1;
			}
		}
		sb.append(counter).append(prevArray);
		sb.append(counter).append(prevArray);
		sb.append(counter).append(prevArray);
		return sb.toString();
	}
}
