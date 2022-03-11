/**
 * 
 */
package inflearn.javaalgorithm.string;

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
		TreeSet<Student> set = new TreeSet<Student>();
		set.add(new Student(1,"A"));
		set.add(new Student(2,"B"));
		set.add(new Student(1,"A"));
		set.add(new Student(1,"C"));
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
	
	public String toString(){
		return id+":"+name;
	}

}