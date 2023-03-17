package 스트림연결출력;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO2_InputStream {
	public static void main(String[] args) {
		
		// 실습
		// C:\\Windows\\system.ini	읽어서 출력해보기
		// FileInputStream과 InputStreamReader 활용
		
		InputStreamReader in = null;
		
		try {			
			//in = new InputStreamReader(new FileInputStream("C:\\Windows\\system.ini"), "utf-8");
			in = new InputStreamReader(new FileInputStream(".\\file\\file3.txt"), "utf-8");
			
			int c;
			while((c = in.read()) != -1) {
				System.out.print((char) c);
			}
			
			System.out.println();
			System.out.println();
			System.out.println("인코딩 문자 집합: " + in.getEncoding());
			
			in.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
