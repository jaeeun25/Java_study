package step3_생성자;

class Shape{
	
	// 정사각형의 넓이를 출력하는 생성자 (w)
	Shape(int w){
		System.out.println("정사각형의 넓이는 " + w*w +"입니다.");
	}
	// 직사각형의 넓이를 출력하는 생성자 (w, h)
	Shape(int w, int h){
		System.out.println("직사각형의 넓이는 " + w*h +"입니다.");
	}
	// 직육면체의 부피를 출력하는 생성자 (w, h, d)
	Shape(int w, int h, int d){
		System.out.println("직육면체의 부피는 " + w*h*d +"입니다.");
	}
}

public class C2_Rectangle {

	public static void main(String[] args) {
		Shape rect1 = new Shape(3);
		Shape rect2 = new Shape(2, 5);
		Shape rect3 = new Shape(2, 4, 6);
	}
}