package math;

import java.util.Random;

public class Random1 {
	public static void main(String[] args) {
		
		Random r = new Random();
		int n = r.nextInt();	// 정수난수를 발생(음수,0,양수 포함) -2의 31승 ~ +2의 31승-1
		int m = r.nextInt(100);	// 0~99 사이
	}
}
