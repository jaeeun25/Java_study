package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Set2 {
	public static void main(String[] args) {
		
		HashSet<Student> hs = new HashSet<Student>();
		
		Student st1 = new Student();
		st1.setName("홍길동");
		st1.setTel("010-1111-2222");
		st1.setAddress("서울 마포구 신수동");
		
		hs.add(st1);
		
		// 출력방식1
		for(Student st : hs) {
			System.out.println("이름: " + st.getName());
			System.out.println("연락처: " + st.getTel());
			System.out.println("주소: " + st.getAddress());	
		}
		
		System.out.println("*****************");
		
		// 출력방식2 - Iterator를 활용한 출력
		Iterator<Student> it = hs.iterator();
		
		while(it.hasNext()) {
			Student st = it.next();
			System.out.println("이름: " + st.getName());
			System.out.println("연락처: " + st.getTel());
			System.out.println("주소: " + st.getAddress());
		}
	}
}
