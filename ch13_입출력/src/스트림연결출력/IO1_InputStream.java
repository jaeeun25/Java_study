package 스트림연결출력;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO1_InputStream {
	public static void main(String[] args) {
		
		// 스트림은 연결할 수 있다.
		FileInputStream fis = null;		// 1바이트
		InputStreamReader in = null;	// 2바이트 - 문자
		
		try {
			fis = new FileInputStream("C:\\LJE\\File\\file2.txt");
			in = new InputStreamReader(fis, "utf-8");
			
			int c;
			while((c = in.read()) != -1) {		// fis.read()로 할때는 파일을 읽어올 때 1바이트씩 읽어와서 한글은 깨짐
				System.out.print((char) c);
			}
			
			fis.close();
			in.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
