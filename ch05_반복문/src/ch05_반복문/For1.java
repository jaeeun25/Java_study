package ch05_반복문;

import java.util.Scanner;

public class For1 {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("숫자를 입력해 주세요 >>");
			
			int num = sc.nextInt();
			
			for(int i = 1; i < num; i++) {		// 1			2
				for(int j = 1; j < 10; j++) {	// 1 2 3 4 ~ 9	1 2 3 4 ~
					
					//System.out.println(i + " * " + j + " = " + (i * j));
					
					// 1) 짝수 단만 출력하세요
					//if(i % 2 == 0) System.out.println(i + " * " + j + " = " + (i * j));
					
					// 2) 홀수 단만 출력하세요
					//if(i % 2 == 1) System.out.println(i + " * " + j + " = " + (i * j));
					
					// 3) 3의 배수 단만 출력하세요
					//if(i % 3 == 0) System.out.println(i + " * " + j + " = " + (i * j));
					
					// 4) 수는 6이하만 출력하세요
					//if(j < 7) System.out.println(i + " * " + j + " = " + (i * j));
					
				/*
				   // i는 홀수, j는 짝수
				 * if(i % 2 == 1 && j % 2 == 0) System.out.println("i: " + i + " j: " + j);
				 */
				}
				
			/*
			  if(i % 2 == 0) { System.out.println(i); }
			  
			  try { Thread.sleep(100); } catch(InterruptedException e) { }
			 */	
			}
			
			System.out.println("끝났습니다.");
			
		}
	
}
