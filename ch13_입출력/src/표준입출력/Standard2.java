package 표준입출력;

import java.io.IOException;

public class Standard2 {
	public static void main(String[] args) {
		
		System.out.println("알파벳을 여러개 쓰고 [Enter]를 누르세요");
		
		int i;
		try {
			while((i = System.in.read()) != -1) {	// -1은 파일의 끝을 의미(read()가 다 읽으면 반환한다)
				System.out.print(i + ":");
				System.out.println((char) i);
				System.out.println();				// Enter: 10 13으로 출력된다.(둘 다 출력)
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
