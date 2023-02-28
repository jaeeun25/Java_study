package ch03_연산자;

import java.util.Scanner;

public class Op3_산술연산Ex {

	public static void main(String[] args) {
		
		// 초를 입력받아서 0시간0분0초 로 출력하시오
		/*
			1. 외부에서 입력
			2. 60으로 나눠서 나머지는 초, 몫은 분을 다시 60으로 나눠서 몫은 시, 나머지는 분
			3. 출력한다
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("초를 입력하세요 >> ");
		int s = sc.nextInt();	// 초
		int m;					// 분
		int h;					// 시
		
		m = s / 60;
		s %= 60;
		
		h = m / 60;
		m %= 60;
		
		System.out.println(h + "시 " + m + "분 " + s + "초");
		
	}
	
}
