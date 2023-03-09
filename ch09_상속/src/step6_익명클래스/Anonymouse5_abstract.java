package step6_익명클래스;

/*
	. 필드 - 전역변수
	. 메소드 안에서 - 지역클래스
	. main()넘겨줄때 - 의존성 주입
*/

interface Person{
	String name = "홍길동";
	void wake();
	void eat() ;
}
class Child{
	//Person field = new Person(); 		// 이런형태가 제일 많음
	Person field = new Person() {
		// 원본에 필드, 클래스 추가
		// 새로 추가한건 이 안에서만 사용 가능
		String str = "헬스";
		void work() {
			System.out.println("출근합니다.");
		}
		void hobby() {
			System.out.println(name + "님은" + str + "님과 음악취미가 같습니다.");
		}
		
		@Override
		public void wake() {
			System.out.println("6시에 일어납니다.");
		}
		@Override
		public void eat() {
			System.out.println("더 맛있게 먹습니다.");
			work();
			hobby();
		}
	};
	
	void method1() {
		field.wake();
		field.eat();
		/*
		//신규로 추가된 것들은 밖에서 호출되지 않음
		field.str = "김길동";
		field.work();
		field.hobby();
		
		// 다 안됨
		local.wake();
		local.eat();
		local.str = "김길동";
		local.work();
		local.hobby();
		*/
	}
	
	void method2() {
		Person local = new Person() {
			String str = "헬스";
			void work() {
				System.out.println("출근합니다.");
			}
			void hobby() {
				System.out.println(name + "님은" + str + "님과 음악취미가 같습니다.");
			}
			
			@Override
			public void wake() {
				System.out.println("6시에 일어납니다.");
			}
			@Override
			public void eat() {
				System.out.println("더 맛있게 먹습니다.");
				work();
				hobby();
			}
		};
		
		
		local.wake();
		local.eat();
		
		//local.str = "김길동";
		//local.work();
		//local.hobby();		
	}
	void method3(Person p) {
		
	}
}

public class Anonymouse5_abstract {
	public static void main(String[] args) {
		Child ch = new Child();
		ch.method3(new Person() {
			String str = "강호동";
			void study() {
				System.out.println("무엇이든 잘합니다.");
			}
			@Override
			public void eat() {
				System.out.println(name + "님은" + str + "님과 저녁을 먹습니다.");
				study();
				
			}
			@Override
			public void wake() {
				// TODO Auto-generated method stub
				
			}
		});
	}
}
