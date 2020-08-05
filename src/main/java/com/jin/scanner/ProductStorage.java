/**
 * 
 */
package com.jin.scanner;

import java.util.*;

/**
 * @author njh
 *
 */
public class ProductStorage {
	private List<Product> list = new ArrayList();
	private Scanner scanner = new Scanner(System.in);
	private int counter;
	
	public void showMenu() {
		while(true) {
			System.out.println("----------------------------");
			System.out.println("1.등록     |  2.목록     |  3.종료");
			System.out.println("----------------------------");
			
			System.out.println("선택: ");
			String selectNo = scanner.nextLine();
			switch (selectNo) {
			case "1":
				registerProduct();				
				break;

			case "2":
				showProduct();				
				break;
			case "3":
				return;
			}
		}
	}
	
	public void registerProduct() {
		
	}
	
	public void showProduct() {
		
	}
}
