package step1_클래스와객체;

import java.util.Scanner;

// 기본 데이터 타입 변수와 객체 변수 차이점 비교

class Student{
	String name = "홍길동";
	int kor = 100;
	int eng = 88;
}

public class C10_변수연산 {
	public static void main(String[] args) {
		
		Student st1 = new Student();
		Student st2 = new Student();
		
		// st1 == st2?	--> false
		if(st1 == st2) {
			System.out.println("st1과 st2는 같은 객체입니다.");
		}
		else {
			System.out.println("st1과 st2는 다른 객체입니다.");
		}
		
		// st1의 name과 st2의 name이 같은가?	--> true
		if(st1.name == st2.name) {
			System.out.println("st1의 name과 st2의 name 값은 같습니다.");
		}
		else {
			System.out.println("st1의 name과 st2의 name 값은 다릅니다.");
		}
		
		Student st3 = st2;		// 객체를 대입(전달 - 주소를 준 것)
		
		// st1 == st3?	--> false
		// st2 == st3?	--> true
		if(st1 == st3) {
			System.out.println("st1과 st3는 같은 객체입니다.");
		}
		else if(st2 == st3) {
			System.out.println("st2과 st3는 같은 객체입니다.");
		}
		
		
		st1.name = "김길동";
		st2.name = "정길동";
		if(st1.name.equals("김길동")) {
			System.out.println("name의 값은 같습니다.");
		}
		else {
			System.out.println("name 값은 다릅니다.");
		}
		
		if(st1.name == "김길동") {
			System.out.println("name의 값은 같습니다.");
		}
		else {
			System.out.println("name 값은 다릅니다.");
		}
		
		// 스캐너로 받아보자
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 홍길동으로 두번 입력해 주세요>> ");
		String n1 = sc.next();
		String n2 = sc.next();
		
		System.out.println("***************************");
		if(n1 == "홍길동") {
			System.out.println("n1의 값이 홍길동으로 같습니다.");
		}
		else{
			System.out.println("n1의 값이 홍길동과 다릅니다.");
		}
		
		if(n1.equals("홍길동")) {
			System.out.println("n1이 홍길동과 같습니다.");
		}
		else {
			System.out.println("n1의 값이 홍길동과 다릅니다.");
		}
		
		System.out.println("***************************");
		if(n1 == n2) {
			System.out.println("n1과 n2는 같다.");
		}
		else {
			System.out.println("n1과 n2는 다르다.");
		}
		
		if(n1.equals(n2)) {
			System.out.println("n1과 n2의 값은 같다.");
		}
		else {
			System.out.println("n1과 n2는 다르다.");
		}
		
		/*
		
		. 문자열을 다루는 데 있어 알아야 할 사항
			- 문자열을 생성하는 방법은 두 가지가 있다.
				1) String str = new String("안녕");
				2) String str ="안녕";
			
			- 스트링 리터럴: 자바 내부적으로 '리터럴 테이블'로 특별히 관리되는 테이블이 JVM스티링 리터럴 테이블이 존재한다.
			
				String a = "Hello";		a --> Hello
				String b = "Java";		b --> Java
				String c = "Hello";		c --x --> a 것을 공유
			스트링 객체: new String();
				.힙 메모리에 생성된다.
				String d = new String("Hello");	d --> Hello
				String e = new String("Java");	e --> Java
				String f = new String("Hello);	f --> Hello
		
		*/
		
	}
}
