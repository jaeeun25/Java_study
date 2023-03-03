package step5_접근지정자;

// 1. 같은 패키지에서 호출
public class A1_PublicB {
	
	int age;
	
	public A1_PublicB() {
		
		A1_PublicA pa = new A1_PublicA();
		pa.name = "홍길동";
	}
	
	int getAge() {
		return age;
	}
}
