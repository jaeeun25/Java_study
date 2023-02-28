package ch04_조건문;

import java.util.Scanner;

public class Switch1 {
	
	public static void main(String[] args) {
		
		System.out.print("시작할 번호를 입력하세요 >> ");
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		switch(num) {
			case 1: System.out.println("L");
			case 2: System.out.println("O");
			case 3: System.out.println("V");
			case 4: System.out.println("E");
			case 5: System.out.println("F");
			case 6: System.out.println("O");
			case 7: System.out.println("R"); break;		
			case 8: System.out.println("E");
			case 9: System.out.println("V");
			case 10: System.out.println("E");
			case 11: System.out.println("R");
			
			default: System.out.println("없음");
		}
		
	}
	
}
