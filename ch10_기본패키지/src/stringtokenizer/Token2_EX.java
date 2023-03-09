package stringtokenizer;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Token2_EX {
	public static void main(String[] args) {
		
		// 스캐너 준비
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			// 문장을 입력해 주세요>> 
			// nextLine()으로 받는다.
			System.out.print("문장을 입력해 주세요>> ");
			String str = sc.nextLine();
			
			// 만약, "그만"으로 입력하면 "종료합니다.."
			if(str.equals("그만")) {
				System.out.println("종료합니다..");
				sc.close();
				System.exit(0);
			}
			
			//Tokenizer를 이용해서 공백으로 분류하고
			//어절의 개수는 몇개입니다. 라고 출력합니다.
			StringTokenizer st = new StringTokenizer(str, " ");
			System.out.println("어절의 개수는 " + st.countTokens() + "개 입니다.");
			
			// 그리고 나누어진 토큰을 모두 출력해 줍니다.
			while(st.hasMoreTokens()) {
				System.out.println(st.nextToken());;
			}
		}
	}
}
