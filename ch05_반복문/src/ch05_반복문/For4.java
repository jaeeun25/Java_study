package ch05_반복문;

public class For4 {
	public static void main(String[] args) {
		
		System.out.println("구구단을 출력합니다.");
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(i + "단 들어갑니다.");
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
				
			}
			System.out.println();
		}
	}
}
