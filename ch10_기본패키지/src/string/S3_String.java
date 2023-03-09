package string;

public class S3_String {
	public static void main(String[] args) {
		
		String s1 = "Java Korea";
		String s2 = new String("Java Korea");
		String s3 = s2.intern();				// s2 값과 같은 값이 저장된 곳의 주소를 가짐(String pool에 있는 'Java Korea' 주소 갖는 것 -> s1이 갖고잇는 주소)
												// .intern(): String pool에서 리터럴 문자열이 이미 존재하는지 체크.
												// 존재 시 해당 문자열 반환, 아닌 경우 리터럴을 String pool에 넣어준다.
		
		String s4 = new String("Java Korea");
		String s5 = new String("Java Korea");
		String s6 = new String("Java Korea");
		
		String s7 = "Java Korea";
		String s8 = "Java Korea";
		String s9 = "Java Korea";
		String s10 = "Java Korea";
		
		System.out.println("s1과 s2가 같은 장소?" + (s1 == s2));
		System.out.println("s1과 s2의 값이 같은가?" + (s1.equals(s2)));
		System.out.println("s1과 s3는 같은 장소?" + (s1==s3));
	}
}
