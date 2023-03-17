package 한글입출력;

import java.io.FileWriter;
import java.io.IOException;

public class IO2_FileWriter {
	public static void main(String[] args) {
		
		FileWriter fout = null;
		
		try {
			fout = new FileWriter("C:\\LJE\\File\\file9.txt");
			fout.write("파일에 저장해 봅니다.");
			fout.write("버퍼를 활용 저장해 봅니다.");
			char[] buf = {'A', 'B', 'C', 'D'};
			
			fout.write(buf);
			
			fout.close();
			System.out.println("데이터 저장 완료되었습니다.");
		} catch (IOException e) {
			System.out.println("데이터 쓰기에 실패하였습니다.");
		}
	}
}
