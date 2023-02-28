package ch03_연산자;

import java.util.Scanner;

/*
	산술 연산자
		. +, -, *,
		. /(데이터타입과 연계해서 몫만 추출해낼 수 있다),
		. %(나머지)
*/

public class Op1_산술연산자 {
	// 생성자의 역할은 객체(내 자신)을 만든다 -> 클래스 이름과 동일한 메소드
	public static void main(String[] args) {
		
		int result;
		System.out.print("숫자 두개를 입력해주세요 >> ");
		
	 // 클래스명   객체명 = 생성자
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		//int num1 = 33, num2 = 20;
		
		result = num1 + num2;
		System.out.println("num1 + num2 = " + result);
		System.out.printf("%s + %s = %d\n", "num1", "num2", result);
		
		String str = "결과값은 " + result + "입니다.";
		System.out.println(str);
		
		//result = num1 / num2;
		//double result2 = num1/(float)num2;			// 1.6...
		//double result2 = (int)(num1/(float)num2);		// 1.0
		int result2 = (int)(num1/(float)num2);			// 1
		System.out.println("num1 / num2 = " + result2);
		
		int result3 = num1 % num2;
		System.out.println("num1 % num2 = " + result3);
				
		sc.close();
		
	}
}
