package ch04_조건문;

import java.util.Scanner;

public class Switch3 {
	
	public static void main(String[] args) {
		
		System.out.println("숫자 두 개와 연산자를 입력해주세요");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 >> ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자 >> ");
		int num2 = sc.nextInt();
		System.out.print("연산자 >> ");
		String op = sc.next();
		
		switch(op) {
			case "+": 
				System.out.println(num1 + op + num2 + "=" + (num1 + num2));
				break;
			case "-":
				System.out.println(num1 + op + num2 + "=" + (num1 - num2));
				break;
			case "*":
				System.out.println(num1 + op + num2 + "=" + (num1 * num2));
				break;
			case "/":
				System.out.println(num1 + op + num2 + "=" + (num1 / num2));
				break;
		}
		
		
	}
	
}
