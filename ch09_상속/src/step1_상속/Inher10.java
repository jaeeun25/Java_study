package step1_상속;

class A4{
	A4(){
		System.out.println("생성자 A");
	}
	A4(int x){
		System.out.println("생성자 A - 매개변수 있음");
	}
}
class B4 extends A4{
	B4(){
		this(3);
		System.out.println("생성자 B");
	}
	B4(int x){
		super(x);
		System.out.println("생성자 B - 매개변수 있음");
	}
}
class C4 extends B4{
	C4(){
		System.out.println("생성자 C");
	}
	C4(int x){
		System.out.println("생성자 C - 매개변수 있음");
	}
	// 메소드
	void print() {
		System.out.println("생성자 우선순위에 대한 학습입니다.");
	}
}

public class Inher10 {
	public static void main(String[] args) {
		
			C4 c1 = new C4();
			System.out.println("**************");
			C4 c2 = new C4(3);
	}
}
