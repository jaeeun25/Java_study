package step2_추상클래스;

// CalculatorEx 질문 이어서
// -> 상속받는 클래스에 같은이름의 변수명이 없는 경우 super말고 this도 가능하다.
// -> 하지만 개념적으로나 가독성 등을 고려해 super를 사용하는게 좋음

abstract class TA{
	int num1;
	int num2;
	
	abstract void setValue1(int num1, int num2);
	
	void setValue2(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	void setValue3(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
}

class TB extends TA{
	// 필드가 없으면 this를 사용해도 부모의 num1과 num2 값을 바꿀수 있음.
	// 자식에게 동일한 변수가 있다면? -> super로 명시해야만 부모의 값을 변경 가능
	//int num1;
	//int num2;
	
	@Override
	void setValue1(int num1, int num2) {
		super.num1 = num1;
		super.num2 = num2;
	}
	
	@Override				// this
	void setValue2(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	@Override				// super
	void setValue3(int num1, int num2) {
		super.num1 = num1;
		super.num2 = num2;
	}
	
}

public class TestA {
	public static void main(String[] args) {
		
		TA ta = new TB();		// 업캐스팅
		
		// 부모에서 부모필드 값을 설정(직접 값 넣기)
		ta.num1 = 100;
		ta.num2 = 200;
		System.out.println(ta.num1);
		System.out.println(ta.num2);
		
		// 자식에서 부모의 필드를 this로 설정
		System.out.println("***this***");
		ta.setValue2(300, 400);
		System.out.println(ta.num1);
		System.out.println(ta.num2);
		
		// 자식에서 부모의 필드를 super로 설정
		System.out.println("***super***");
		ta.setValue3(300, 400);
		System.out.println(ta.num1);
		System.out.println(ta.num2);
	}
}
