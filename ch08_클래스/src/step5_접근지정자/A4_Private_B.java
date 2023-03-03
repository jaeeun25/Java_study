package step5_접근지정자;

// 1. 같은 패키지에서 호출
public class A4_Private_B {
	
	int age;
	
	public A4_Private_B() {
		
		A4_Private_A pa = new A4_Private_A();
		
		// private는 다른 클래스에서 받을 수 없다
		//pa.name = "홍길동";
	}
	
	int getAge() {
		return age;
	}
}
