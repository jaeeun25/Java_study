package 강제종료;

import javax.swing.JOptionPane;

class Counter extends Thread{
	int num = 1;
	boolean flag = false;
	
	// 메소드
	public void finish() {
		flag = true;
	}
	
	// 스레드
	public void run() {
		String str = JOptionPane.showInputDialog("몇초에서 멈출까요?");
		int i = Integer.parseInt(str);
		
		while(true) {
			System.out.print(num + " ");
			if(num % 10 == 0) {
				System.out.println();
			}
			num++;
			if(num == i) {
				finish();		// true로 변경
			}
			
			try {
				sleep(500);
				if(flag == true) {
					return;		// 강제종료처리
				}
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}

public class ThreadStop2 {
	
	public static void main(String[] args) {
		 Counter c = new Counter();
		 c.start();
	}
}
