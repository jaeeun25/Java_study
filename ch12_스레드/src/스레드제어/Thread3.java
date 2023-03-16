package 스레드제어;

// 스레드가 공유하는 클래스
class ShareBoard{
	int sum = 0;
	
	// 공유 영역
	synchronized public void add() {
		int n = sum;
		//Thread.yield(); 	// 스레드 실행을 양보 이거 왜 있는건지?(synchronized 없을때의 있고 없고의 차이가..?)
		n += 10;
		sum = n;
		System.out.println(Thread.currentThread().getName() + ":" + sum);	// 현재 실행 중인 스레드 이름 리턴
	}
	public int getSum() {
		return sum;
	}
}

class StudentThread extends Thread {
	ShareBoard board;
	public StudentThread(String name, ShareBoard board) {
		super(name);			// 스레드 이름 넣기
		this.board = board;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			// 공유하는 곳을 호출한 곳
			board.add();
		}
	}
}

public class Thread3 {
	public static void main(String[] args) {
		ShareBoard board = new ShareBoard();
		Thread th1 = new StudentThread("홍길동", board);
		Thread th2 = new StudentThread("김을동", board);
		th1.start();
		th2.start();
		
	}
}
