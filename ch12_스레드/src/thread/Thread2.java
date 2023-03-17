package thread;

class NumberThread extends Thread{
	
	int n=0;
	
	@Override
	public void run() {
		while(n<11) {
			System.out.println(n);
			n++;
			try {
				sleep(500);		// 2초 대기
			}catch (InterruptedException e) {
				return;
			}
		}
	}
}

public class Thread2 {
	public static void main(String[] args) {
		NumberThread nt = new NumberThread();
		nt.start();		//-> 멀티스레드 환경을 생성한뒤 run()메소드 호출(멀티 스레드, 새로운 스레드 생성 후 stack 영역 차지해 독릭적으로 동작이 가능)
		//nt.run();       //-> 단순히 메소드를 실행하고 끝(싱글 스레드, 메인 스레드 stack 영역 차지하기 때문에 끝나기 전까지 다른 메서드 호출 불가)
		
		for(int i=0; i<10; i++) {
			System.out.println("난 메인이야");
		}
	}
}
