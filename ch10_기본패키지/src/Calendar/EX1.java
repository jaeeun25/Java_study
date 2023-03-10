package Calendar;

import java.util.Calendar;

// 시간대 별로 인사 다르게 출력
public class EX1 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		
		if(hour >= 6 && hour < 12) System.out.println("Good Morning");
		else if(hour >= 12 && hour < 18 ) System.out.println("Good Afernoon");
		else if(hour >= 18 && hour < 24 ) System.out.println("Good Evening");
		else System.out.println("Good Night");
	}
}
