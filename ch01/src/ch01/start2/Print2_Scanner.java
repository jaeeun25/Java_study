package ch01.start2;

import java.util.Scanner;

/*
	class 클래스명 {
		
		멤버변수(필드)	- 속성(명사)
		생성자()				  - 자신의 객체를 생성하는 메소드
		메소드()		- 기능(동사) : 공부하기, 놀기, 잠자기
	}
	
	class Scanner {
		
		Scanner() {}
		
		next()		: 문자열 - 공백으로 구분
		nextLine()	: 한 줄씩 읽음
		nextInt()	: 정수
		nextDouble(): 실수
	
	}
*/

// Scanner

public class Print2_Scanner {
	
	public static void main(String[] args) {
		
		// 클래스 참조변수  = new 생성자()
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력해 주세요 >> ");
		
					//객체.메소드()
		String name = sc.next();	// next() : 문자열을 반환한다
		
		System.out.println("저의 이름은 " + name + "입니다.");
		
		sc.close();
	}

}
