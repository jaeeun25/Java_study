package step6_익명클래스;

interface A{
	String add(int num1, int num2);
}

public class Anonymouse1 {
	public static void main(String[] args) {
		
		// 방법1
		A a = new A() {
			@Override
			public String add(int num1, int num2) {
				return Integer.toString(num1 + num2);	// toString()은 static 메소드일 것 -> Integer.toString(), Integer가 대문자로 시작하니까 클래스이고, 클래스명.메소드는 static 메소드여야 가능.
			}
		};		// ; 찍어야함
		
		System.out.println("결과값: " + a.add(500, 400));
		
		System.out.println("*************");
		
		// 방법2
		// 메서드 하나인 인터페이스
		A b = (int num1, int num2) -> {
				return Integer.toString(num1 + num2);
			};		
		System.out.println("결과값: " + b.add(500, 300));
		
		System.out.println("*************");
		
		// 방법3
		// 실행문이 하나일 때(괄호, return 생략 가능)
		A c = (int num1, int num2) -> Integer.toString(num1 + num2);
			
		System.out.println("결과값: " + c.add(500, 200));
	}
}
