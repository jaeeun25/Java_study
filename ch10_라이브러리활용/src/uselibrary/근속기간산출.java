package uselibrary;

import java.util.Scanner;
import mylib.ConvertDate;
import mylib.ConvertDateArr;
import mylib.DayOfCalculator;

public class 근속기간산출 {
	
	static int[] setJoinDate(String join) {
		ConvertDate joinDate = new ConvertDateArr();
		return joinDate.setDate(join);
	}
	
	static int[] setResignDate(String resign) {
		ConvertDate resignDate = new ConvertDateArr();
		return resignDate.setDate(resign);
	}
	
	static String getDaysOfCalculated(int[] join, int[] resign) {
		DayOfCalculator gct = new DayOfCalculator();
		return gct.getResult(join, resign);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("입사일(yyyy.mm.dd): ");
			int[] joinDateArr = setJoinDate(sc.nextLine());
			
			System.out.println("퇴사일(yyyy.mm.dd): ");
			int[] resignDateArr = setResignDate(sc.nextLine());
			
			System.out.println(getDaysOfCalculated(joinDateArr, resignDateArr));
			
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
