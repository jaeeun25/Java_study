package thread;

class AThread extends Thread{
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("A스레드");
			try {
				sleep(1000);		// 1초 일시정지
			}catch (InterruptedException e) {
				System.out.println("실행 중 방해를 받았습니다.");
			}
		}
	}
}

class BThread extends Thread{
	@Override
	public void run() {
		System.out.println("B스레드");
		try {
			sleep(1000);		// 1초 일시정지
		}catch (InterruptedException e) {
			System.out.println("실행 중 방해를 받았습니다.");
		}
	}
}
public class Thread1 {
	public static void main(String[] args) {
		
		System.out.println("Main스레드");
		System.out.println("Main스레드");
		System.out.println("Main스레드");
		System.out.println("Main스레드");
		System.out.println("Main스레드");
		for(int i=0; i<5; i++) {
			System.out.println("A 실행");
		}
		System.out.println("Main스레드");
		System.out.println("Main스레드");
		System.out.println("Main스레드");
		System.out.println("Main스레드");
		for(int i=0; i<5; i++) {
			System.out.println("B 실행");
		}
		System.out.println("**************");
		
		System.out.println("Main스레드");
		System.out.println("Main스레드");
		System.out.println("Main스레드");
		System.out.println("Main스레드");
		System.out.println("Main스레드");
		
		AThread at = new AThread();
		at.start();
		
		System.out.println("Main스레드");
		System.out.println("Main스레드");
		System.out.println("Main스레드");
		System.out.println("Main스레드");
		System.out.println("Main스레드");
		
		for(int i=0; i<5; i++) {
			System.out.println("B 실행");
		}
		
		BThread bt = new BThread();
		bt.start();
		
		System.out.println("Main스레드");
		System.out.println("Main스레드");
		System.out.println("Main스레드");
		System.out.println("Main스레드");
		System.out.println("Main스레드");
	}
}
