package Calendar;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

public class EX4 {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입사일(yyyy-mm-dd)> ");
		StringTokenizer st = new StringTokenizer(sc.nextLine().trim(), "-");		// trim() : 앞뒤 공백 제거
		int year = Integer.parseInt(st.nextToken());
		int month = Integer.parseInt(st.nextToken())-1;		// month는 0부터 1월이므로 Calendar 관련 메소드에 넣을 때 -1값을 해줘야 제대로 값이 들어간다.
		int day = Integer.parseInt(st.nextToken());
		
		Calendar date1 = Calendar.getInstance();
		date1.set(year, month, day);				// 이때 월은 0부터 시작하므로 4이면 5월을 의미한다
		Date d1 = date1.getTime();
		//System.out.println(date1.getTime());
		//System.out.println(d1.getTime());
		
		System.out.print("퇴사일(yyyy-mm-dd)> ");
		st = new StringTokenizer(sc.nextLine().trim(), "-");
		year = Integer.parseInt(st.nextToken());
		month = Integer.parseInt(st.nextToken())-1;
		day = Integer.parseInt(st.nextToken());
		
		System.out.println("***************");
		Calendar date2 = Calendar.getInstance();
		date2.set(year, month, day);		// 이때 월은 4이므로 
		Date d2 = date2.getTime();
		//System.out.println(d2.getTime());
		
		System.out.println("근속기간: " + (d2.getTime() - d1.getTime())/(24*60*60*1000) + "일");		// 24시간 60분 60초 1000밀리초
	}
}
