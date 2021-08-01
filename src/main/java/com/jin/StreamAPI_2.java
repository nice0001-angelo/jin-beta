/**
 * 
 */
package com.jin;

import java.util.stream.*;

/**
 * @author njh
 *
 */
public class StreamAPI_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//0~1000까지의 값중에 500이상이면서 2와 5로 나눠지는 배수의 합을 구하여라
		System.out.println(
				IntStream.range(0, 1001).skip(500).filter(i->i%2==0).filter(i->i%5==0).sum()
				);
		System.out.println();
		System.out.println();
	}
}
