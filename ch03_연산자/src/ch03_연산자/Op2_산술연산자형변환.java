package ch03_연산자;

/*
	명시적(강제) 형 변환과 연산
		. 큰 것을 작은 것에 넣을 때 발생
		. 명시적으로 해주어야 한다.
			- 작은 것 변수  = (작은 것) 값;
	
	연산자와 함께 사용 시
	
*/

public class Op2_산술연산자형변환 {
	
	public static void main(String[] args) {
		
		// 정수
		byte a = 10;
		short b = 20;
		int c = 30;
		int d = 40;
		long e = 50;
		
		//		  byte * short
		int result = a * b;		// result가 short인 경우 오류
		
		int result2 = b + c;
		int result3 = c + d;
		long result4 = d + e;	//	result4가 int인 경우 오류 
		
		// 실수
		float f = 10.1f;
		float g = 20.2f;
		double h = 3000.0;
		
		float result5 = f + g;
		double result6 = g + h;		// result6이 float인 경우 오류	
	}

}
