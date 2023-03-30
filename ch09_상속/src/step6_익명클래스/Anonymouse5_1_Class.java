package step6_익명클래스;

abstract class Person1{
	String name = "홍길동";
	
	abstract void eat();
}

class Child1{
	Person1 p = new Person1() {
		String str = "피곤한 상태";
		
		@Override
		public void eat() {
			System.out.println("커피 수혈");
		}
	};
	
	void method1() {
		p.eat();
		//p.str;
	}

	
	void method2() {
		Person1 p1 = new Person1() {
			String str = "이얍";
			
			public void eat() {
				System.out.println("커피우유");
				study();
			}
			
			void study() {
				System.out.println("공부");
			}
		};
		
		p1.eat();
		//p1.study();
	}
	
	Person1 method3(Person1 p) {
		return p;
	}
	
}
public class Anonymouse5_1_Class {
	public static void main(String[] args) {
		Child1 ch = new Child1();
		Person1 pp = ch.method3(new Person1() {
			String str = "박길동";
			void study() {
				System.out.println("무엇이든 잘합니다.");
			}
			@Override
			public void eat() {
				System.out.println(name + "님은" + str + "님과 저녁을 먹습니다.");
				
			}
		});
		
		//pp.str = "유재석";
		//pp.study;
		pp.eat();
	}
}
