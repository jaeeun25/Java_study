package step6_익명클래스;

interface A1{
	int sum(int num1, int sum2);		// 반환타입 있고, 인터페이스에 메소드 하나
}

public class Anonymouse2_LamdaEX {
	public static void main(String[] args) {
		A1 a = new A1() {
			@Override
			public int sum(int num1, int num2) {
				return num1 + num2;
			}
		};
		System.out.println("결과값: " + a.sum(10, 8));
		System.out.println("**********");
		
		A1 a1 = (int num1, int num2) -> {
			return num1 + num2;
		};
		System.out.println("결과값: " + a1.sum(10, 7));
		System.out.println("**********");
		
		A1 a2 = (int num1, int num2) -> num1 + num2;
		System.out.println("결과값: " + a.sum(10, 6));
		
	}
}
