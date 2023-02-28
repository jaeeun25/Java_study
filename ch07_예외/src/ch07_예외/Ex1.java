package ch07_예외;

import java.util.Scanner;

public class Ex1 {
	
	// 정수배열을 5 크기로 생성한다
	// 스캐너로 숫자를 반복해서 입력받는다
	// for문을 이용해서 6까지 반복시켜서 입력받도록 한다.
	
	// 오류가 발생되면 내용을 확인하시고 예외처리해 본다.
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		try {
			for(int i = 0; i < 6; i++) {
				System.out.print("숫자 입력 >> ");
				arr[i] = sc.nextInt();
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("입력 횟수가 배열의 크기를 초과했습니다.");
		}
		System.out.println("프로그램을 종료합니다.");
		
	}
}
