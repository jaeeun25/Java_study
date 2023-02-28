package ch01.start2;

// 한 줄 주석
/*
	여러 줄 주석 : ctrl + shift + /
	
	1. 파일명은 클래스명과 일치해야 한다.
	2. main() 메소드에서 실행된다.
	3. 변수는 데이터 타입을 선언 후에 사용할 수 있다.
	
	4. 출력(print)
	 - System.out.println()
	  1) println()	: 줄바꿈(개행)
	  2) print()	: 줄바꿈 x
	  3) printf("저의 이름은 %s이고 나이는 %d입니다.", "홍길동", 20)	: 폼을 이용해 출력
	  
*/
public class Print1 {
	public static void main(String[] args) {
		
		// print
		System.out.print("Hello \n");
		System.out.print("Java \n");
		
		//println
		System.out.println("Hello");	
		System.out.println("Java");
		
		//printf - %s 문자열, %d 정수, %f 실수
		System.out.printf("%s %s\n", "Hello", "Java");
		System.out.printf("%s: %.4f", "국어", 89.123456789);	// %.4f: 소숫점 4자리
		
		
	}
}