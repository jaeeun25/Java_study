package step1_클래스와객체;

import java.util.Scanner;

class Goods1{
	String name;
	int price, cnt, sale;
	
	Goods1(String name, int price, int cnt, int sale){
		this.name = name;
		this.price = price;
		this.cnt = cnt;
		this.sale = sale;
	}
}

class GM{
	
	Goods1[] goods;
	
	void setArr(int n) {
		goods = new Goods1[n];
	}
	
	void insert(String name, int price, int cnt, int sale, int i) {
		Goods1 goods = new Goods1(name, price, cnt, sale);
		this.goods[i] = goods;
	}
	
	void list(int i) {
		for(int n=0; n<i; n++) {
			System.out.println("\n제품명: " +goods[n].name +
					"\n가격: " + goods[n].price +
					"\n재고량: " + goods[n].cnt +
					"\n판매량: " + goods[n].sale);
		}
	}
}


public class C7_Goods관리프로그램Ex {

	public static void main(String[] args) {
		
		//--------------------------------------------
		// 1. 제품수 | 2. 제품내역등록 | 3. 제품리스트 | 4. 종료
		//--------------------------------------------
		// 메뉴를 선택해 주세요 >>
		// 1
		// 등록할 제품 수를 입력하시오 >>
		// 2
		//--------------------------------------------
		// 1. 제품수 | 2. 제품내역등록 | 3. 제품리스트 | 4. 종료
		//--------------------------------------------
		// 메뉴를 선택해 주세요 >>
		// 2
		// 제품을 등록합니다.
		// 제품명을 입력하시오 >> 
		// 새우깡
		// 제품가격을 입력하시오 >> 
		// 1000
		// 재고량을 입력하시오 >>
		// 21
		// 판매량을 입력하시오 >>
		// 3
		// 1번째 제품을 등록하였습니다.
		// 계속하시겠습니까?(y/n)
		
		Scanner sc = new Scanner(System.in);
		
		int menu, i=0, n=0;
		GM gm = new GM();
		
		while(true) {
			System.out.println("--------------------------------------------");
			System.out.println(" 1. 제품수 | 2. 제품내역등록 | 3. 제품리스트 | 4. 종료");
			System.out.println("--------------------------------------------");
			
			System.out.print("메뉴를 선택해 주세요 >> ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				if(n != 0) System.out.println("이미 제품 수를 지정했습니다.");
				else{
					System.out.print("등록할 제품 수를 입력하시오 >> ");
					n = sc.nextInt();
					
					gm.setArr(n);
				}
				break;
			case 2:
				if(i == n || n <= 0) System.out.println("제품을 등록할 수 없습니다."); 
				else {
					while(true) {
						System.out.println("제품을 등록합니다.");
				
						System.out.print("제품명을 입력하시오 >> ");
						String name = sc.next();
						
						System.out.print("제품 가격을 입력하시오 >> ");
						int price = sc.nextInt();
						
						System.out.print("재고량을 입력하시오 >> ");
						int cnt = sc.nextInt();
						
						System.out.print("판매량을 입력하시오 >> ");
						int sale = sc.nextInt();
						
						gm.insert(name, price, cnt, sale, i);
						
						System.out.println((i+1) + "번째 제품을 등록하였습니다.");	
						
						i++;
					
						System.out.println("계속하시겠습니까?(y/n)");
						String answer = sc.next();
						
						if(answer.equals("y")) {
							if(i >= n) {
								System.out.println("더 등록할 수 없습니다.");
								break;
							}
						}
						else break;
					}
				}
				break;
			case 3:
				gm.list(i);
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				
				break;
			default:
				System.out.println("번호를 재입력해주세요.");
			}
			if(menu == 4) {
				sc.close();
				System.exit(0);
			}
		}
	}

}
