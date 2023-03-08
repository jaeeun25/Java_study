package step5_포함관계;

class Outer2{
	
	int width;
	int height;

	// 방법3
	Inner2 inner;
	public Outer2(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		inner = new Inner2(depth);
	}
	
	// 방법2
	public Outer2(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	class Inner2{
		int depth;
		public Inner2(int depth) {
			this.depth = depth;
		}
		public int volume() {
			return width * height * depth;
		}
	}
	
	// 방법1
	// 내부객체를 반환하는 메소드 getInner()를 구현하시오.
	Inner2 getInner(int d) {
		return new Inner2(d);
	}
}

public class Inner4Ex {
	public static void main(String[] args) {
		// 객체 생성
		// 초기화 시키고
		Outer2 outer = new Outer2(10, 20);
		// inner 생성 세가지 방법
		Outer2.Inner2 inner = outer.new Inner2(5);
		Outer2.Inner2 inner2 = outer.getInner(2);		// 메소드 이용 객체 생성
		Outer2 outer2 = new Outer2(2, 3, 4);			// 생성자		// outer 객체 생성하면서 inner 객체도 생성자에서 생성
		
		// 값출력
		System.out.println("부피는 " + inner.volume() + "입니다.");
		System.out.println("부피2는 " + inner2.volume() + "입니다.");
		System.out.println("부피3는 " + outer2.inner.volume() + "입니다.");
	}
}
