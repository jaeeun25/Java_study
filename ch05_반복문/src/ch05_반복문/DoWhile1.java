package ch05_반복문;

public class DoWhile1 {

	public static void main(String[] args) {

		int sum = 0;
		int i = 1;
		
		do {
			sum += i;
			System.out.println("지금까지는 " + sum);
			i++;
		}while(i <= 10);
		
		System.out.println("최종합계: " + sum);

	}

}
