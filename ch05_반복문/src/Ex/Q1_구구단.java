package Ex;

import java.util.Scanner;

public class Q1_구구단 {

	public static void main(String[] args) {
		
		// for활용 / while문으로도 구현
		// 몇 단 몇 수를 출력할까요?
		// 1단, 1수부터 입력받은데까지 구구단을 출력한다.
		
		
		Scanner sc = new Scanner(System.in);
		
		int dan, su;
		
		System.out.print("단, 수 입력 >> ");
		dan = sc.nextInt();
		su = sc.nextInt();
		
		// for
		for(int i = 1; i <= dan; i++) {
			for(int j = 1; j <= su; j++) {
				System.out.println(i + " * " + j + " = " + (i * j) + " ");
				
			}
			System.out.println();
		}


		// while
		int i = 1, j = 1;
		
		while(i <= dan) {
			while(j <= su) {
				System.out.println(i + " * " + j + " = " + (i * j) + " ");
				j++;
			}
			i++;
			j = 1;
			System.out.println();
		}
		
		
		
		// 해설
		System.out.print("단, 수 입력 >> ");
		
		dan = sc.nextInt();
		su = sc.nextInt();
		
		for(int k = 1; k <= dan; k++) {
			for(int m = 1; m <= su; m++) {
				System.out.print(k + " * " + m + " = " + (k * m) + " ");
			}
			System.out.println();
		}
		
		sc.close();
		
		
		

	}

}
