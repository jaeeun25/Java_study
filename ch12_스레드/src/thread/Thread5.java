package thread;

import java.util.Calendar;

// 현재시간을 년월일 시분초로 1초 단위로 출력하시오

/* 1번문제 푼 것
class Time extends Thread{
	@Override
	public void run() {
		while(true) {
			try {
				Calendar c = Calendar.getInstance();		// 객체 생성 당시의 시간을 가져옴(실시간으로 가져오려면 계속 객체를 가져와야함)
				System.out.println(c.get(Calendar.YEAR) + "." + c.get(Calendar.MONTH)+1 + "." + c.get(Calendar.DAY_OF_MONTH) + " " +
									c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
				sleep(1000);
			} catch(InterruptedException e) {}
		}
	}
}
*/

public class Thread5 {
	
	public static void main(String[] args) {
	
		/*
		// 1번문제 푼 것
		Time t = new Time();
		t.start();
		*/
		
		// 1번 실습 
		new Thread5();
	}
	
	// 생성자
	public Thread5() {
		MyTimer mt = new MyTimer();
		mt.start();
	}
	
	// 1번문제 실습(inner 클래스로 잡음)
	class MyTimer extends Thread{
		public void run() {
			while(true) {
				String time = getTime();
				System.out.println(time);
				try {
					sleep(1000);
				}catch(InterruptedException e) {}
			}
		}
	}
	String getTime() {
		Calendar now = Calendar.getInstance();
		int yy = now.get(Calendar.YEAR);
		int mm = now.get(Calendar.MONTH)+1;
		int dd = now.get(Calendar.DAY_OF_MONTH);
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		String nowTime = yy + "년" + mm + "월" + dd + "일 " + hour + "시" + minute + "분" + second + "초";
		return nowTime;
	}
		
}
