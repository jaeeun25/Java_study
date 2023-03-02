package step4_메소드;

class Student{
	String name = "홍길동";
}

class Data{
	int kor;
	int eng;
	
	// 객체 d1->t1, d2->t2로 받아서
	Data add(Data t1, Data t2) {
		// 값을 변경하고
		t1.kor = t2.eng;
		System.out.println("d1.kor:" + t1.kor);
		System.out.println("d2.eng:" + t2.eng);
		
		// t1 객체만 리턴한다
		return t1;
	}
	
	Student add(Data t1, Data t2, Student st) {
		System.out.println(st.name);
		st.name = st.name+"님";
		
		return st;
	}
}

public class M2_객체전달 {
	public static void main(String[] args) {
		
		//1. 객체를 전달하려면.. 객체가 준비되어야 한다
		Data d1 = new Data();
		Data d2 = new Data();
		Data d3 = new Data();

		d1.kor = 70;
		d2.eng = 80;
		
		//2. 메소드에 매개변수로 객체를 전달한다
		Data d4 = d3.add(d1, d2);
		
		System.out.println("**********");
		System.out.println("d4.kor=" + d4.kor);
		System.out.println("d4.eng=" + d4.eng);		
	
		//*****************************************
		
		Student st = new Student();
		Data d5 = new Data();
		Student k = d5.add(d1, d2, st);
		System.out.println(k.name);		
	}
}