package bak;

// 다른 패키지에서 부르니까 public 이어야 함.
public interface Shape {
	final static double PI = 3.14;
	
	// abstract 생략되어 있는 것
	void draw();
	double getArea();
	
	default void redraw() {
		System.out.println("**** 다시 그립니다 ****");
		draw();
	}
}
