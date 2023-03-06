package step1_상속;

class Person{
	String name;
	String id;
	public Person(String name) {
		this.name = name;
	}
	void introduce(String str) {
		System.out.println("저는 부모입니다.");
	}
}

class Student2 extends Person{
	String grade;
	public Student2(String name) {
		super(name);
	}
	
	@Override
	void introduce(String str) {
		System.out.println("저는 자식입니다.");
	}
}

public class Inher7_Upcasting {
	public static void main(String[] args) {
		
		//업 캐스팅
		Person p = new Student2("홍길동");
		
		Person p2;
		p2 = new Student2("김길동");

		Person p3;
		Student2 st = new Student2("권길동");
		p3 = st;
		
		//부모 접근
		//System.out.println(p.grade);	// grade는 자식 필드. 자식 것은 안됨
		System.out.println(p.name);		// 부모 것은 가능
		System.out.println(p.id);		// 부모 것은 가능
	
		//다운 캐스팅				
		Student2 st2 = (Student2) p;	// 업 캐스팅한 자식클래스 복구 -> 다운 캐스팅
		System.out.println(st2.grade);	// 자식
		System.out.println(st2.name);	// 부모
		System.out.println(st2.id);		// 부모
		
		//동적 바인딩  -> 업 캐스팅 된 상태 + 자식 클래스가 오버라이딩한 메소드 존재하는 경우
		p3.introduce("홍길동");			// p3는 Person인데 출력문은 '저는 자식입니다.' 출력
		p2.introduce("");
		p.introduce("");
	}
}
