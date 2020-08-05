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
		try {
			Product product = new Product();
			product.setPno(++counter);
			
			System.out.println("상품명: "+"\n");
			product.setName(scanner.nextLine());
			
			System.out.println("가격: "+"\n");
			product.setPrice(Integer.parseInt(scanner.nextLine()));
			
			System.out.println("재고: "+"\n");
			product.setStock(Integer.parseInt(scanner.nextLine()));
			
			list.add(product);
			
		} catch (Exception e) {
			System.out.println("등록에러: "+e.getMessage());
		}
	}
	
	
	public void showProduct() {
		for(Product p : list) {
			System.out.println(p.getPno() + "\n" + p.getName() + "\n" + p.getPrice() + "\n" + p.getStock());
		}
	}
}
