package string;

public class S7_StartEnd {
	public static void main(String[] args) {
		String str = "시작해보자고 네쿠라베~";
		String str2 = "배고프다이잉 스터디 끝나면 밥먹어야징 끝끝";
		String s = "시작";
		String e = "끝끝";
		
		System.out.println(str.startsWith(s));		// str이 "시작"으로 시작하는가? true
		System.out.println(str.startsWith(s, 1));	// str 1번부터 체크했을 때 "시작으로 시작하는가? fasle
		
		System.out.println(str2.endsWith(e));		// str2가 "끝끝"으로 끝나는가? true		
	}
}
