package thread;

class NumberThread extends Thread{
	
	int n=0;
	
	@Override
	public void run() {
		while(true) {
			System.out.println(n);
			n++;
			try {
				sleep(2000);		// 2초 대기
			}catch (InterruptedException e) {
				return;
			}
		}
	}
}

public class Thread2 {
	public static void main(String[] args) {
		NumberThread nt = new NumberThread();
		nt.start();
		
		for(int i=0; i<10000; i++) {
			System.out.println("난 메인이야");
		}
	}
}
