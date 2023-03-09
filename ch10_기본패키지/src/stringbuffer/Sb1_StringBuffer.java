package stringbuffer;

public class Sb1_StringBuffer {
	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer("Hello Java");
		StringBuffer sb2 = new StringBuffer("혼자하는 자바");
		
		// 1. sb1의 문자열
		System.out.println(sb1);
		// 2. sb1의 길이
		System.out.println(sb1.length());
		// 3. sb1의 버퍼를 포함한 크기	- capacity()				// capacity(): 들어갈 수 있는 공간(버퍼를 포함한 크기), length(): 들어잇는 공간(문자열 길이)
		System.out.println(sb1.capacity());
		// 4. sb2의 문자열
		System.out.println(sb2);
		// 5. sb2의 8번 인덱스에 "Power"문자열 추가하기 - insert()		// append(): 마지막에 문자열 추가, insert(): 지정한 위치에 추가
		System.out.println(sb2.insert(7, " Power"));
		// 6. sb2의 8번 문자 출력
		System.out.println(sb2.charAt(8));
		// 7. sb2의 2번 인덱스 '되'로 변경 - setCharAt()
		sb2.setCharAt(2, '되');
		System.out.println(sb2);
		// 8. sb2의 길이를 5로 고정시킨 후 문자열 - setLength()
		sb2.setLength(5);
		System.out.println(sb2);
		// 9. sb2의 역순정렬 출력 - reverse()
		System.out.println(sb2.reverse());
	}
}
