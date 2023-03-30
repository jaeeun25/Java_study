package ex;

import java.util.Scanner;

public class Ex5 {
	// 반복문 실습
	// 시간을 입력해 주면 몇일 몇시간으로 출력해주는 프로그램을 작성
	// 단, 50만 시간 이내
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시간을 입력해주세요(50만 시간 이내) >> ");
		int time = sc.nextInt();
		
		int day = time / 24;
		time %= 24;
		
		System.out.println(day + "일 " + time + "시간");
	}

}
