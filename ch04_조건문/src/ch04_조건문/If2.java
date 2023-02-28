package ch04_조건문;

import java.util.Scanner;

public class If2 {

	public static void main(String[] args) {
		
		System.out.print("성적을 입력해 주세요 >> ");
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		String grade = null;
		
		if(score >= 90) {
			if(score >=97)
				grade = "A+학점";
			else if(score >= 95)
				grade = "A0학점";
			else
				grade = "A-학점";
		}
		else if(score >= 80) {
			if(score >=87)
				grade = "B+학점";
			else if(score >= 85)
				grade = "B0학점";
			else
				grade = "B-학점";
		}
		else if(score >= 70) {
			if(score >=77)
				grade = "C+학점";
			else if(score >= 75)
				grade = "C0학점";
			else
				grade = "C-학점";
		}
		else {
			grade = "D학점";
		}
		System.out.println(grade);
		
		sc.close();
	}
	
}
