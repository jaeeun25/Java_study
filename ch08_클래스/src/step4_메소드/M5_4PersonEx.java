package step4_메소드;

import java.util.Scanner;

public class M5_4PersonEx {
	public static void main(String[] args) {
		
		M5_1Student st1 = new M5_1Student();
		st1.print();
		//st1.name;		// private이라 접근 불가
		
		M5_2Teacher tc1 = new M5_2Teacher();
		tc1.print();
		
		M5_3Manager m1 = new M5_3Manager();
		m1.print();

		// 실습 - 객체배열(학생, 선생님, 관리자)
		
		M5_1Student[] st = new M5_1Student[3];
		M5_2Teacher[] tc = new M5_2Teacher[3];
		M5_3Manager[] m = new M5_3Manager[3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<st.length; i++) {
			st[i] = new M5_1Student();
			tc[i] = new M5_2Teacher();
			m[i] = new M5_3Manager();
			
			System.out.print((i+1) + "번째 학생 이름, 나이, 반 입력 > ");
			st[i].setName(sc.next());
			st[i].setAge(sc.nextInt());
			st[i].setBan(sc.next());
			
			System.out.print((i+1) + "번째 선생님 이름, 나이, 과목 입력 > ");
			tc[i].setName(sc.next());
			tc[i].setAge(sc.nextInt());
			tc[i].setSubject(sc.next());
			
			System.out.print((i+1) + "번째 관리자 이름, 나이, 부서 입력 > ");
			m[i].setName(sc.next());
			m[i].setAge(sc.nextInt());
			m[i].setPart(sc.next());
			
			System.out.println("******************");
		}		
		
		for(int i=0; i<st.length; i++) {
			System.out.println((i+1) + "번째 객체 값들");
			System.out.println("******************");
			st[i].print();
			tc[i].print();
			m[i].print();
		}
	}
}
