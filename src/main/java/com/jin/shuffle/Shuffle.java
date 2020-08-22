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
	
	private static final int SIZE_DECK = 52	;
	
	public static void main(String[] args) {
		ArrayList<Integer> deck = new ArrayList<Integer>();
		
		for(int i=0; i<SIZE_DECK; ++i) {
			deck.add(i);
		}
		System.out.println("before deck: " + deck);
		
		
		ArrayList<Integer> shuffledDeck = new ArrayList<Integer>();
		
		while(deck.size() > 0) {
			double ran = Math.random();		
			int index =  (int)(ran*deck.size());
			shuffledDeck.add(deck.remove(index));
		}
		System.out.println("after deck: " + deck);
		System.out.println("shuffledDeck: "+shuffledDeck);
		
	}

}
