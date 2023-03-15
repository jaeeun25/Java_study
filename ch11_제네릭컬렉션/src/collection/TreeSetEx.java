package collection;

import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		
		// 순서 없고, 중복 안되고, 정렬해서 출력해준다.
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("홍길동");
		ts.add("강감찬");
		ts.add("이순신");
		ts.add("이순신");		// 중복 x
		ts.add("이순신");
		ts.add("이순신");
		ts.add("이순신");
		
		for(String s : ts) {
			System.out.println(s);
		}
	}
}
