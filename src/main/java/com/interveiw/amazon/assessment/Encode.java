/**
 * 
 */
package com.interveiw.amazon.assessment;

/**
 * @author njh
 *
 */
public class Encode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String encode(String input) {
		if(input == null|| input.length()==0) {
			return "Please enter String value";
		}
		StringBuilder sb = new StringBuilder();
		char[] inputArray = input.toCharArray();
		char prevArray = 0;
		int counter = 0;
		for(char c: inputArray) {
			if(c==prevArray) {
				counter++;
			}else if(prevArray!=0){
				sb.append(counter).append(prevArray);
				prevArray = c;
				counter = 1;
			}
		}
		sb.append(counter).append(prevArray);
		return sb.toString();
	}
}
