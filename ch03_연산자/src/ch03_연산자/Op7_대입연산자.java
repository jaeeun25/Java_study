package ch03_연산자;

/*
	대입 연산자
		오른쪽 = 왼쪽
		
		+=, -=, /=, *=, %= ...
		
		A = A + 1 --> A++, A += 1
					  	   A += 3
*/

public class Op7_대입연산자 {
	
	public static void main(String[] args) {
	
		int num1 = 0;
		num1 = num1 + 10;
		
		System.out.println("num1 = " + num1);
		
		num1 += 10;
		System.out.println("num1 = " + num1);
		
		num1 -= 3;
		System.out.println("num1 = " + num1);
		
		// 나머지도 해보세용~
		
		num1 *= 10;
		System.out.println("num1 = " + num1);
		
		num1 /= 10;
		System.out.println("num1 = " + num1);
		
		num1 %= 5;
		System.out.println("num1 = " + num1);
		
	}
	
}
