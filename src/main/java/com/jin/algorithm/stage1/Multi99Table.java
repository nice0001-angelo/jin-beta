/**
 * 
 */
package com.jin.algorithm.stage1;

/**
 * @author njh
 *
 */
public class Multi99Table {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("=============99============");
		
		try {
			for(int i=1; i<=2	; i++) {
				for(int j=1; j<=9; j++) {
					System.out.printf("%3d", i*j);
				}
				System.out.println();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
