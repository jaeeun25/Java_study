package 스레드제어;

class SumTh extends Thread {
	
	long sum;
	
	public long getSum() {
		return sum;
	}
	public void setSum(long sum) {
		this.sum = sum;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=100; i++) {
			sum += i;
			try {
				sleep(50);
			} catch (InterruptedException e) {}
			System.out.println(sum);
		}
	}
}

public class Thread2 {
	public static void main(String[] args) {
		SumTh st = new SumTh();
		st.start();
		
		try {
			st.join();	// st가 실행 될 때 다른 스레드는 정지(그러므로 main도 잠시 대기) -> 때문에 하단의 출력문 맨 마지막에 출력
		} catch (InterruptedException e) {}
		
		System.out.println("1~100까지 합: " + st.getSum());
	}
}
