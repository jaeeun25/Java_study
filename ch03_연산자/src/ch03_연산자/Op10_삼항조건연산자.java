package ch03_연산자;

import java.util.Scanner;

public class Op10_삼항조건연산자 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요 >> ");
		
		int num = sc.nextInt();
		
		System.out.println(num % 2 == 0 ? "짝수":"홀수");
		
		// 두 개의 정수를 입력 받아서 그 두 숫자의 차이(절대값)를 출력하시오
		System.out.print("두 개의 정수를 입력하시오 >> ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		System.out.println(n1 >= n2 ? (n1-n2) : (n2-n1));
		
		sc.close();
		
	}
	
}
