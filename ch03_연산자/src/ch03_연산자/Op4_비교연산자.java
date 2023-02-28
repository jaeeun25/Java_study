package ch03_연산자;

public class Op4_비교연산자 {
	
	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 5;
		boolean result = true;
		
		result = n1 > n2;
		System.out.printf("%d > %d = %b\n", n1, n2, result);
		
		result = n1 < n2;
		System.out.printf("%d < %d = %b\n", n1, n2, result);
		
		result = n1 <= n2;
		System.out.printf("%d <= %d = %b\n", n1, n2, result);
		
		result = n1 >= n2;
		System.out.printf("%d >= %d = %b\n", n1, n2, result);
		
		result = n1 == n2;
		System.out.printf("%d == %d = %b\n", n1, n2, result);
		
		result = n1 != n2;
		System.out.printf("%d != %d = %b\n", n1, n2, result);
		
		if(n1 > 10) {
			System.out.println("크다");
		}
		
	}
	
}
