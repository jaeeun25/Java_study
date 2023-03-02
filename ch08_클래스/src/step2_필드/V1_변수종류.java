package step2_필드;

/*
	1. 전역변수
	2. 참조변수(instance 변수)
	3. 지역변수
	4. 클래스변수(static변수, 정적변수)
	5. 매개변수
*/

class Variable{			
	int a = 10;				// 멤버변수(필드), 전역변수	-> (static 없는건 멤버변수라고 부르기도 함)
	String b = "가";			// 참조변수
	static int c = 20;		// 정적변수(클래스 변수)
	
	void print(int n) {		// 매개변수
		int j = 3;			// 지역변수
		
		System.out.println("a값은 " + a + ", b값은 " + b + ", c값은 " + c + ", j값은" + j);
		System.out.println(n);
	}
	
	void print2() {
		System.out.println("a: " + a + ", b: " + b + ", c: " + c + ", j: 불가");
	}
	
}

public class V1_변수종류 {

	public static void main(String[] args) {
		
		// 정적변수(클래스 변수, static 변수)
		/*
			. static이 붙으면
				- 객체를 생성하는 것이 아니라  
				     클래스명.변수, 클래스명.메소드() 문법으로 접근
				- 객체에 종속되는 것이 아니며
				- 객체 간의 공유된다.
				- 생성의 시점은 제일 먼저 된다.
				 
		*/
		int num = Variable.c;			// c는 static이 있기 때문에 객체를 생성하지 않고 부를 수 있음	--> 객체들끼리 공유 즉, 객체명.변수명이 아닌 클래스.변수명으로 접근
		
		System.out.println(num);
	}

}