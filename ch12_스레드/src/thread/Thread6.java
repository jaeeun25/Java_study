package thread;

import java.util.Scanner;

// 카운트 해야할 숫자를 입력받아서 1초씩 카운트 출력하시오. -> 카운트다운으로 함

/* 2번문제 푼 것
class Count extends Thread{
	
	int cnt = 0;
	
	public Count(int cnt) {
		this.cnt = cnt;
	}
	
	@Override
	public void run() {
		while(cnt > 0) {
			try {
				System.out.println(cnt--);
				sleep(1000);
			} catch(InterruptedException e) {}
		}	
		System.out.println("카운트다운을 종료합니다!");
	}
}
*/

public class Thread6 {
	int num;
	
	public Thread6(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("디스카운트할 숫자를 입력해주세요> ");
		num = sc.nextInt();
		
		CountThread ct = new CountThread();
		ct.start();
	}
	
	class CountThread extends Thread{
		
		@Override
		public void run() {
			for(int i=0; i<=num; i++) {
				int num = count(i);
				System.out.println(num + " ");
				try {
					sleep(1000);
				} catch(InterruptedException e) {}
			}	
		}
	}
	
	int count(int n) {
		return num - n;
	}
	
	public static void main(String[] args) {
		/*
		// 2번문제 푼것
		Scanner sc = new Scanner(System.in);
		
		System.out.print("카운트할 숫자를 입력해주세요> ");
		
		Count c = new Count(sc.nextInt());
		c.start();
		*/
		
		new Thread6();
		
	}
}
