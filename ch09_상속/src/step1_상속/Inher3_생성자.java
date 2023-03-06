package step1_상속;

// 같은 패키지에 같은 클래스명 안됨.
class A1{
	A1(){
		System.out.println("생성자A");
	}
	A1(int x){
		System.out.println("생성자A에 매개변수 1개");
	}
}

class B1 extends A1{
	B1(){
		super(15);
		System.out.println("생성자B");
	}
	B1(int x){
		System.out.println("생성자B에 매개변수 1개");
	}
}

class C1 extends B1{
	C1(){			// 상속받은 경우 부모 기본 생성자를 찾는다.
		super(10);	// 이런 경우 기본 생성자가 아닌  해당 형식에 맞는 생성자 찾음(기본 생성자가 없으면 명시적으로 생성자를 지정해 줘야함)
		System.out.println("생성자C");
	}
	
	C1(int x){
		System.out.println("생성자C에 매개변수 1개");
	}
	
	void print() {
		System.out.println("생성자 우선순위에 대한 학습");
	}
}

public class Inher3_생성자 {
	public static void main(String[] args) {
		C1 c = new C1(5);	// 출력순서: 생성자A , 생성자B , 생성자C+매개변수1개
		C1 c1 = new C1();	// 출력순서: 생성자A , 생성자B+매개변수1개 , 생성자C
	}
}
