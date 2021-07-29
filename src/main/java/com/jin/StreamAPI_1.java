/**
 * 
 */
package com.jin;

import java.util.stream.*;

/**
 * @author njh
 *
 */
public class StreamAPI_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StreamAPI_1 T = new StreamAPI_1();
		T.Solution();
	}

	public void Solution() {
		//Stream API를 이용한 간단한 짝수 판별
		IntStream.range(1, 11).filter(i->i%2==0).forEach(System.out::println);
	}
}
