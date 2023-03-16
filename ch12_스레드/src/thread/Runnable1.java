package thread;

class CountRunnable implements Runnable{
	
	int num = 0;
	
	@Override
	public void run() {
		while(true) {
			System.out.println(num + " ");
			num++;
			
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				return;
			}
		}
	}
}

public class Runnable1 {
	public static void main(String[] args) {
		
		CountRunnable cr = new CountRunnable();
		//cr.start();					// 스레드 클래스 상속받는 경우 start()로 바로 시작할 수 있음
		
		Thread th = new Thread(cr);		// 그러나 Runnable 인터페이스 이용하는 경우 스레드 객체 생성 후 매개변수로 Runnable을 implements한 클래스 객체 넣음
		th.start();						// 매개변수 받은 스레드 객체를 start()해 시작
	}
}
