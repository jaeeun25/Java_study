package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

// Map - key, value 하나의 쌍으로 저장한다

public class HashMap1 {
	public static void main(String[] args) {
		
		/*
		//1. 생성
		HashMap<String, String> h = new HashMap<String, String>();
		
		
		//2. 요소 추가
		h.put("apple", "사과");
		h.put("lemon", "레몬");
		h.put("love", "사랑");
		
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		
		while(flag) {
		
			System.out.print("찾고싶은 영단어를 입력하세요 >> ");
			String key = sc.next();			// 키로 검색한다.(키는 유일해야한다. -> 중복 불가)
			String value = h.get(key);		// get(key)로 검색
			System.out.println("질문하신 영단어는 \"" + key + "\"는 한글로 " + value + "입니다.");
			
			System.out.print("계속 하시겠습니까? (y/n)");
			String answer = sc.next();
			
			if(answer.equals("n")) {
				flag = false;
				System.out.println("질문이 끝났습니다. 수고하셨습니다.");
			}
		}
		
		//3. 삭제
		int size = h.size();
		
		System.out.println("현재 해시맵의 크기: " + size);
		System.out.println();
		System.out.println();
		
		System.out.print("지우실 단어를 입력해주세요>> ");
		String str = sc.next();
		
		h.remove(str);			// str은 키
		System.out.println();
		System.out.println();
		
		//4. 전체 읽어오기
		Set<String> keys = h.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String k = it.next();
			System.out.println("key: " + k + " / value: " + h.get(k));
		}
		*/
		
		
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> hm = new HashMap<String, String>();
		
		hm.put("apple", "사과");
		hm.put("lemon", "레몬");
		hm.put("melon", "멜론");
		hm.put("orange", "오렌지");
		//hm.put("apple", "사과1");				// 처음에 넣은 값 사과가 사과1로 갱신됨
		
		boolean flag = true;
		
		while(flag) {
			System.out.print("찾고싶은 영단어 입력> ");
			String key = sc.next();
			
			System.out.println("영어: " + key + " / 한글: " + hm.get(key));
			
			System.out.print("계속 하시겠습니까?(y/n) ");
			String answer = sc.next();
			
			if(answer.equals("n")) {
				flag = false;
				System.out.println("질문을 종료합니다.");
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println("현재 해시맵 크기: " + hm.size());
		
		System.out.print("지울 영단어 입력> ");
		String k = sc.next();
		
		hm.remove(k);
		
		System.out.println();
		System.out.println();
		System.out.println("현재 해시맵 크기: " + hm.size());
		
		Set<String> keys = hm.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println("key: " + s + " / value: " + hm.get(s));		// 넣은대로 순서 유지 x
		}
	}
}
