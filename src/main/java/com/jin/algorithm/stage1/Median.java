/**
 * 
 */
package com.jin.algorithm.stage1;

/**
 * @author njh
 *
 */
public class Median {

	/**
	 * @param args
	 */
	
	static int med3(int a, int b, int c) {
		try {
			if(a>=b) {
				if(b>=c) {
					return b;
				} else if(c>=a) {
					return a;
				} else {
					return c;
				}
			} else if(a>c){
				return a;
			} else if(b>c) {
				return c;
			} else {
				return b;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
