package ch06_배열;

import java.util.Arrays;
import java.util.Scanner;

public class Array5_Ex {

	public static void main(String[] args) {
		
		System.out.println("회원등록 업무를 시작합니다.");
		Scanner sc = new Scanner(System.in);
		
		String[] strName1 = new String[10];
		int[] intAge = new int[10];
		float[] floatWeight = new float[10];
		
		boolean flag = true;
		int idx = 0;
		
		while(flag){
			// 
			System.out.println((idx+1) + "번째 회원님을 등록합니다.");
			System.out.print("이름? >> ");
			strName1[idx] = sc.next();
			
			System.out.print("나이? >> ");
			intAge[idx] = sc.nextInt();
			
			System.out.print("몸무게? >> ");
			floatWeight[idx] = sc.nextFloat();
			
			System.out.println("계속 등록하시겠습니까? (y/n)");
			String answer = sc.next();
			
			System.out.println(strName1[idx]);
			
			if(idx >= strName1.length || answer.equals("n")) {
				System.out.println("회원등록을 마칩니다. 수고하셨습니다.");
				flag = false;
			}
			idx++;
		}

		System.out.println("등록된 회원님을 소개할까요?(y/n)");
		String answer = sc.next();
		
		if(answer.equals("y")) {
			for(int i = 0; i < idx; i++) {
				System.out.println((i+1) + "번째 회원님**********");
				System.out.println("이름: " + strName1[i]);
				System.out.println("나이: " + intAge[i]);
				System.out.println("몸무게: " + floatWeight[i]);
				
			}
		}
		else {
			System.out.println("프로그램을 종료합니다.");
			//System.exit(0);			// 자바 종료
		}
		
		
		// 배열복사1
		String[] strName2 = strName1;		// 주소 공유
		strName2[0] = "대한민국";
		System.out.println(strName1[0]);
		
		// 배열복사2
		String[] strName3 = new String[strName1.length];
		for(int i=0; i<strName1.length; i++) {
			strName3[i] = strName1[i];
		}
		
		// 배열복사3
		int[] intAge2 = new int[10];
		System.arraycopy(intAge, 1, intAge2, 2, 2);		// 원본(배열1), (배열1)카피시작점, 카피본(배열2), 카피본(배열2)시작점, 카피 갯수
		
		for(int age : intAge2) System.out.print(age + " ");
		
		// 배열복사4
		float[] floatWeight2 = Arrays.copyOf(floatWeight, 3);		// 원본 시작부터 지정 갯수까지 복사 (0,1,2)
		
		for(float weight : floatWeight2) System.out.print(weight + " ");
				
		sc.close();	

	}

}
