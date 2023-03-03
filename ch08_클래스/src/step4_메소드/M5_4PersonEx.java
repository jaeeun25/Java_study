package step4_메소드;

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
		
		for(int i=0; i<st.length; i++) {
			st[i] = new M5_1Student();
			tc[i] = new M5_2Teacher();
			m[i] = new M5_3Manager();
			
			st[i].setName("학생" + (i+1));
			tc[i].setName("선생님" + (i+1));
			m[i].setName("관리자" + (i+1));
			
			System.out.println((i+1) + "번째 객체 값들");
			System.out.println("******************");
			st[i].print();
			tc[i].print();
			m[i].print();
		}		
	}
}
