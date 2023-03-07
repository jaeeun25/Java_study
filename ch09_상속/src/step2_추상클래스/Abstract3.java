package step2_추상클래스;

import java.text.DecimalFormat;
import java.util.Arrays;

abstract class Calculator{
	public abstract int add(int a, int b);
	public abstract int sub(int a, int b);
	public abstract double avg(int[] a);
}

class GoodCal extends Calculator{
	public int add(int a, int b) {
		return a + b;
	}
	public int sub(int a, int b) {
		return a - b;
	}
	public double avg(int[] a) {
		int sum = 0;
		for(int n : a) sum += n;
		
		return sum / (double)a.length;
	}
}

public class Abstract3 {
	public static void main(String[] args) {
		
		double num = 1256.567;
		DecimalFormat df = new DecimalFormat("#,###.#");	// 10진수 숫자 형식화
		String str = df.format(num);
		System.out.println(str);
		
		GoodCal cal = new GoodCal();
		
		System.out.println(cal.add(2, 3));
		System.out.println(cal.sub(2, 3));
		System.out.println(cal.avg(new int[] {2,3,4}));

	}
}