package ch04_조건문;

import java.util.Scanner;

public class If3 {

	// 외부에서 입력을 받는다.
	// 30~70사이에 들어있는 숫자인지 판별한다.
	
	public static void main(String[] args) {
		
		System.out.print("숫자 입력 >> ");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if((num >= 30) && (num <= 90)) {
			System.out.println("30 ~ 90 사이의 숫자입니다.");
		}
		else {
			System.out.println("30 ~ 90 외의 숫자입니다.");
		}
		
		sc.close();
		
	}
	
}
