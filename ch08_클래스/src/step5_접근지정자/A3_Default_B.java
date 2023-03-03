package step5_접근지정자;

// 1. 같은 패키지에서 호출
public class A3_Default_B {
	
	// default
	int age;
	
	public A3_Default_B() {
		
		A2_Protected_A pa = new A2_Protected_A();
		pa.name = "홍길동";	// 2. 같은 패키지 겁근 가능 - 디폴트
	}
	
	int getAge() {
		return age;
	}
}
