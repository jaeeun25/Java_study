package 강제종료;

public class ThreadStop1 extends Thread{
	int num = 0;
	
	public void run() {
		
		while(num < 10) {
			System.out.println(num);
			num++;
			try {
				sleep(1000);
				System.out.println("interrupt로 인해 출력되지 않음");
			}catch (InterruptedException e) {
				System.out.println("interrupt");
				System.out.println(getState());
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		ThreadStop1 th = new ThreadStop1();
		th.start(); 
		th.interrupt();		// 강제종료(sleep, wait 메소드 같은 블로킹 메소드는 인터럽트에 걸리면 즉시 리턴)
	}
}
