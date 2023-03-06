package step6_Static;

import java.util.Scanner;

class Converter{
	private static double rate;
	
	public static double toDollar(double won) {
		return won / rate;			// 원화 -> 달러
	}
	public static double toKRW(double dollar) {
		return dollar * rate;		// 달러 -> 원화
	}
	public static void setRate(double r) {
		rate = r;					// 환율을 설정
	}
}

public class Static2_환율계산기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("환율(1 달러) > ");
		double rate = sc.nextDouble();
		
		Converter.setRate(rate);
		
		System.out.println("백만원은 $" + Converter.toDollar(1000000));
		System.out.println("$100은 " + Converter.toKRW(100) + "원 입니다.");		
		
		sc.close();
	}
}
