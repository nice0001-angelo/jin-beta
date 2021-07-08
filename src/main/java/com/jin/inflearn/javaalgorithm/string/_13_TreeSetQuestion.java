/**
 * 
 */
package com.jin.inflearn.javaalgorithm.string;

import java.util.*;

/**
 * @author njh
 *
 */
public class _13_TreeSetQuestion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<Student> set = new TreeSet<Student>();
		
		set.add(new Student(1,"A"));
		
		System.out.println(set);
		
	}

}

class Student {
	int id;
	String name;
	
	Student(int id, String name){
		this.id = id;
		this.name = name;
	}
}