package ch06_배열;

public class Array2 {
	public static void main(String[] args) {
		
		// 1. 배열 생성+초기화
		int[] num = new int[] {1, 2, 3, 4, 5};
		System.out.println(num[0]);
		
		for(int i : num) {
			System.out.println("num[] = " + i);
		}
		
		// 2. 배열 생성 및 초기화
		String[] name = {"홍길동", "이순신", "강감찬", "세종대왕"};
		
		for(String s : name) {
			System.out.println("name[] = " + s);
		}
		
	}

}
