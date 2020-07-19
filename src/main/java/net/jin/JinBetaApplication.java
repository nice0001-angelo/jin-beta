/*
 * This is a Jin-beta Project
 * File name : JinBetaApplication.java
 * Created by : Jinhyun
 * Created on : Jan 2020
 * Contents : Main Application.java
 */
package net.jin;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JinBetaApplication {

	public static void main(String[] args) throws Exception{
		SpringApplication.run(JinBetaApplication.class, args);

/********************************** Start of Test Code *************************************/
		System.out.println();
		System.out.println();
		System.out.println("Hello World");
		System.out.println();
		System.out.println();
		
		
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine();
			System.out.println("Input Data 는"+inputData+"입니다");
			if(inputData.equals("q")){
				break;
			}
		}

		System.out.println("End");
		

		
		
/*********************************** End of Test Code *******************************************/		
	}

}
