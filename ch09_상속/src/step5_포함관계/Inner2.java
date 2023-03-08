package step5_포함관계;

class A{
	String name;
	
	A(String name){
		this.name = name;
	}
	
	//***********************
	class B{
		int age = 35;
		B(){};
		B(int age){
			this.age = age;
		}
	}
	//************************
	
	B getB() {
		return new B();
	}
	//************************
	static class C{
		String address = "서울";
	}
	//************************
	interface D{
		void print();
		
	}
	//************************
	class E implements D{
		@Override
		public void print() {
			System.out.println("인터페이스를 구현했습니다.");
		}
	}
	void F() {
		class G{
			void print() {
				System.out.println("메소드 안에 구현된 클래스 - 로컬클래스");
			}
		}
		G g = new G();
				
	}
}

public class Inner2 {
	public static void main(String[] args) {
		
		// 클래스
		A a = new A("홍길동");
		
		A.B b = a.new B(20);
		System.out.println(b.age);
		
		A a2 = new A("이길동");
		A.B b2 = a.getB();
		System.out.println(b2.age);
		
		// 정적클래스
		A c = new A("박길동");
		A.C d = new A.C();
		System.out.println(d.address);
		
		System.out.println(a.name + "님의 나이는 " + b.age + "살이고 " + d.address + "에 살고 있습니다.");
		
		
		// 인터페이스
		A e = new A("길동이");
		A.E f = e.new E();
		f.print();
	}
}