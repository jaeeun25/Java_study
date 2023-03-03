package step4_메소드;

import java.util.Scanner;

class Student2{
	String name;
	int age;
	String tel;
	
	Student2() {}
	
	Student2(String name, int age, String tel) {			// 생성자 만들어서 바로 값 초기화 시킬 수도 있음
		this.name = name;
		this.age = age;
		this.tel = tel;
	}
}

class S_Management{
	
	// 선언부(생성자에서 선언할 시 다른 메소드에서 쓸 수 없음)
	Student2[] st;
	
	S_Management(int size) {			// new S_Management(size) 시 실행됨
		st = new Student2[size];	
	}
	
	void register(Student2[] stArr) {		// stArr = st2
		// 넘어온 stArr을 st배열에 넘겨준다.(복사)
		st = stArr;
		
		// for문으로도 가능은 함
		/*
		for(int i=0; i<stArr.length; i++) {
			st[i] = stArr[i];
		}
		*/
	}
	
	Student2[] getStudentArr() {
		return st;
	}	
}

public class M8_학생관리Ex {
	public static void main(String[] args) {
		
		// 스캐너를 이용해 학생객체배열에 학생을 등록한다.		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생수 >");
		int size = sc.nextInt();
		
		Student2[] st2 = new Student2[size];
		
		for(int i=0; i<size; i++) {
			System.out.println((i+1) + "번째 학생을 등록합니다.");
			
			// 1. 학생의 객체를 생성하고
			Student2 s = new Student2();		// 학생 객체
			System.out.print("학생이름 > ");
			s.name = sc.next();
			
			System.out.print("학생나이 > ");
			s.age = sc.nextInt();
			
			System.out.print("학생전화번호 > ");
			s.tel = sc.next();
			// 2. 학생을 담을 수 있는 배열 속에 만들어진 객체를 넣는다.
			st2[i] = s;		// 배열에 객체를 넣음
		}

		// 등록을 맞쳤으면.. 학생관리 프로그램의 register()메소드를
		// 활용해서 학생관리에 만들어져 있는 st배열에 넘긴다
		S_Management m = new S_Management(size);
		m.register(st2);

		// 학생관리 속의 get메소드를 통해서 학생 관리 속의 st배열을 리턴받아온다
		// 그리고 전체를 출력한다.
		
		Student2[] getArr = m.getStudentArr();
		
		for(Student2 s : getArr) {
			System.out.println("*********************");
			System.out.println("이름: " + s.name);
			System.out.println("나이: " + s.age);
			System.out.println("전화번호: " + s.tel);
		}
	}
}
