package step1_상속;

/*
	Animal
	speak() - "크게 웃습니다"출력
	
	  |
	_________________
	|		|		|
	강아지    고양이	         닭
	멍멍 짖습니다
		야옹하고 웃습니다
		 			꼬기오하고 웃습니다.
*/

class Animal{
	void speak() {
		System.out.println("크게 웃습니다");
	}
}

class Dog extends Animal{
	@Override
	void speak() {
		System.out.println("멍멍 짖습니다.");
	}
}

class Cat extends Animal{
	@Override
	void speak() {
		System.out.println("야옹하고 웃습니다.");
	}
}

class Chicken extends Animal{
	@Override
	void speak() {
		System.out.println("꼬끼오하고 웃습니다.");
	}
}

public class Inher8_1_EX {
	public static void main(String[] args) {
		Animal a1 = new Dog();
		Animal a2 = new Cat();
		Animal a3 = new Chicken();
		
		a1.speak();
		a2.speak();
		a3.speak();
		
	}
}
