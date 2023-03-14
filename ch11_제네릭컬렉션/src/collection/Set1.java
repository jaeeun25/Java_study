package collection;

import java.util.HashSet;

/*
 	List를 구현한 ArrayList/Vector 클래스
 		. 순서가 있고 중복을 허용한다.
	Set을 구현한 HashSet 인터페이스
		. 순서에 상관없이 중복을 허용하지 않는다.
*/

public class Set1 {
	public static void main(String[] args) {
		
		HashSet<String> h = new HashSet<String>();
		
		h.add(new String("김주호"));
		h.add("박현정");
		h.add("홍연의");
		h.add("김을동");
		h.add("박현정");
		h.add("박현정");
		h.add("박현정");
		h.add("박현정");
		h.add("박현정");
		h.add("박현정");

		for(String s : h) {
			System.out.println(s);
		}
	}
}
