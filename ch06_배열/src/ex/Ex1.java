package ex;

import java.util.Scanner;

public class Ex1 {

	// 스캐너로 입력받아서 배열에 저장하고 출력하시오
	// 친구 5명
	
	// 1. 친구이름 - 문자
	// 2. 친구나이 - 정수
	// 3. 친구몸무게 - 실수
	
	// 출력: 홍길동은 나이가 몇이고 몸무게가 몇입니다
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] name = new String[5];
		int[] age = new int[5];
		double[] weight = new double[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.print("친구" + (i+1) + " 이름>> ");
			name[i] = sc.next();
			
			System.out.print("친구" + (i+1) + " 나이>> ");
			age[i] = sc.nextInt();
			
			System.out.print("친구" + (i+1) + " 몸무게>> ");
			weight[i] = sc.nextDouble();
			
			System.out.println();
		}
		
		for(int j = 0; j < 5; j++) {
			System.out.println(name[j] + "은(는) 나이가 " + age[j] + "이고 몸무게가 " + weight[j] + "입니다");
		}
		
		
		
	}
		
}
