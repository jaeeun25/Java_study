package ex;

import java.util.Scanner;

public class Ex6 {

	// 그려야할 별의 개수를 입력받아 아래와 같은 모양찍기가 되도록 구현하자
	/*
		***********
		**********
		*********
		********
		  ...
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("별 갯수를 입력해주세요 >> ");
		int cnt = sc.nextInt();
		
		
		for(int i = 0; i < cnt; i++) {
			for(int j = cnt; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
