package 스트림연결출력;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO5_OutputStream {
	public static void main(String[] args) throws IOException{
		
		FileOutputStream fout = new FileOutputStream("C:\\LJE\\File\\file6.txt");
		
		int[] num = {1, 4, 6, -1, 50};		// int이므로 4바이트씩 저장
		byte[] b = {7, 51, 3, 4, 1, 24};
		
		// int 배열 저장
		for(int i=0; i<num.length; i++) {
			fout.write(num[i]);
		}
		// byte 배열 저장
		for(int i=0; i<b.length; i++) {
			fout.write(b);					// 바이너리로 저장하면 사람이 읽을 수 없다.
		}
		
		fout.close();
		
		// 읽어오기
		FileInputStream fis = new FileInputStream("C:\\LJE\\File\\file6.txt");
		InputStreamReader fr = new InputStreamReader(fis, "utf-8");
		
		int c;
		while((c = fr.read()) != -1) {
			System.out.print(c + " ");
		}
		
		fis.close();
		fr.close();
	}
}
