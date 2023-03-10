package Class;

/*
	Class클래스
		.클래스와 인터페이스의 메타데이터를(클래스이름, 생성자/필드/메소드 정보)를
		 java.lang.Class로 자바는 관리한다.
		.forName();		- 클래스의 정보 객체를 생성한다.
		.newInstance(); - 동적으로 객체를 생성한다
		
		.Class<?> getClass : Object
*/

class Student{
	String name;
	int age;
	void introduce() {
		System.out.println(name + "님은 " + age + "살 입니다.");
	}
}

class Teacher{
	String name;
	int ban;
	void introduce() {
		System.out.println(name + "님은 " + ban + "반 담임선생님입니다.");
	}
}


public class C1_ClassEx {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		//1. 객체생성
		Student st1 = new Student();
		st1.name = "홍길동";
		st1.age = 20;
		st1.introduce();
		
		System.out.println("***************************");
		
		//2. forName()
		try {
			Class clazz2 = Class.forName("Class.Student");		// Student 클래스의 정보 객체 생성 -> 생성자/필드/메소드 정보
			Object obj = clazz2.newInstance();					// 동적으로 객체 생성
			Student st4 = (Student) obj;
			st4.name = "홍길동";
			st4.age = 40;
			st4.introduce();
			
		} catch(ClassNotFoundException e) {
			System.out.println("클래스를 찾을 수 없습니다.");
		} catch (InstantiationException e) {
			System.out.println("객체를 생성할 수 없습니다.");
		} catch (IllegalAccessException e) {
			System.out.println("접근할 수 없습니다.");
		}
		
		
		// 실습
		// 객체먼저 생성
		Teacher t = new Teacher();
		
		try {
			Class clazz3 = Class.forName("Class.Teacher");
			Object obj2 = clazz3.newInstance();
			Teacher t2 = (Teacher) obj2;
			t2.name = "김길동";
			t2.ban = 5;
			t2.introduce();			
		} catch(ClassNotFoundException e) {
			System.out.println("클래스를 찾을 수 없습니다.");
		}	
	}
}
