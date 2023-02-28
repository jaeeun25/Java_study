package Ex;

import java.util.Scanner;

public class Ex4_윤년판별 {
	
	public static void main(String[] args) {
	
		// 년도를 입력받아서 그 해가 윤년인지 판별한다.
		// 윤년의 조건
		// 	- 4의 배수인 해
		//  - 400의 배수인 해
		//	- 단, 100의 배수인 해는 아니다.
		
		//  윤년 2000년, 2400년
		//	평년 1900년, 2100년
		
		System.out.print("년도 입력 >> ");
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		if(year % 4 == 0 && year % 100 != 0  || year % 400 == 0) {
			System.out.println(year + "년은 윤년입니다.");
		}
		else {
			System.out.println(year + "년은 평년입니다.");
		}
		
		sc.close();
	}

}
