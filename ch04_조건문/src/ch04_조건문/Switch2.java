package ch04_조건문;

import java.util.Scanner;

public class Switch2 {
	
	public static void main(String[] args) {
		
		String season = "";
		
		System.out.print("월을 입력하세요>> ");
		Scanner sc = new Scanner(System.in);
		String month = sc.next();
		
		switch(month) {
			case "12":
			case "1": 
			case "2": season = "겨울"; break;
			case "3": case "4": case "5": season = "봄"; break;
			case "6": case "7": case "8": season = "여름"; break;
			case "9": case "10": case "11": season = "가을"; break;
		}
		System.out.println(month + "월은 계절이 " + season + "입니다.");
		
	}
	
}
