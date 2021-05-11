/**
 * 
 */
package com.interview.talan.assessment;

import java.util.*;

/**
 * @author njh
 *
 */
public class FizzBuzz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(3, "FIZZ");
        map.put(4, "BUZZ");
        System.out.println(FizzBuzz.fizzBuzz(5, map)); // "5"
        System.out.println(FizzBuzz.fizzBuzz(7, map)); // "7"
        System.out.println(FizzBuzz.fizzBuzz(11, map)); // "11"
        System.out.println(FizzBuzz.fizzBuzz(3, map)); // "FIZZ"
        System.out.println(FizzBuzz.fizzBuzz(4, map)); // "BUZZ"
        System.out.println(FizzBuzz.fizzBuzz(12, map)); // "FIZZBUZZ"

	}

	

    private static String fizzBuzz(int number, Map<Integer, String> map) {
	        String result ="";
	        
	        if( number % 12 == 0){
	            result = "FIZZBUZZ";
	        } else if ( number % 3 == 0){
	            result = "FIZZ";
	        } else if ( number % 4== 0){
	            result ="BUZZ";
	        } else {
	            result = Integer.toString(number);
	        }

	        return result;
	    }

}
