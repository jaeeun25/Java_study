package ch02_데이터타입과변수;

/*
 	기본 데이터 타입
 		논리타입 : boolean	1바이트	 00000000
 		문자타입 : char		2바이트
 		정수타입 : byte		1바이트	-128 ~ 0 ~ 127
 				short	2바이트
 				int		4바이트
 				long	8바이트
		실수타입 : float	4바이트
				double 	8바이트
		
		참조타입
			: 배열, 클래스, 인터페이스
 	
 */

public class DataType1 {
	public static void main(String[] args) {  //void가 있으면 return이 없음. 서로싫어함.
		byte num1 = -128;
		short num2 = 32767;
		int num3 = 2147483647;
		long num4 = 9223372036854775807L;
		
		int value1 = 10;		// 0000 0000 (10진수)
		int value2 = 0b1010;	// 0b로 시작 (2진수)
		int value3 = 013;		// 0으로 시작  (8진수)
		int value4 = 0x9f; 		// ~9 A B C D E F (16진수)
		
	}

}
