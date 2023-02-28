package ch01.start2;

import java.util.Scanner;

public class Print3 {

	public static void main(String[] args) {
		
		// 자기소개를 합니다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력해주세요>> ");
		String name = sc.next();
		
		System.out.print("나이을 입력해주세요>> ");
		int age = sc.nextInt();
		
		System.out.print("몸무게를 입력해주세요>> ");
		double weight  = sc.nextDouble();
		
		System.out.println("제 이름은 " + name + "이고, 나이는 " + age + "이며, 몸무게는 " + weight + "kg 입니다.");
		
		sc.close();
		
	}

}
