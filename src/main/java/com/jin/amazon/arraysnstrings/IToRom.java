/**
 * 
 */
package com.jin.amazon.arraysnstrings;

import ch.qos.logback.core.net.*;

/**
 * @author njh
 *
 */
public class IToRom {

	/**
	 * @param args
	 */
	private static final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	private static final String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

	
	public static void main(String[] args) {

		String result = integerToRoman(234);
		System.out.println("result: "+result);
		
		
	}

	
	public static String integerToRoman(int num) {
		StringBuilder sb = new StringBuilder();
		
		//Loop through each symbol, stopping if num becomes 0.
		for(int i = 0; i < values.length && num > 0; i++) {
			//Repeat while the current symbol still fits into num.
			while(values[i] <= num) {
				num -= values[i];
				sb.append(symbols[i]);
			}
		}
		return sb.toString();
	}
}
