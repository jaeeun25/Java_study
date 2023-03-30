package step1_클래스와객체;

import java.util.Scanner;

// 설계도
class Goods{
	
	// 필드 - 제품명, 제품가격, 재고수, 판매수, 단가
	String name;
	int price, cnt, sale_cnt, o_price;
	
	// 메소드
	// 판매 매출액 계산 메소드
	int sales_cal() {
		return 1500 * sale_cnt;
	}
	// 판매 후 재고 계산 메소드
	void sale_goods_count(int n) {
		cnt -= n;
		sale_cnt += n;
		System.out.println("판매 후 " + name + " 재고: " + cnt);
	}
	
	// 현 재고 상태를 보는 메소드
	void goods_count() {
		System.out.println("현재 " + name + " 재고: " + cnt);
	}
	// 제품 내역 현황을 소개하는 메소드
	void goods_intro() {
		System.out.println("제품명: " + name +
							"\n제품 가격: " + price +
							"\n재고 수: " + cnt +
							"\n판매 수: " + sale_cnt +
							"\n단가: " + o_price);
		
	}
	
}

// 실행 클래스
public class C3_GoodsEx {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			// 객체를 생성해서
			// .현 재고 파악
			// .제품 내역 파악
			// .판매
			// .매출액 파악
			// .다시 재고 파악
			Goods goods = new Goods();
			
			goods.name = "커피우유";
			goods.price = 1500;
			goods.cnt = 100;
			goods.sale_cnt = 0;
			goods.o_price = 900;
			
			
			goods.goods_count();
			System.out.println("---------------");
			goods.goods_intro();
			System.out.println("---------------");
			
			System.out.print("구매 수량 입력 >> ");
			int n = sc.nextInt();
			
			goods.sale_goods_count(n);
			System.out.println("매출액: " + goods.sales_cal());
			goods.goods_count();
		}
}
