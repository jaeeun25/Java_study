package step4_메소드;

import java.util.Scanner;

class Score{
	// 성적들(배열)을 받아서 계산하고 결과값을 배열로 반환하는 메소드
	int[] calculateAdd(int[] score) {
		for(int i=0; i<score.length; i++)
			score[i] += 15;
		return score;
	}
}

public class M1_매개변수배열전달Ex {

	public static void main(String[] args) {
		
		int[] s = new int[3];
		
		System.out.println("*****성적 계산 프로그램*****");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 국어점수> ");
		s[0] = sc.nextInt();
		System.out.print("두번째 영어점수> ");
		s[1] = sc.nextInt();
		System.out.print("세번째 수학점수> ");
		s[2] = sc.nextInt();
		
		Score score = new Score();
		
		s = score.calculateAdd(s);
		
		for(int value : s)
			System.out.println(value);	
	}
}