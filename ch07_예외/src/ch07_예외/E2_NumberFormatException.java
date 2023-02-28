package ch07_예외;

// NumberFormatException
//	- 정수가 아닌 문자열을 정수로 변환할 때 예외발생 처리 
/*
	- 문자숫자 >>>  숫자: Integer.parseInt("숫자");
	- 숫자 >>>  문자숫자: Integer.toString(숫자);
	
	- 실수문자숫자 >>>  실수 숫자: Double.parseDouble("숫자");
	- 실수숫자 >>>  실수문자숫자 : Double.toString(숫자);
*/

public class E2_NumberFormatException {
	public static void main(String[] args) {
		
		String[] strNumber = {"23", "12", "975", "3.141592"};
		
		try {
			int j = Integer.parseInt(strNumber[3]);
			System.out.println("여기는 출력되나요?");			// 출력 안됨
			System.out.println(j+100);
		} catch (NumberFormatException e) {
			System.out.println("배열에 실수 타입이 존재합니다.");
		}
		
		System.out.println("종료합니다.");

	}
}
