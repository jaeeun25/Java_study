package collection;

import java.util.Vector;

public class Vector1 {
	public static void main(String[] args) {
		
		//1. 생성
		Vector<Integer> v1 = new Vector<Integer>();
		
		//2. 객체 입력
		Integer a = new Integer(0);
		v1.add(a);
		
		v1.add(new Integer(10));
		v1.addElement(2);
		
		v1.add(3);
		v1.add(4);
		v1.add(5);
		v1.add(6);
		v1.add(7);
		v1.add(8);
		v1.add(9);
		v1.add(10);
		
		//3. 중간에 입력
		v1.add(5, 15);
		System.out.println(v1.get(5));
		
		//4. 출력
		System.out.println(v1.get(1));
		System.out.println(v1.elementAt(1));
		System.out.println("****전체출력****");
		for(int i=0; i<v1.size(); i++) {
			System.out.print(v1.get(i) + " ");
		}
		System.out.println();
		
		// 5. 모든값 더하기
		int sum = 0;
		for(int i=0; i<v1.size(); i++) {
			sum +=v1.get(i);
		}
		System.out.println(sum);
	}
}
