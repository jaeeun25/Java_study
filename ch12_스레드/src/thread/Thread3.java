package thread;

class Th1 extends Thread{
	// 스레드1
	
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("Th1");
			try {
				sleep(1000);
			}catch (InterruptedException e) {
				System.out.println("Th1 중단합니다.");
			}
		}
	}
	
}
class Th2 extends Thread{
	// 스레드2
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("Th2");
			try {
				sleep(500);
			}catch (InterruptedException e) {
				System.out.println("Th2 중단합니다.");
			}
		}
	}
}

public class Thread3 {
	public static void main(String[] args) {
		
		// 2개 스레드를 생성해서 실행
		Th1 th1 = new Th1();
		th1.start();
		
		Th2 th2 = new Th2();
		th2.start();
		
		for(int i=0; i<10; i++) {
			System.out.println("Main");
		}
	}
}
