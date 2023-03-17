package 스트림연결출력;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IO7_BufferedOutput {
	public static void main(String[] args) {

		try {
			
			// 버퍼 이용 읽기
			FileReader fin = new FileReader("C:\\Windows\\System.ini");
			BufferedReader in = new BufferedReader(fin);
			
			// 출력
			BufferedOutputStream out = new BufferedOutputStream(System.out, 20);		// 콘솔에 출력. 뒤에 숫자 20은 버퍼 사이즈
			
			// 읽어오기
			int c;
			while((c = in.read()) != -1) {
				out.write((char) c);
			}
			
			in.close();
			fin.close();
			out.close();
		} catch(IOException e) {
			
		}
	}
}
