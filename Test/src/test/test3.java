package test;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

class Goods{
	private String name;
	private int price;
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
}

class GoodsArr{
	private Vector<Goods> goodsList;
	
	public GoodsArr() {
		goodsList = new Vector<Goods>();
	}
	
	public void addGoods(String item, int price) {
		Goods g = new Goods(item, price);
		goodsList.add(g);
		System.out.println("제품을 등록했습니다.");
	}
	
	public void showGoods() {
		Iterator<Goods> it = goodsList.iterator();
		
		while(it.hasNext()) {
			Goods g = it.next();
			System.out.println("*******제품 목록*******");
			System.out.println("상품명: " + g.getName());
			System.out.println("가   격: " + g.getPrice());
		}
		System.out.println("모든 제품 내역을 출력했습니다.");
	}
}

public class test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GoodsArr ga = new GoodsArr();
		
		System.out.println("*******제품을 등록합니다*******");
		while(true) {
			System.out.print("제품명 >> ");
			String item = sc.next();
			System.out.print("가   격 >> ");
			int price = sc.nextInt();
			
			ga.addGoods(item, price);
			
			System.out.print("제품을 더 등록하시겠습니까?(n: 종료) ");
			String ans = sc.next();
			System.out.println();
			if(ans.equals("n")) {
				break;
			}
		}
		
		ga.showGoods();
		
		System.out.println("프로그램을 종료합니다.");
		
		sc.close();
	}
}
