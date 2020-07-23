/*
 * This is a Jin-beta Project
 * File name : JinBetaApplication.java
 * Created by : Jinhyun
 * Created on : July 2020
 * Contents : Main Application.java
 */
package net.jin;

import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.jin.enumeration.Week;
import net.jin.utils.Board;
import net.jin.utils.Car;
import net.jin.utils.Solution;

@SpringBootApplication
public class JinBetaApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(JinBetaApplication.class, args);

		/**********************************
		 * Start of Test Code
		 *************************************/

		System.out.println();
		System.out.println("*************Start of String Class************ ");
		String re = "";
        String s = "abcde";
        int size = s.length();
        double half = (double)(size)/2;
        if (half%2 == 0) {
        	int intHalf = (int)half;
        	 //re = s.charAt(intHalf-1);
        } else {
        	int intHalf =(int)half;
        	System.out.println(s.charAt(intHalf));
        }
        	


        
		
		// String Class
		System.out.println();
		System.out.println("*************Start of String Class************ ");
		System.out.println("Hello Jinhyun");
		String str = "Hello Jinhyun";
		String result = "";

		for (int i = str.length() - 1; i > -1; i--) {
			result += str.charAt(i);
		}

		System.out.println(result);
		System.out.println("*************End of String Class************ ");

		// HashMap Collection
		System.out.println();
		System.out.println("*************Start of HashMap************ ");
		Map<String, Integer> hashMap = new HashMap<String, Integer>();

		hashMap.put("Jin", 100);
		hashMap.put("Jee", 100);
		hashMap.put("Nam", 90);
		hashMap.put("Lee", 80);
		hashMap.put("Jin", 95);
		System.out.println("Before remove hashMap.size() ==> " + hashMap.size());

		System.out.println("\t Jin : " + hashMap.get("Jin"));
		System.out.println();

		Set<String> keySet = hashMap.keySet();
		System.out.println("keySet ==> " + keySet);
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = hashMap.get(key);
			System.out.println("\t key ==> " + key + ": value ==> " + value);
		}
		System.out.println();

		hashMap.remove("Lee");
		System.out.println("After remove hashMap.size() ==> " + hashMap.size());

		Set<Map.Entry<String, Integer>> entrySet = hashMap.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t key ==> " + key + ": value ==> " + value);
		}

		System.out.println();
		System.out.println("*************End of HashMap************ ");

		// HashSet Collection
		System.out.println();
		System.out.println("*************Start of HashSet************ ");
		Set<String> hashSet = new HashSet<String>();

		hashSet.add("Java");
		hashSet.add("JDBC");
		hashSet.add("JSP");
		hashSet.add("Java");
		hashSet.add("Spring Boot");
		hashSet.add("Mybatis");

		System.out.println();
		System.out.println("Before remove hashSet size ==> " + hashSet.size());
		System.out.println();

		Iterator<String> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}

		hashSet.remove("Mybatis");
		hashSet.remove("JSP");
		System.out.println();
		System.out.println("After remove hashSet size ==> " + hashSet.size());
		System.out.println();

		iterator = hashSet.iterator();
		for (String element : hashSet) {
			System.out.println("\t" + element);
		}
		System.out.println();
		System.out.println("*************End of HashSet************ ");

		// participant vs completion
		System.out.println();
		System.out.println("*************Start of participant vs completion************ ");
		Solution solution = new Solution();
		String[] participant = { "leo", "kiki", "eden" };
		String[] completion = { "eden", "kiki" };
		System.out.println("before solution.participant ==> " + participant);
		System.out.println("before solution.completion ==> " + completion);
		solution.solution(participant, completion);
		System.out.println();
		System.out.println("*************End of participant vs completion************ ");

		// Name, Age check
		System.out.println("*************Start of Name, Age Check************ ");
		System.out.println("Please Enter Name Age ==> ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Scanner value ==> " + sc);
		String name = sc.next();
		int age = sc.nextInt();

		if (age > 65 || age < 18) {
			System.out.println(name + ", " + age + " is not an eligible age for this position");
		}
		System.out.println();
		System.out.println("*************End of Name, Age Check************ ");

		// Collection Vector
		System.out.println();
		System.out.println("*************Start of Vector************ ");
		List<Board> vector = new Vector<Board>();

		vector.add(new Board("title1", "content1", "writer1"));
		vector.add(new Board("title2", "content2", "writer2"));
		vector.add(new Board("title3", "content3", "writer3"));
		vector.add(new Board("title4", "content4", "writer4"));
		vector.add(new Board("title5", "content5", "writer5"));

		for (int i = 0; i < vector.size(); i++) {
			Board board = vector.get(i);
			System.out.println(board.title + "\t" + board.content + "\t" + board.writer);
		}
		System.out.println();
		System.out.println("*************End of Vector************ ");

		// Constructor test
		Car car1 = new Car();
		System.out.println();
		System.out.println("car1.company : " + car1.company);
		System.out.println();

		Car car2 = new Car("GLE450");
		System.out.println();
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println("car2.color : " + car2.color);
		System.out.println("car2.maxSpeed : " + car2.maxSpeed);
		System.out.println();

		Car car3 = new Car("E300", "black");
		System.out.println();
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println("car3.maxSpeed : " + car3.maxSpeed);
		System.out.println();

		// Enumeration Test
		Week today = null;

		Calendar calendar = Calendar.getInstance();
		int week = calendar.get(calendar.DAY_OF_WEEK);

		System.out.println();

		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}

		System.out.println("Today is " + today + " 이니깐");
		System.out.println();

		if (week == 1 || week == 7) {
			System.out.println("===> 집에서 미친듯이 자바공부를 한다");
		} else {
			System.out.println("===> 회사에서 미친듯이 코딩을 한다");
		}

		// Scanner Test
		Scanner scanner = new Scanner(System.in);
		String inputData;

		while (true) {
			inputData = scanner.nextLine();
			System.out.println("Input Data 는" + inputData + "입니다");
			if (inputData.equals("q")) {
				break;
			}
		}
		System.out.println();
		System.out.println("End");

		/***********************************
		 * End of Test Code
		 *******************************************/
	}
}
