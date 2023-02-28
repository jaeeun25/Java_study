package ex;

import java.util.Scanner;

// 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 값을 배열에 저장하고
// 1) 메뉴 1번을 선택하면.. 2의 배수의 합을 구하고
// 2) 메뉴 2번을 선택하면.. 3의 배수의 합을 구하고
// 3) 메뉴 3번을 선택하면..전체 합을 구하고
// 4) 메뉴 4번을 선택하면.. 평균을 구하는 프로그램을 작성하시오.
// 5) 메뉴 5번.. 종료

public class Ex3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.println("--------------------------------------------");
		System.out.println("|1)2의배수합 |2)3의 배수합 |3)전체합 |4)평균 |5)종료");
		System.out.println("--------------------------------------------");
		
		stop:while(true) {
			float result = 0;
			String str = "";
			System.out.print("메뉴 선택 >> ");
			int menu = sc.nextInt();
			switch(menu) {
				case 1:
					for(int i=0; i<number.length; i++) {
						if(number[i] % 2 == 0) {
							result += number[i];
							str += number[i];
							//if(number[i] == (number.length / 2) * 2) str += " = ";
							if((i+2) > number.length) str += " = ";
							else str += " + ";
							
						}
					}
					System.out.println(str + result);
					/* 인덱스가 1부터 시작한다고 생각했을 때 인덱스가 2의 배수인 숫자들 뽑아내는 식
					for(int i=0; i<number.length/2; i++)
						result += number[i*2+1];
					*/
					break;
				case 2:
					for(int i=0; i<number.length; i++) {
						if(number[i] % 3 == 0) {
							result += number[i];
							str += number[i];
							//if(number[i] == (number.length / 3) * 3) str += " = ";
							if((i+3) > number.length) str += " = ";
							else str += " + ";
							
						}
					}
					System.out.println(str + result);
					break;
				case 3:
					for(int i=0; i<number.length; i++) {
						result += number[i];
						str += number[i];
						if(number[i] == number.length) str += " = ";
						else str += " + ";
					}
					System.out.println(str + result);
					break;
				case 4:
					for(int i=0; i<number.length; i++)
						result += number[i];
					result /= number.length;
					
					/* 해설 - 3번 실행 후 4번하도록 안내, result while 안에서 초기화되는 코드없음
					 float avg = result / (float)number.length;
					 */
					System.out.println(result);
					break;
				case 5:
					System.out.println("프로그램을 종료합니다.");
					break stop;		// target으로 while문 바로 나감
				
				default:
					System.out.println("메뉴를 재선택해주세요.");
						
			}
			System.out.println();
			System.out.println("계속 하시겠습니까?(y/n)");
			String answer = sc.next();
			if(answer.equals("n")) {
				sc.close();
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
		}		
	}
}
