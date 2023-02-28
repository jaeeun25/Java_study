package ch05_반복문;

public class For7 {
	public static void main(String[] args) {
		
		int sum = 0, totalsum = 0;
		
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= i; j++){
				System.out.print(j + " ");
			}
			sum += i;
			totalsum += sum;
			System.out.println("합계: " + sum);
		}
		System.out.println("누적 합계: " + totalsum);
		
	}
}
