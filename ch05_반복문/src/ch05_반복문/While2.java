package ch05_반복문;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		
		// 외부에서 숫자를 계속 입력받아서
		// 합계와 총 몇개를 입력받았는지.. 평균을 출력하시오.
		// 단, -1 입력 시 프로그램 종료
		/*
			. 스캐너를 가져온다.
			. 스캐너에서 값을 반복적으로 입력받는다.
			. 받으면서 카운트, 합을 누적해나간다.
			. 그러나다 -1을 입력하면 종료되고,
			. 입력된 갯수, 합계, 평균을 출력한다.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int num, sum = 0, cnt = 0;
		
		System.out.println("수를 입력하시오(-1: 종료)");
		num = sc.nextInt();		// 첫번째 숫자입력
		
		while(num != -1) {
			sum += num;				// 누적
			cnt++;
			num = sc.nextInt();		// 숫자입력..	-1이 오면 종료
		}
		
		if(cnt == 0) 
			System.out.println("입력된 숫자가 없습니다.");
		else {
			System.out.println("입력 횟수: " + cnt + "\n" +
							   "합계: " + sum);
			System.out.printf("평균: %.1f", ((double)sum/cnt));
		}
	
	}

}
