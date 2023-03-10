package math;

import java.util.Scanner;

// 컴퓨터와 가위바위보 게임
public class EX5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int computer = 0, player = 0;
		
		System.out.println("가위바위보 게임을 시작합니다.");		
		
		while(true) {
			System.out.println("가위:1, 바위:2, 보:3 (4:종료)> ");
			player = sc.nextInt();
			
			if(player == 4) break;
			
			computer = (int) ((Math.random() * 3) + 1);
			/*
			1 -> 2이김 3짐
			2 -> 3이김 1짐
			3 -> 1이김 2짐
			*/
			
			if(computer != 3) {
				if(computer+1 == player) System.out.println("player 승리");
				else if(computer == player) System.out.println("비김");
				else System.out.println("computer 승리");
			}
			else {
				if(computer-2 == player) System.out.println("player 승리");
				else if(computer == player) System.out.println("비김");
				else System.out.println("computer 승리");
			}
			
			System.out.println("computer: " + computer + " / player: " + player);
			System.out.println();
		}
		
	}
}
