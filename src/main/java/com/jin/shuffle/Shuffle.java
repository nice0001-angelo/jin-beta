/**
 * 
 */
package com.jin.shuffle;

import java.util.*;

/**
 * @author njh
 *
 */
public class Shuffle {

	/**
	 * @param args
	 */
	
	private static final int SIZE_DECK = 52;
	
	public static void main(String[] args) {
		ArrayList<Integer> deck = new ArrayList<Integer>();
		
		for(int i=0; i<SIZE_DECK; ++i) {
			deck.add(i);
		}
		System.out.println(deck);
		System.out.println(deck.size());
		
		ArrayList<Integer> shuffledDeck = new ArrayList<Integer>();
		
		double ran = Math.random();
		int index =  (int)(ran*deck.size());
		System.out.println(ran);
		System.out.println(index);
	}

}
