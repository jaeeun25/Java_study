package Calendar;

import java.util.Calendar;

public class Calendar1 {
	public static void main(String[] args) {
		
		//Calendar now = new Calendar();		// 오류
		Calendar now = Calendar.getInstance();	// getInstance()로 생성-> 싱글톤으로 구성되어 있음을 알 수 있음
		
		int yy = now.get(Calendar.YEAR);
		int mm = now.get(Calendar.MONTH)+1;		// 0부터 시작
		int dd = now.get(Calendar.DATE);
		
		int ampm = now.get(Calendar.AM_PM);					// 반환값 0, 1
		int hour = now.get(Calendar.HOUR);
		int hourofday = now.get(Calendar.HOUR_OF_DAY);		// HOUR_OF_DAY: 24시간 / HOUR: 12시간
		int min = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.print(yy + "년 " + mm + "월 " + dd + "일 ");
		
		int week = now.get(Calendar.DAY_OF_WEEK);	// 일요일: 1, 월요일: 2 ~
		
		switch(week) {
		case 1:								// case Calendar.SUNDAY:과 동일
			System.out.print("일요일 "); break;
		case 2:
			System.out.print("월요일 "); break;
		case 3:
			System.out.print("화요일 "); break;
		case 4:
			System.out.print("수요일 "); break;
		case 5:
			System.out.print("목요일 "); break;
		case 6:
			System.out.print("금요일 "); break;
		case 7:
			System.out.print("토요일 "); break;			
		}

		String ampmStr = ampm > 0 ? "PM" : "AM";
		System.out.println(ampmStr + " " + hour + "시 " + min + "분 " + second);
		
	}	
}
