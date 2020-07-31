/**
 * 
 */
package com.jin;

/**
 * @author njh
 *
 */
public class TryCatchFinallyRuntimeException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		try {
			data1 = args[0];
			data2 = args[1];
		} catch (Exception e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			return;
		}

	}

}




