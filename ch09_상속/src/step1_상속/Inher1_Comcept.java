package step1_상속;
// 한 파일에 클래스가 여러개일때 public은 하나여야 함

class A{
	public int p;
	private int n;
	
	public void setN(int n) {
		this.n = n;
	}
	public int getN() {
		return n;
	}
}

class B extends A{
	private int m;
	public void setM(int m) {
		this.m = m;
	}
	public int getM() {
		return m;
	}
	public String toString() {
		return getN() + " " + getM();
	}
}

public class Inher1_Comcept {
	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		
		// 자기 것
		a.p = 5;
		//a.n = 10;		// n이 private이라 다른 클래스에서 접근 불가
		a.setN(10);
		
		// 상속관계에 있는 클래스 - 자식
		b.p = 20;		// 자식에서 부모의 필드 p 접근
		//b.n = 100;	// private으로 접근불가
		b.setN(100);	// 자식에서 부모 메소드 호출
		
		b.setM(25);
		System.out.println(b.toString());
	}
}
