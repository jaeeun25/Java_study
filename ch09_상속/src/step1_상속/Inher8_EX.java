package step1_상속;

/*
	Shape
	draw() - "Sahpe"출력
	
	  |
	_________________
	|		|		|
	Line   Rect	   Circle
	draw() draw()  draw()
		- 업캐스팅
		- 오버라이딩
		- 출력: 선을 그립니다.
			      사각형을 그립니다.
			      원을 그립니다.
*/

class Shape{
	void draw() {
		System.out.println("Sahpe");
	}
}

class Line extends Shape{
	@Override
	void draw() {
		System.out.println("선을 그립니다.");
	}
}

class Rect extends Shape{
	@Override
	void draw() {
		System.out.println("사각형을 그립니다.");
	}
}

class Circle extends Shape{
	@Override
	void draw() {
		System.out.println("원을 그립니다.");
	}
}

public class Inher8_EX {
	public static void main(String[] args) {
		Shape s1 = new Line();
		Shape s2 = new Rect();
		Shape s3 = new Circle();
		
		s1.draw();
		s2.draw();
		s3.draw();
		
	}
}
