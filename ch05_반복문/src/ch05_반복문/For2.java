package ch05_반복문;

public class For2 {
	public static void main(String[] args) {
		
		int sum = 0;
		int i = 0;				// 아래 for문 초기화식 생략 가능
		
		for(; i <= 10; i++) {
			
			sum += i;
		
		}
		System.out.println("합계: " + sum);
		System.out.println("평균: " + (sum/(float)(i-1)));
	}
}
	
