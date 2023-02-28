package step1_클래스와객체;

class Calculator{
	
	int num1, num2;
	
	void setNum(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	int add() {
		int sum = 0;
		sum = num1 + num2;
		return sum;
	}
	
	int sub() {
		return num1 - num2;
	}
	
	int mul() {
		return num1 * num2;
	}
	
	double div() {
		return num1 / (double) num2;
	}
	
}




public class C4_CalculatorEx {

	public static void main(String[] args) {
		
		// 객체 생성
		// num1, num2값 설정
		// 더하기
		// 빼기
		// 곱하기
		// 나누기
		
		Calculator c = new Calculator();
		c.setNum(10, 5);
		System.out.println(c.num1 + "+" + c.num2 + "=" + c.add());
		System.out.println(c.num1 + "-" + c.num2 + "=" + c.sub());
		System.out.println(c.num1 + "*" + c.num2 + "=" + c.mul());
		System.out.println(c.num1 + "/" + c.num2 + "=" + c.div());
		
		
		// 계산기2
		Calculator cal2 = new Calculator();
		cal2.setNum(150, 12);
		System.out.println(cal2.add());
		System.out.println(cal2.sub());
		System.out.println(cal2.mul());
		System.out.println(cal2.div());
		
		
		
	}
	
}
