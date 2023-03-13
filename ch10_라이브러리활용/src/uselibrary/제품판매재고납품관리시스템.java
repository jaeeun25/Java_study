package uselibrary;

import java.util.Scanner;

// 고객
class Person{
	String name;
	
}

//제품
class Goods{
	String name;
	int qty;
}

// 고객 관리
interface ClientManagementInter{
	void clientsShow();
}

// 주문 관리
interface DeleveryManagementInter{
	void setStandBQty(String name, int qty);
	int deliveryDelay(String name);
}

// 판매관리
interface SalesMangement{
	void calculator(String item, int quantity);
	long getTotalSalesAmount();
	int getSalesQty();
}

// 재고관리
interface StockManagement{
	// 입고
	void setInItem(String item, int quantity);
	// 출고
	void setOutItem(String item, int quantity);
	// 재고관리
	int getItemStock(String item);
}

class Management implements ClientManagementInter, DeleveryManagementInter, StockManagement, SalesMangement{

	@Override
	public void calculator(String item, int quantity) {}

	@Override
	public long getTotalSalesAmount() {return 0;}

	@Override
	public int getSalesQty() {return 0;}

	@Override
	public void setInItem(String item, int quantity) {
		
		
	}

	@Override
	public void setOutItem(String item, int quantity) {}

	@Override
	public int getItemStock(String item) {return 0;}

	@Override
	public void setStandBQty(String name, int qty) {}

	@Override
	public int deliveryDelay(String name) {return 0;}

	@Override
	public void clientsShow() {
		
	}
	
}

public class 제품판매재고납품관리시스템 {
	static Management m = new Management();
	
	// 관리자용
	static String bizLogic(int num) {
		switch(num) {
		case 1:			// 고객 관리
			m.clientsShow();
			break;
		case 2:			// 주문 관리
			
			
			break;
		case 3:			// 판매 관리
			break;
		case 4:			// 재고 관리
			break;
		}
		return "";
	}
	
	// 고객용
	static void announceService(String str) {
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Person[] client = new Person[3];
		
		
		System.out.println("메뉴 선택");
		int menu = sc.nextInt();
		
		
		// 사용자 모드
		
		
		// 관리자 모드
		bizLogic(menu);
		
		
	}
}
