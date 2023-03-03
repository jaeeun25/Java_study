package step5_접근지정자;

// 1. 같은 패키지에서 호출
public class A2_Protected_B {
	
	// default
	int age;
	
	public A2_Protected_B() {
		
		A2_Protected_A pa = new A2_Protected_A();
		pa.name = "홍길동";	// 2. 같은 디렉터리 접근 가능
	}
	
	int getAge() {
		return age;
	}
}
