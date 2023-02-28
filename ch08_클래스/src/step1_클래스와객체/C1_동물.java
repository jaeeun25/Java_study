package step1_클래스와객체;

class Animal{
	// 필드 - 이름, 나이, 키, 주소
	String name, address;
	int age;
	float height;	
	
	// 생성자
	Animal(){
		
	}
	
	// 메소드 - 말하기(), 달리기(), 먹기(), 소개하기()
	void speak() {
		System.out.println(name + "입니다.");
	}
	
	void run() {
		System.out.println("달리기");
	}
	
	void eat() {
		System.out.println("먹기");
	}
	void intro() {
		System.out.println("이름: " + name + "\n나이: " + age + "\n키: " + height + "\n주소: " + address);
	}
	
}

// 실행클래스
public class C1_동물 {
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.name = "강아지";
		animal.age = 5;
		animal.height = 15.6f;
		animal.address = "우리 집";
		
		animal.speak();
		animal.run();
		animal.eat();
		animal.intro();
		
		C1_사람 person = new C1_사람();
		
		person.name = "홍길동";
		person.age = 20;
		person.hp = "010-1111-1111";
		
		person.intro_human();
		
		
	}
}
