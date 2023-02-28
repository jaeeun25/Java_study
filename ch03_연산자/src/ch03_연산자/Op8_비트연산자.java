package ch03_연산자;

/*
	비트 연산자
		. 비트를 사용해 연산하는 연산자
		. 정수 연산만 가능
		
		. AND	: & -> 1 1 --> 1
		. OR	: | -> 0 0 --> 0
		. XOR	: ^ -> 같으면 0(OK), 다르면 1
*/

public class Op8_비트연산자 {
	
	public static void main(String[] args) {
	
		int n1 = 10;
		int n2 = 5;
		
		int result = n1 & n2;   
		/*
		 	1010 & 0101 = 0000
		 	
		 			8  4  2  1
		 	-------------------
		 	n1  10  1  0  1  0
		 	n2   5  0  1  0  1
		 	-------------------
		 	 &		0  0  0  0
		*/
		
		System.out.println(result);
		
		result = n1 | n2;		// 1111 -> 15
		System.out.println(result);
		
		result = n1 ^ n2;		// 1111 -> 15
		System.out.println(result);
		
		
		
	}
	
}
