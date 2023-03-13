package Calendar;

import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

// 년월일 문자열을 정수배열로 반환
interface ConvertDate{
	int[] setDate(String date);
}

class ConvertDateArr implements ConvertDate{

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
class GetDaysOfCalculated{
	public String getResult(int[] join, int[] resign) {
		int yy = resign[0] - join[0];
		int mm = resign[1] - join[1];
		int dd = resign[2] - join[2];
		
		return (Integer.toString(yy) + "년" +
				Integer.toString(mm) + "월" + 
				Integer.toString(dd) + "일");
	}
}

public class EX4_2 {
	// 근속년수 구하기
	
	// 문자열로 받은 입사년원일을 문자배열에 년월일로 저장해서 리턴해주는 메소드
	static int[] setJoinDate(String join) {
		ConvertDate joinDate = new ConvertDateArr();
		return joinDate.setDate(join);
	}
	
	// 문자열로 받은 퇴사년월일을 문자열 배열에 년월일로 저장해서 리턴해주는 메소드
	static int[] setResignDate(String resign) {
		ConvertDate joinDate = new ConvertDateArr();
		return joinDate.setDate(resign);
	}
	
	// 근속년수 계산해주는 메소드
	static String GetDaysOfCalculated(int[] join, int[] resign){
		GetDaysOfCalculated gct = new GetDaysOfCalculated();
		return gct.getResult(join, resign);
	}
	
	public static void main(String[] args) {
		// 실습2
		Scanner sc = new Scanner(System.in);

		while(true) {
			// 입사일 받기
			System.out.println("입사년월일을 입력하시오(2000.3.1)>> ");
			String joining = sc.nextLine();
			int[] joinArr = setJoinDate(joining);
			System.out.println("입사일: " + joinArr[0] + "년" + joinArr[1] + "월" + joinArr[2] + "일");
			
			// 퇴사일 받기
			System.out.println("퇴사년월일을 입력하시오(2000.3.1)>> ");
			String resign = sc.nextLine();
			int[] resignArr = setJoinDate(resign);
			System.out.println("퇴사일: " + resignArr[0] + "년" + resignArr[1] + "월" + resignArr[2] + "일");
			
			// 근속년수 계산하기
			GetDaysOfCalculated calculator = new GetDaysOfCalculated();
			String result = calculator.getResult(joinArr, resignArr);
			
			System.out.println("근속기간: " + result);
			
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
