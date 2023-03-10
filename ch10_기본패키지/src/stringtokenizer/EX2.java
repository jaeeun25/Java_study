package stringtokenizer;

import java.util.Scanner;
import java.util.StringTokenizer;

// 문장 입력 후 몇 어절인지, 나누어진 어절 출력
public class EX2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문장을 입력해주세요 >");
		StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
		
		System.out.println("해당 문장은 " + st.countTokens() + "어절로 구성되어 있습니다.");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		sc.close();
	}
}
