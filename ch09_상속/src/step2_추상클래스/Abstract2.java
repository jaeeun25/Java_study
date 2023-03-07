package step2_추상클래스;

import java.text.DecimalFormat;

abstract class Shape{
	abstract void draw();
	abstract double computeArea(double a, double b);
}

class Circle extends Shape{
	void draw() {
		System.out.println("원을 그립니다.");
	}
	
	double computeArea(double a, double b) {
		System.out.print("원의 면적: ");
		return a * b * 3.14;	// a, b 반지름이라는 가정
	}
}

class Rectangle extends Shape{
	void draw() {
		System.out.println("사각형을 그립니다.");
	}
	
	double computeArea(double a, double b) {
		System.out.print("사각형의 면적: ");
		return a * b;
	}
}

class Triangle extends Shape{
	void draw() {
		System.out.println("삼각형을 그립니다.");
	}
	
	double computeArea(double a, double b) {
		System.out.print("삼각형의 면적: ");
		return (a * b) / 2;
	}
}

public class Abstract2 {
	public static void main(String[] args) {
		/* computeArea 리턴타입 void 였을 때
		Shape s = new Circle();
		s.draw();
		s.computeArea(10.5, 10.5);
		
		s = new Rectangle();
		s.draw();
		s.computeArea(10.5, 21.4);
		
		s = new Triangle();
		s.draw();
		s.computeArea(10.5, 21.4);
		*/
		//***********************************
		
		Shape[] sa = new Shape[3];
		sa[0] = new Circle();
		sa[1] = new Rectangle();
		sa[2] = new Triangle();
		
		DecimalFormat df = new DecimalFormat("#,###.#");
		for(Shape ss : sa) {
			ss.draw();
			String value = df.format(ss.computeArea(5.6, 5.6));
			System.out.println(value);
			System.out.println("******************");
		}
		
	}
}
