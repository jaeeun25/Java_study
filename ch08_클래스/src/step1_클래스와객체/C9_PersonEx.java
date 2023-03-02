package step1_클래스와객체;

class A{
	String str = "홍길동";
	
	// 생성자는 반환 타입이 없다. void를 선언하지 않는다.
	A(){}					// 생략 가능(만든 생성자가 없다면)
	
	A(String str){			// 매개변수는 지역변수로 봄
		this.str = str;
		System.out.println("나는 생성자야");
	}
	
	// 반환 없는 메소드
	void speak(){
		System.out.println("저의 이름은 " + str + "입니다.");
	}
	
	// 반환 있는 메소드
	String getName(){
		return str;
	}
	
}

public class C9_PersonEx {

	public static void main(String[] args) {
		
		A a = new A();
		
		//a.str = "김길동";
		a.speak();
		
		A b = new A("최길동");		// 생성과 동시에 생성자 실행 --> 생성자 안 구문 전부 실행
		b.speak();

	}

}