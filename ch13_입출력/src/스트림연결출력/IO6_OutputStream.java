package 스트림연결출력;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class IO6_OutputStream {
	public static void main(String[] args) {
		
		FileOutputStream fio;
		OutputStreamWriter out;
		
		try {
			fio = new FileOutputStream("C:\\LJE\\File\\file7.txt", true);			// 01011100        01010101		: 1바이트씩
			out = new OutputStreamWriter(fio);										// 0101110001010101				: 2바이트씩
			
			out.write("가나다");
			out.write("라마바");
			
			out.close();
			fio.close();
			
			System.out.println("파일을 저장하였습니다.");
			
			FileInputStream fin = new FileInputStream("C:\\LJE\\File\\file7.txt");	// 01011100        01010101
			InputStreamReader in = new InputStreamReader(fin, "utf-8");				// 0101110001010101
			
			int i;
			while((i = in.read()) != -1) {
				System.out.print((char) i);
			}
			in.close();
			fin.close();
			
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
}
