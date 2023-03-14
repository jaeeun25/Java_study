package collection;

import java.util.Scanner;
import java.util.Vector;

public class ArrayList_실습2 {
	public static void main(String[] args) {
		
		// 1. 스캐너로 이름을 받는다
		// 2. ArrayList 또는 Vector에 저장한다.
		// 3. 가장 긴 이름을 찾는다.
		
		Scanner sc = new Scanner(System.in);
		
		Vector<String> v = new Vector<String>();
		String name = "", long_name = "";
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<5; i++) {
			name = sc.next();
			v.add(name);
			/*
			if(max < name.length()) {
				long_name = name;
				max = name.length();
			}
			*/
		}
		
		for(String s : v) {
			if(max < s.length()) {
				long_name = s;
				max = s.length();
			}
		}
		
		System.out.println(long_name);
	}
}
