package step1_상속;

class Student{
	String name;
	int age;
	
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	void show() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}
	void print() {
		System.out.println("부모의 메소드");
	}
}

class StudentWorker extends Student{
	String degree;
	
	public StudentWorker(String name, int age, String degree) {
		super(name, age);			// 명시적
		this.degree = degree;
	}
	
	void show() {
		super.show();
		System.out.println("등급: " + degree);
		
	}
}

// 실행
public class Inher6 {
	public static void main(String[] args) {
		StudentWorker sw = new StudentWorker("홍길동", 20, "A+");
		sw.show();
		sw.print();
	}
}
