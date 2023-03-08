package step5_포함관계;

class Outer{
	private int num = 10;
	private static int sNum = 20;
	String name = "아우터";
	
	Inner inner;
	
	public Outer(){ 
		inner = new Inner(); 
	}

	public class Inner{
		int score = 15;
		void print() {
			System.out.println("재밌습니다.");
			System.out.println(num);		// private 바깥쪽 멤버
			System.out.println(sNum);		// private 바깥쪽 정적멤버
			System.out.println(name);		// 바깥쪽 멤버변수
			// private 붙어있어도 접근 가능
		}
	}
}

public class Inner3 {
	public static void main(String[] args){
	
		Outer o = new Outer();
		Outer.Inner oi = o.new Inner();
		
		oi.print();
		System.out.println(oi.score);
		oi.score = 25;
		System.out.println(oi.score);
		
		// private때문에 접근 불가  -> Inner 클래스 내부에선 접근 가능
		//int num = o.num;
		//int num2 = o.sNum;
		
		System.out.println(o.name);		
	
		System.out.println("**************");
		
		// 생성자를 통한 내부객체 생성
		Outer o2 = new Outer();
		
		o2.inner.print();
		System.out.println(o2.inner.score);
		o2.inner.score = 5;
		System.out.println(o2.inner.score);
	}
}
