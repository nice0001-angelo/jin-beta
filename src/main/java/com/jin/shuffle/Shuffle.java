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
	private static final int DECK_SIZE = 52;		
	
	public static void main(String[] args) {
		ArrayList<Integer> deck = new ArrayList<>();
		
		for(int i=0; i<DECK_SIZE; ++i) {
			deck.add(i);
		}
		
		Collections.shuffle(deck);
		
		System.out.println(deck);
	}

}
