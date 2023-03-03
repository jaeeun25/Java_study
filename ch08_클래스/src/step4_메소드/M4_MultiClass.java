package step4_메소드;

class A{
	void a() {
		System.out.println("금요일");
	}
}

class B{
	void b() {
		System.out.println("토요일");
	}	
}

class C{
	void c() {
		System.out.println("일요일");
	}
}

public class M4_MultiClass {
	public static void main(String[] args) {
		
		A aObj = new A();
		B bObj = new B();
		C cObj = new C();
		
		aObj.a();
		bObj.b();
		cObj.c();
		
		
	}
}
