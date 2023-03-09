package string;

public class S2_String {
	public static void main(String[] args) {
		char[] a = {'c', 'o', 'm', 'p', 'u', 't', 'e', 'r'};
		
		String str1 = new String(a);
		String str2 = new String(a,3,2);	// a[3]~a[4], 글자 2개
		
		String str3 = new String("즐거운 자바");
		String str4 = "단축 초기화 문자열";
		String str5 = str4.intern();
		
		if(str4.contentEquals(str5)) {
			System.out.println("같다");
		}
		else {
			System.out.println("다르다");
		}
		
		System.out.println(str1);
		System.out.println(str1.length());
		System.out.println(str2);
		System.out.println(str3);
	}
}
