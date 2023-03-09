package string;

public class S1_String1 {
	public static void main(String[] args) {
		
		String str = "점심 맛있게 드세요";
		
		// API에서 필요한 메소드를 찾아서 활용해 보세요
		// 문자열의 길이는?
		System.out.println(str.length());
		
		// 문자열 인덱스 2번의 문자는?
		System.out.println(str.charAt(2));
		
		// 문자열에서 2번 인덱스에서 7번 인덱스 전까지 추출하여 저장 후 출력하시오
		System.out.println(str.substring(2, 8));
		
		// "점심을 햄버거로 바꿔보시오.
		System.out.println(str.replace("점심", "햄버거"));
	}
}
