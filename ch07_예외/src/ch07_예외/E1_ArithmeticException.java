package ch07_예외;

import java.util.Scanner;

public class E1_ArithmeticException {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 수를 입력하시오 >> ");
		int divisor;
		int dividend;
		
		//System.out.println(dividend + "/" + divisor + "=" + (dividend/divisor));
		
		try {
			System.out.print("나뉨수를 입력시오 >> ");
			dividend = sc.nextInt();
			
			System.out.print("나눌수를 입력시오 >> ");
			divisor = sc.nextInt();
			
			System.out.println(dividend + "/" + divisor + "=" + (dividend/divisor));
		} catch (Exception e) {
			System.out.println("0으로 나눌 수가 없습니다.");
		} finally {
			
		}
		System.out.println("종료합니다.");
		sc.close();
	}	
}
