package step2_필드;

//p277 - 정적 메소드 선언 시 주의할 점

class Car{
	// 자바는 멤버 변수에 값을 넣지 않으면 String 객체는 null, int는 0으로 초기화 된다.
	String color;
	//int speed;			// 멤버 변수
	static int speed;		// 정적 변수 - 특정 객체에 종속되지 않고 객체 간 공유
	
	void speedUp() {
		System.out.println(speed + "속도를 올렸습니다.");
	}
	
	void print() {
		System.out.println("색상: " + color);
		System.out.println("속도: " + speed);
	}
}


public class V2_초기화Ex {
	public static void main(String[] args) {
		
		System.out.println("****myCar****");
		
		Car myCar = new Car();
		myCar.color = "초록";
		myCar.speed = 100;
		myCar.print();
		
		System.out.println("****yourCar****");
		
		Car yourCar = new Car();
		yourCar.color = "노랑";
		yourCar.speed = 120;
		yourCar.print();
		
		System.out.println("****myCar****");
		
		myCar.print();		// speed에 static 붙일 시 속도: 120으로 출력됨
		
	}
}