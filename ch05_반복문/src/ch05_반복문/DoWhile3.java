package ch05_반복문;

import java.util.Scanner;

// 숫자 맞추기 게임

public class DoWhile3 {

	public static void main(String[] args) {
		System.out.println("1~100 중 어떤 숫자일까요? ");
		Scanner sc = new Scanner(System.in);
		
		int answer = (int)((Math.random() * 100) + 1);
		int cnt = 0;
		int num;
		
		// 10번이 넘어서면 넘었다고 출력해준다.
		// 게임을 다시 랜덤 생성해서 새롭게 할 수 있다. >> 계속하시겠습니까? y
		
		do {
			cnt++;
			
			num = sc.nextInt();
			if(answer == num) {
				System.out.println("축하합니다. " + cnt + "번에 맞췄습니다.");
				break;
			}
			else if(answer > num){
				System.out.println("더 큰 수를 입력하세요.");
			}
			else {
				System.out.println("더 작은 수를 입력하세요.");
			}
			
			if(cnt == 10) {
				System.out.println("입력 횟수를 초과하였습니다. 정답은 " + answer);
				System.out.println("계속하시겠습니까? ");
				
				String reset = "";
				reset = sc.next();
				
				if(reset.equals("y")) {
					cnt = 0;
					answer = (int)((Math.random() * 100) + 1);
				}			
				
			}
			
		}while(cnt < 10);
		
		sc.close();
		
	}

}
