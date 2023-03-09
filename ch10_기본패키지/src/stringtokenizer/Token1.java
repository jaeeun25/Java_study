package stringtokenizer;

import java.util.StringTokenizer;

public class Token1 {
	public static void main(String[] args) {
	
		String query = "name=홍길동&address=신촌&age=21";
		
		StringTokenizer st = new StringTokenizer(query, "&");
		int n = st.countTokens();							// countTokens()
		System.out.println("분리된 토큰은 몇 개인가? " + n + "개");
		
		/*
		for(int i=0; i<n; i++) {
			String token = st.nextToken();	// nextToken()
			System.out.println(token);
		}
		*/
		
		System.out.println("*******************");
		while(st.hasMoreTokens()) {			// hasMoreTokens() : 다음 token이 있으면 true 반환
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}
