/**
 * 
 */
package com.jin.stream;

import java.text.*;
import java.util.*;

/**
 * @author njh
 *
 */
public class ObjectStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		writeList();
		List<Board> list = readList();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for(Board board : list) {
			System.out.println(
					board.getBno() + "\t" + board.getTitle() + "\t" +
					board.getContent() + "\t" + board.getWriter() + "\t" + 
					sdf.format(board.getDate()));
		}
	}

	public static void writeList() throws Exception{
		List<Board> list = new ArrayList<>();
	}
	
	public static List<Board> readList() throws Exception{
		
	}
}
