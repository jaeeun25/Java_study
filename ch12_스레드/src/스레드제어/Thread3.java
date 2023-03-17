package 스레드제어;

// 스레드가 공유하는 클래스
class ShareBoard{
	int sum = 0;
	
	// 공유 영역
	synchronized public void add() {
		int n = sum;
		//Thread.yield();				// syschronized 없을 때 yield 쓰면 양보를 하기때문에 차례대로 값을 올림,
										// 안쓰면 동시에 쓰기 때문에 순차적으로 더해지지않고 다른 스레드가 올린값으로 계산한 결과가 나와 갑자기 값이 뛰는 경우가 보임
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
		try {
			for(int i=0; i<10; i++) {
				// 공유하는 곳을 호출한 곳
				//sleep(500);
				board.add();
			}
		} catch(Exception e) {
			
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
