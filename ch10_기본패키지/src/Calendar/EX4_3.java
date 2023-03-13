package Calendar;

import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

// 년월일 문자열을 정수배열로 반환
interface ConvertDate2{
	int[] setDate(String date);
}

class ConvertDateArr2 implements ConvertDate2{

	@Override
	public int[] setDate(String date) {
		StringTokenizer st;
		Calendar convertDate1 = Calendar.getInstance();
		
		st = new StringTokenizer(date.trim(), ".");
		String[] strDate = new String[3];
		int[] intDate = new int[3];
		int i = 0;
		while(st.hasMoreTokens()) {
			strDate[i] = st.nextToken().trim();
			intDate[i] = Integer.parseInt(strDate[i]);
			i++;
		}
		convertDate1.set(intDate[0], intDate[1], intDate[2]);
		
		return intDate;
	}	
}

// 계산하기
class GetDaysOfCalculated2{
	public String getResult(int[] join, int[] resign) {
		int yy = resign[0] - join[0];
		int mm = resign[1] - join[1];
		int dd = resign[2] - join[2];
		
		return (Integer.toString(yy) + "년" +
				Integer.toString(mm) + "월" + 
				Integer.toString(dd) + "일");
	}
}

public class EX4_3 {
	
	static ConvertDateArr2 cda = new ConvertDateArr2();
	static GetDaysOfCalculated2 gct = new GetDaysOfCalculated2();
	
	static int[] action(String date) {
		int[] intDateArr = cda.setDate(date);
		System.out.println("입력값: " + intDateArr[0] + "년 " +
										intDateArr[1] + "월" + 
										intDateArr[2] + "일");
		
		return intDateArr;
	}
	
	static String getDaysOfCalculated(int[] join, int[] resign) {
		int yy = resign[0] - join[0];
		int mm = resign[1] - join[1];
		int dd = resign[2] - join[2];
		
		return (Integer.toString(yy) + "년" +
				Integer.toString(mm) + "월" + 
				Integer.toString(dd) + "일");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			// 입사일 받기
			System.out.println("입사년월일을 입력하시오(2000.3.1)>> ");
			String joining = sc.nextLine();
			
			// 퇴사일 받기
			System.out.println("퇴사년월일을 입력하시오(2000.3.1)>> ");
			String resign = sc.nextLine();
			
			// 입력결과
			String result = gct.getResult(action(joining), action(resign));
			System.out.println(result);
			
			// 근속년수 계산
			String numberOfDayService = getDaysOfCalculated(action(joining), action(resign));
			System.out.println(numberOfDayService);
			
			System.out.print("계속하시겠습니까?(y/n)>> ");
			String answer = sc.next();
			
			if(answer.equals("n")) {
				sc.close();
				break;
			}
			System.out.println("******************");
			sc.nextLine();
		}
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
		
	}
}
