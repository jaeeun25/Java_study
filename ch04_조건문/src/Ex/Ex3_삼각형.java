package Ex;

import java.util.Scanner;

public class Ex3_삼각형 {

	public static void main(String[] args) {
		
		// 세 변의 길이 값을 입력받아서
		// 삼각형을 그릴 수 있는지 판별한다.
		// 조건: 두 변의 합 > 한 변
		
		System.out.print("삼각형 세 변의 길이 입력 >> ");
		Scanner sc = new Scanner(System.in);
		
		
		// 조건 1 : 가장 긴변 < 나머지 두 변의 합
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int min1, min2 = c, max;
		
		if(a > b) {
			max = a;
			min1 = b;
		}
		else {
			max = b;
			min1 = a;
		}
		
		if(max < c) {
			min2 = max;
			max = c;
		}
		
		if(min1 + min2 > max) 
			System.out.println("삼각형을 그릴 수 있습니다.");
		else 
			System.out.println("삼각형을 그릴 수 없습니다.");

		
		/*
		// 해설 (조건 2: 두 변의 합 > 한 변 조건의 경우 모든 경우의 수 만족)
		
		if((a+b) > c && (b+c) > a && (c+a) > b) {
			System.out.println("삼각형을 그릴 수 있습니다.");
		}
		else {
			System.out.println("삼각형을 그릴 수 없습니다.");
		}
		*/
		
		
		
		
		sc.close();
		
	}

}
