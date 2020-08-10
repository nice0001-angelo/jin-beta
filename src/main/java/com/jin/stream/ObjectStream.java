/**
 * 
 */
package com.jin.stream;

import java.io.*;
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
		
		list.add(new Board(1, "title1", "content1", "writer1", new Date()));
		list.add(new Board(2, "title2", "content2", "writer2", new Date()));
		list.add(new Board(3, "title3", "content3", "writer3", new Date()));
		list.add(new Board(4, "title4", "content4", "writer4", new Date()));
		
		FileOutputStream fos = new FileOutputStream("C:\\Temp/board.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
	}
	
	
	public static List<Board> readList() throws Exception{
		
	}
}
