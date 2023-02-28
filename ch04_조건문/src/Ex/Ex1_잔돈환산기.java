package Ex;

import java.util.Scanner;

public class Ex1_잔돈환산기 {

	public static void main(String[] args) {
		
		final int M_50000 = 50000;
		final int M_10000 = 10000;
		final int M_5000 = 5000;
		final int M_1000 = 1000;
		final int M_500 = 500;
		final int M_100 = 100;
		final int M_10 = 10;
		final int M_1 = 1;
		
		// MONEY = 2000;	// 상수는 중간에 변경 불가
		
		// 돈을 입력받아서.. 환산해준다.
		// 예) 356,789  -->  5만원권 7장, 천원 6장, 백원 7개 ..
		
		// 입력값 나눠서 --> 몫, 나머지
		// 5만원 > 1만원 > 5천원 > 1천원 ...
		
		System.out.print("소지한 금액 >> ");
		Scanner sc = new Scanner(System.in);
		
		int money = sc.nextInt();
		String str = "";			// 초기화
		
		int cnt = money / M_50000;		// str 사용으로 cnt 재활용 가능
		money %= M_50000;
		str += "5만원: " + cnt + "장\n";
		
		cnt = money / M_10000;
		money %= M_10000;
		str += "1만원: " + cnt + "장\n";
		
		cnt = money / M_5000;
		money %= M_5000;
		str += "5천원: " + cnt + "장\n";

		cnt = money / M_1000;
		money %= M_1000;
		str += "1천원: " + cnt + "장\n";

		cnt = money / M_500;
		money %= M_500;
		str += "500원: " + cnt + "개\n";
		
		cnt = money / M_100;
		money %= M_100;
		str += "100원: " + cnt + "개\n";

		cnt = money / M_10;
		money %= M_10;
		str += "10원: " + cnt + "개\n";
		
		cnt = money / M_1;
		money %= M_1;
		str += "1원: " + cnt + "개";
		
		System.out.println(str);
		
		/*
		System.out.println("5만원: " + m_50000 + "\n" +
							"1만원: " + m_10000 + "\n" + 
							"5천원: " + m_5000 + "\n" +
							"1천원: " + m_1000 + "\n" +
							"500원: " + m_500 + "\n" + 
							"100원: " + m_100 + "\n" +
							"10원: " + m_10 + "\n" + 
							"1원: " + m_1);
		*/
		
		sc.close();				
		
	}

}
