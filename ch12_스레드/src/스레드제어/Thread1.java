package 스레드제어;

class TargetThread extends Thread{
	
	public void run() {
		for(long i=0; i<1000000000; i++) {
			// 내용 없음
		}
		
		try {
			sleep(1500);		// 일시정지(대기) - 1.5초 (즉 대기 중에 아래 스레드는 sleep(500)으로 3번 돈다. 그래서 timed_waiting 상태가 3번 나옴)
			
		} catch (InterruptedException e) {}
		for(long i=0; i<1000000000; i++) {
			// 내용 없음
		}
	}	
}

class StatePrintThread extends Thread{
	Thread targetThread;	// tagget의 스레드 상태를 조회하려함
	
	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}
	
	public void run() {
		while(true) {
			Thread.State state = targetThread.getState();
			System.out.println("타깃스레드상태: "+ state);
			
			if(state == Thread.State.NEW) {		// 스레드 객체 생성 상태라면
				targetThread.start();
			}
			if(state == Thread.State.TERMINATED) {	// 스레드 종료 상태라면
				break;
			}
			
			try {
				sleep(500);			// 0.5초
				
			} catch (InterruptedException e) {}
		}
	}
}

public class Thread1 {
	public static void main(String[] args) {
		
		StatePrintThread st = new StatePrintThread(new TargetThread());
		st.start();
	}
}
