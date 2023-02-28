package step1_클래스와객체;

// 설계도
class Circle {
	// 필드
	int radius;
	String name;
	
	// 생성자
	public Circle() {
		
	}
	
	// 메소드
	double getArea() {
		return 3.14 * radius * radius;
	}
	
	void setArea(int r){
		radius = r;
	}
}

// 실행 클래스
public class C2_피자 {
	public static void main(String[] args) {
		
		Circle pizza = new Circle();
		
		//pizza.radius = 10;
		
		pizza.setArea(10);
		pizza.name = "자바피자";
		
		double area = pizza.getArea();
		
		System.out.println(area);
		
		System.out.println("************************");
	
		Circle donut = new Circle();
		area  = donut.getArea();
		System.out.println(area);
	}
}
