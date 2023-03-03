package step4_메소드;

import java.util.Scanner;

class Items{
	String name;
	int price;
	int sold;
	int stock;
	
	Items(String name, int price, int sold, int stock){
		this.name = name;
		this.price = price;
		this.sold = sold;
		this.stock = stock;
	}
	
	String getName() {
		return name;
	}
	
	int getPrice() {
		return price;
	}
	
	int getSold() {
		return sold;
	}
	
	int getStock() {
		return stock;
	}
	
}

class Management{
	
	int totalSales(Items[] arr) {
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum += (arr[i].sold * arr[i].price);
		}
		return sum;
	}
}


public class M7_객체배열 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Items[] items = new Items[3];
		
		System.out.println("재품현황을 등록합니다");
		
		for(int i=0; i<items.length; i++) {
			System.out.println("********" + (i+1) + "번째 상품을 등록합니다********");
			
			String name = null;
			int price = 0, sold = 0, stock = 0;
			try {
				System.out.print("상품명> ");
				name = sc.next();
				
				System.out.print("가격> ");
				price = sc.nextInt();
				
				System.out.print("판매량> ");
				sold = sc.nextInt();
				
				System.out.print("재고량> ");
				stock = sc.nextInt();
				
				// 논리적으로 위험 아래에 쓰는게 맞다
				//Items item = new Items(name, price, sold, stock);
				//items[i] = item;
			} catch (IndexOutOfBoundsException e) {
				System.out.println("범위를 초과했습니다.");
			}
			Items item = new Items(name, price, sold, stock);
			items[i] = item;
			
		}
		
		for(Items g : items) {
			System.out.println("---------------------");
			System.out.println("상품명: " + g.getName());
			System.out.println("가격: " + g.getPrice());
			System.out.println("판매량: " + g.getSold());
			System.out.println("재고량: " + g.getStock());
		}
		
		sc.close();
		
		// 총매출액
		Management m = new Management();
		int sum = m.totalSales(items);
		System.out.println("총 매출액: " + sum + "입니다");
	}
}
