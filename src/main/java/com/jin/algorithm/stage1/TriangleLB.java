/**
 * 
 */
package com.jin.algorithm.stage1;

import java.util.*;

/**
 * @author njh
 *
 */
public class TriangleLB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		
		System.out.println("Please input the number: ");
		n = input.nextInt();
		
		
		triLB(n);
	}

	static void triLB(int n) {
		try {
			for(int i=0;i <= n;i++) {
				for(int j=0;j<=i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println("Exception from jimmy thanks no worry be happy virus~!: "+e );
		}
	}
}
