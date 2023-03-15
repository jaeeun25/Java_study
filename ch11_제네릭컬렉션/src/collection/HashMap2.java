package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class Person {
	private int id; // id
	private String name, tel; // 이름, 전화번호

	public Person(int id, String name, String tel) {
		this.id = id;
		this.name = name;
		this.tel = tel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
}

// FamilyPerson
class FamilyHashMap {
	// HashMap
	private HashMap<String, Person> hm;

	// 생성자
	public FamilyHashMap() {
		hm = new HashMap<String, Person>(); // 객체 생성시 해시맵 생성되도록
	}

	// 값 추가
	void addFH(String name, Person p) {
		hm.put(name, p);
	}

	// 특정 값 삭제
	boolean removeFH(String name) {
		/* 실습 예시
		Set<String> keys = hm.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String fkey = it.next();
			Person p = hm.get(fkey);

			if (p.getName().equals(name)) {
				hm.remove(fkey);
				System.out.println(fkey + "님이 삭제되었습니다.\n");
				return true;
			}
		}
		System.out.println(name + "가 존재하지 않습니다.\n");
		return false;
		*/
		
		if(hm.remove(name) == null) { 
			System.out.println(name + "님은  목록에 없습니다.\n");
			return false; 
		} 
		System.out.println(name + "님을 삭제했습니다.\n");
		return true;	 
	}

	// 값 조회
	void showFH() {
		// 실습 예시
		Set<String> keys = hm.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String fkey = it.next();
			Person p = hm.get(fkey);

			System.out.println("******************");
			System.out.println("아이디: " + p.getId() + "\n이   름: " + p.getName() + "\n연락처:" + p.getTel());
		}

		/*
		 * Iterator<String> it = hm.keySet().iterator();
		 * 
		 * while(it.hasNext()){ Person p = hm.get(it.next());
		 * System.out.println(p.getId() + ":" + p.getName() + ":" + p.getTel()); }
		 * System.out.println();
		 */
	}
}

public class HashMap2 {
	public static void main(String[] args) {

		FamilyHashMap fh = new FamilyHashMap();

		fh.addFH("홍길동", new Person(1, "홍길동", "010-1111-1111"));
		fh.addFH("이길동", new Person(2, "이길동", "010-2222-2222"));
		fh.addFH("박길동", new Person(3, "박길동", "010-3333-3333"));

		System.out.println("---------삭제 전---------");
		fh.showFH();

		fh.removeFH("홍길동");

		System.out.println("---------삭제 후---------");
		fh.showFH();
	}
}
