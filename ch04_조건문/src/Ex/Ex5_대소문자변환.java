package Ex;

import java.util.Scanner;

public class Ex5_대소문자변환 {

	public static void main(String[] args) {

		// 입력받은 문자가 소문자 -> 대문자
		// 입력받은 문자가 대문자 -> 소문자
		
		// 아스키코드표의 값을 참조하세요.
		
		System.out.print("알파벳 입력 >> ");
		Scanner sc = new Scanner(System.in);
		
		char c = sc.next().charAt(0);	// 문자하나 입력받기
		char change = 0;
		
		if((c >= 'A') && (c <= 'Z')) {
			change = (char) (c + 32);
		}
		else if((c >= 'a') && (c <= 'z')){
			change = (char) (c - 32);
		}
		
		System.out.println(c + " --> " + change);
		
		/*
		// 해설
		String str = sc.next();
		char[] charArr = str.toCharArray();		// 쪼개서 배열에 넣고
		char alphabet = charArr[0];				// 한글자만 꺼내서 저장
		int n;
		
		if(alphabet >= 'a' && alphabet <= 'z') {
			n = alphabet-('A'+'a');		// 'A'-'a'  -->  32
		}
		else {
			n = alphabet-('A'-'a');
		}
		System.out.println((char)n);
		*/		
		
		sc.close();
	}

}
