package Ex;

import java.util.Scanner;

public class Q7_입출조회프로그램작성 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int money = 0, select = 0, passbook = 0;
		
		while(select != 4) {
			System.out.println("-----------------------------\n" +
					"1.예금 | 2.출금 | 3.잔고 | 4.종료\n" +
					"-----------------------------");
			System.out.print("메뉴를 선택하세요 >> ");
			select = sc.nextInt();
			
			switch(select) {
			case 4: 
				System.out.println("프로그램을 종료합니다.");
				break;
			case 1: 
				System.out.print("예금할 금액을 입력하세요 >> ");
				money = sc.nextInt();
				if(money <= 0)	System.out.println("잘못 입력하셨습니다.");
				else {
					passbook += money;
					System.out.println("잔고 >> " + passbook);
				}
				break;
			case 2:
				System.out.print("출금할 금액을 입력하세요 >> ");
				money = sc.nextInt();
				if(passbook < money) System.out.println("통장에 잔고가 부족합니다.");
				else if(money <= 0)	System.out.println("잘못 입력하셨습니다.");
				else {
					passbook -= money;
					System.out.println("잔고 >> " + passbook);
				}
				break;
			case 3: 
				System.out.println("잔고 >> " + passbook);
				break;
		
			default:  
				System.out.println("메뉴를 재선택해주세요.");
			}
		}
		sc.close();
		
		
		/*
		// 해설(break 없이, while문과 switch문으로, 예외처리 없이)
		
		//boolean run = true;
		int balance = 0;		
		
		while(true) {		// run 대신 바로 true로
			System.out.println("-----------------------------\n" +
					"1.예금 | 2.출금 | 3.잔고 | 4.종료\n" +
					"-----------------------------");
			System.out.print("메뉴를 선택하세요 >> ");
			int menu = sc.nextInt();
			
			if(menu == 4) {
				//run = false;
				break;
			}
			else if(menu == 1) {
				System.out.print("예금할 금액을 입력하세요 >> ");
				balance += sc.nextInt();			
				System.out.println("입금 후 잔액은 " + balance + "원입니다.");
			}
			else if(menu == 2) {
				System.out.print("출금할 금액을 입력하세요 >> ");
				balance -= sc.nextInt();
				System.out.println("출금 후 잔액은 " + balance + "원입니다.");
			}
			else if(menu == 3) {
				System.out.println("고객님의 현재 잔액은 " + balance + "원입니다.");
			}
			else {
				System.out.println("메뉴를 재선택해주세요.");
			}		
		}
		sc.close();
		System.out.println("프로그램을 종료합니다.");
		 */
	}

}
