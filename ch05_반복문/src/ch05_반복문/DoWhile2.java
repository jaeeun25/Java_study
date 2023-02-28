package ch05_반복문;

public class DoWhile2 {

	public static void main(String[] args) {
		// 9단까지 구구단을 do while문만 사용해서 구현하시오.
		// 짝수 단만 출력하시오.
		
		int i = 1;
		int j;
		do {
			if(i % 2 == 0) {
				j = 1;
				do {
					System.out.println(i + " * " + j + " = " + i * j);
					j++;
				}while(j <= 9);
			}
			i++;
			System.out.println();
		}while(i <= 9);

	}

}
