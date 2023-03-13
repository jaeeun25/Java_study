package uselibrary;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

interface DateString{
	void set(String date, Calendar end);
}

class DateSet implements DateString{

	@Override
	public void set(String date, Calendar calendar) {
		StringTokenizer st = new StringTokenizer(date, ".");
		
		//calendar = Calendar.getInstance();
		calendar.set(Integer.parseInt(st.nextToken()),
					Integer.parseInt(st.nextToken())-1,
					Integer.parseInt(st.nextToken()));
	}
}

class EndCalculator{
	void cal(Date n,Date e) {
		long gap = e.getTime()- n.getTime();
		long day = gap/(24*60*60*1000);
		long week = gap/(24*60*60*1000*7);
		System.out.println("과정 종료 잔여 일수: " + ((day)-(day/7*2)) + "일");		// 주말을 빼주는게 이상하다.
	}
}

public class 과정종료잔여일수산출 {
	
	static DateSet ds = new DateSet();	
	static EndCalculator ec = new EndCalculator();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("현재날짜(yyyy.mm.dd) >> ");
		String nowString = sc.nextLine();
		
		System.out.println("종료날짜(yyyy.mm.dd) >> ");
		String endString = sc.nextLine();
		
		Calendar now = Calendar.getInstance();
		ds.set(nowString, now);
		//now.set(2023, 2, 13);
		
		Calendar end = Calendar.getInstance();
		ds.set(endString, end);
		//end.set(2023, 7, 29);						// set에서 설정하지 않는 것은 값에 변화가 있음

		ec.cal(now.getTime(), end.getTime());
		
	}
}
