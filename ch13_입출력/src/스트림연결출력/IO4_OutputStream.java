package 스트림연결출력;

import java.io.FileOutputStream;
import java.io.IOException;

public class IO4_OutputStream {
	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("C:\\LJE\\File\\file5.txt");
			fos.write('z');
			fos.write(72);
			fos.write(65);
			fos.write(80);
			fos.write(80);
			fos.write(89);
			fos.write(32);
			fos.write(74);
			fos.write(65);
			fos.write(86);
			fos.write(65);
			fos.write(33);
			
			System.out.println("정상적으로 파일이 생성되었습니다.");
			fos.close();
			
			FileOutputStream foss = new FileOutputStream("C:\\LJE\\File\\file5.txt", false);		// false: 새로 생성, true: 추가
			byte[] bs = new byte[26];
			byte data = 65;		// A
			
			for(int i=0; i<bs.length; i++) {
				bs[i] = data;
				data++;
			}
			
			// 배열을 저장
			foss.write(bs);
			
			// 줄바꿈
			foss.write(13);		// CR(커서앞으로 옮기고)
			foss.write(10);		// LF(밑줄로 내려라)
			
			// 일부만 저장
			foss.write(bs, 2, 10);	// 인덱스 2부터 10개
			System.out.println("정상적으로 파일이 생성되었습니다.");
			foss.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
