package step1_상속;

/*
	Car
	move() - "생생달립니다"출력
	
	  |
	_________________
	|		|		|
	Bus  Ambulance FireEngine
	- Car[]에 각각의 객체를 업캐스팅해서 저장한다
	- for문으로 전체를 출렵한다.
*/

class Car{
	String name = "자동차";
	void move() {
		System.out.println("이동합니다.");
	}
}

class Bus extends Car{
	String name = "버스";
	@Override
	void move() {
		System.out.println("40명을 태우고 이동합니다.");
	}
}

class Ambulance extends Car{
	String name = "엠뷸런스";
	@Override
	void move() {
		System.out.println("싸이렌을 울리며 이동합니다.");
	}
	void special() {
		System.out.println("환자를 태우고 있습니다.");
	}
}

class FireEngine extends Car{
	String name = "소방차";
	@Override
	void move() {
		System.out.println("물을 뿌리며 이동합니다.");
	}
}

// 자동차 관리
class CarManagement{
	// 메소드
	Car print(Car c) {	// Car c = ab		// 업캐스팅
		
		// Ambulance 객체의 name 값을 "긴급호송차"로 초기화 하고
		// Car 타입으로 반환한다.
		
		Ambulance am = (Ambulance) c;		// 다운캐스팅
		am.name = "긴급호송차";
		
		c = am;		// 업캐스팅
		
		return c;
	}
}

public class Inher9 {
	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.move();
		
		Bus c2 = new Bus();
		c2.move();
		
		Car c3 = new Bus();		// 업캐스팅
		c3.move();
		
		System.out.println("*******************");
		
		Car[] cars = new Car[3];
		
		cars[0] = new Bus();
		cars[1] = new Ambulance();
		cars[2] = new FireEngine();
		
		for(Car c : cars) {
			System.out.println(c.name);			// 필드는 다 부모에 저장된 값인 '자동차' 출력
			c.move();							// 오버라이딩은 메소드에만 해당(필드는 x)
			
			if(c instanceof Ambulance) {		// Ambulance를 참조하고 있다면
				// 다운캐스팅을 해야 special()를 부를 수 있다
				Ambulance am = (Ambulance) c;
				am.special();
			}
		}
		
		// 객체전달 (업캐스팅)
		Ambulance ab = new Ambulance();
		CarManagement cm = new CarManagement();
		Car myCar = cm.print(ab);
		
		// Ambulance의 name 값 출력
		Ambulance a = (Ambulance) myCar;		// 다운캐스팅
		System.out.println(a.name);
	}
}
