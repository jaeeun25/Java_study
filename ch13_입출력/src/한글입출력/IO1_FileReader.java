package 한글입출력;

import java.io.FileReader;
import java.io.IOException;

public class IO1_FileReader {
	public static void main(String[] args) {
		FileReader in = null;
		try {
			in = new FileReader("C:\\LJE\\File\\file8.txt");
			int c;
			while((c = in.read()) != -1) {
				System.out.print((char) c);
			}
			
			in.close();
		} catch(IOException e) {
			System.out.println("데이터 읽어오기에 실패했습니다.");
		}
	}
}
