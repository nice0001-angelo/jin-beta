/*
 * This is a Jin-beta Project
 * File name : JinBetaApplication.java
 * Created by : Jinhyun
 * Created on : Jan 2020
 * Contents : Main Application.java
 */
package net.jin;

import java.util.Calendar;
import java.util.List;
import java.util.Scanner;
import java.util.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import net.jin.enumeration.Week;
import net.jin.utils.Board;
import net.jin.utils.Car;

@SpringBootApplication
public class JinBetaApplication {

	public static void main(String[] args) throws Exception{
		SpringApplication.run(JinBetaApplication.class, args);

/********************************** Start of Test Code *************************************/
	
		
		//Constructor test
		Car car1 = new Car();
		System.out.println();
		System.out.println("car1.company : "+car1.company);
		System.out.println();
		
		Car car2 = new Car("GLE450");
		System.out.println();
		System.out.println("car2.company : "+car2.company);
		System.out.println("car2.model : "+car2.model);
		System.out.println("car2.color : "+car2.color);
		System.out.println("car2.maxSpeed : "+car2.maxSpeed);
		System.out.println();
		
		Car car3 = new Car("E300","black");
		System.out.println();
		System.out.println("car3.company : "+car3.company);
		System.out.println("car3.model : "+car3.model);
		System.out.println("car3.color : "+car3.color);
		System.out.println("car3.maxSpeed : "+car3.maxSpeed);
		System.out.println();
		
		
		
		
		//Enumeration Test
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
		
		System.out.println("Today is "+today+" 이니깐");
		System.out.println();
		
		if(week == 1 || week == 7 ) {
			System.out.println("===> 집에서 미친듯이 자바공부를 한다");
		} else {
			System.out.println("===> 회사에서 미친듯이 코딩을 한다");
		}
		
		// Scanner Test
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine();
			System.out.println("Input Data 는"+inputData+"입니다");
			if(inputData.equals("q")){
				break;
			}
		}
		System.out.println();
		System.out.println("End");
		
		
		
		
/*********************************** End of Test Code *******************************************/		
	}

}
