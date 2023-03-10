package Calendar;

import java.util.Calendar;

public class Calendar2 {
	public static void printCalendar(String msg, Calendar cal) {
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;			// 월은 0부터 시작이므로 출력시 +1(0이면 1월, 1이면 2월..)
		int day = cal.get(Calendar.DAY_OF_MONTH);		// 월 단위
		int week = cal.get(Calendar.DAY_OF_WEEK);		// 일주일 단위(일요일(1)부터 ~ 토요일(7)까지 )
		int hour = cal.get(Calendar.HOUR);
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
		int ampm = cal.get(Calendar.AM_PM);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int millisecond = cal.get(Calendar.MILLISECOND);
		
		System.out.print(msg + year + "/" + month + "/" + day + "/");
		
		switch(week) {
			case Calendar.SUNDAY:	System.out.print("일요일 "); break;
			case Calendar.MONDAY:	System.out.print("월요일 "); break;
			case Calendar.TUESDAY:	System.out.print("화요일"); break;
			case Calendar.WEDNESDAY:System.out.print("수요일 "); break;
			case Calendar.THURSDAY:	System.out.print("목요일 "); break;
			case Calendar.FRIDAY:	System.out.print("금요일 "); break;
			case Calendar.SATURDAY:	System.out.print("토요일 "); break;
		}
		
		System.out.print(hourOfDay + "시 ");
		if(ampm == Calendar.AM) System.out.print("오전 ");
		else System.out.print("오후 ");
		
		System.out.println(hour + "시 " + minute + "분 " + second + "초 " + millisecond + "밀리초입니다.");
		
	}
	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		//now.set(2023, 1, 10);
		
		printCalendar("지금시각..", now);
		now.clear();
		printCalendar("여기는 몇시?", now);
		
		
		Calendar fs = Calendar.getInstance();
		fs.set(2023, 3, 30);
		printCalendar("데이트시간: ", fs);
		
	}
}
