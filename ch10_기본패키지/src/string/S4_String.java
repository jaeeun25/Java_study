package string;

public class S4_String {
	public static void main(String[] args) {
		
		String s1 = "WorldCup korea";
		String s2 = "Apple";
		String s3 = "APPLE";
		
		// 1. s1의 5번째 문자 출력 - charAt()
		System.out.println(s1.charAt(4));
		// 2. s2와 s3는 같은 문자열인가? - equals()
		System.out.println(s2.equals(s3));
		// 3. s2와 s3가 대소문자 구분없이 동일한 문자열인가? - equalsIgnoreCase()
		System.out.println(s2.equalsIgnoreCase(s3));
		// 4. s1문자열은 "World"로 시작하는가? - startdWidth()
		System.out.println(s1.startsWith("World"));
		// 5. s1문자열은 "rea"로 끝나는가? - endsWith()
		System.out.println(s1.endsWith("rea"));
		// 6. s2을 전체 대문자로 변환 - toUpperCase()
		System.out.println(s2.toUpperCase());
		// 7. s1의 Cup문자열 시작위치(인덱스) 출력 - indexOf()
		System.out.println(s1.indexOf("Cup"));
		
		String s4 = "혼자하는 자바";
		// 8. s4의 인덱스 5부터 8이전까지의 문자열은? - substring()
		System.out.println(s4.substring(5,s4.length()));
		// 9. s4에 "와 예제 프로그램" 문자열 붙여서 출력 - concat()
		System.out.println(s4.concat("와 예제 프로그램"));
		// 10. s4에 "자바"를  "Java"로 변경 - replace()
		System.out.println(s4.replace("자바", "Java"));
	}
}
