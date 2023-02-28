package Ex;

import java.util.Scanner;

public class Ex2_369게임 {

	public static void main(String[] args) {
		
		// 1~99 사이의 정수를 입력받아서
		// 3, 6, 9가 나오는 수만큼 박수를 "짝" 친다.
		
		System.out.print("1~99 사이 값 입력 >> ");
		Scanner sc = new Scanner(System.in);
		
		/*
		// 문자열로 받는 경우
		String num = sc.next();
		char c1 = num.charAt(0);
		int l = num.length();
		
		if((c1 == '3') || (c1 == '6') || (c1 == '9')) System.out.print("짝");
		
		if(l == 2){
			char c2 = num.charAt(1);
			if((c2 == '3') || (c2 == '6') || (c2 == '9')) System.out.println("짝");
		}
		*/
		
		// 정수로 받는 경우
		int num1 = sc.nextInt();
		
		if((num1 >= 1) && (num1 <= 99)){	// 제약 조건 체크
			int num2 = num1 % 10;
			num1 /= 10;
			
			if(num1 % 3 == 0 && num1 != 0)
				System.out.print("짝");
			if(num2 % 3 == 0)
				System.out.println("짝");
		}
		
		/*
		// 해설
		int res, num, numberOf369 = 0;
		
		System.out.print("1~99 사이 값 입력 >> ");
		
		num = sc.nextInt();
		
		if(num >= 1 && num <= 99) {
			// 자릿수 체크
			res = num / 10;
			if(res == 3 || res == 6 || res == 9) {
				numberOf369++;
			}
			
			res = num % 10;
			if(res == 3 || res == 6 || res == 9) {
				numberOf369++;
			}
			
			if(numberOf369 == 1)
				System.out.println("짝");
			else
				System.out.println("짝짝");
		}
		else {
			System.out.println("숫자가 범위를 벗어났습니다.");
		}
		*/
		
		sc.close();
	}

}
