package 스트림연결출력;

import java.io.FileInputStream;
import java.io.IOException;

public class IO3_InputStream {
	public static void main(String[] args) {
		
		FileInputStream fis;
		
		try {
			fis = new FileInputStream("C:\\LJE\\File\\file4.txt");
			byte[] bs = new byte[10];
			
			int i = 0;
			while((i = fis.read(bs)) != -1) {	//.read(byte[]) -> 배열의 크기 만큼 읽어온다.
				
				for(byte b : bs) {
					System.out.print((char)b);
				}
				
				System.out.println(": " + i + "바이트 읽음");
			}
			fis.close();
		} catch(IOException e) {
			System.out.println("읽기 오류입니다.");
		}
		System.out.println("end");
		
	}
}
