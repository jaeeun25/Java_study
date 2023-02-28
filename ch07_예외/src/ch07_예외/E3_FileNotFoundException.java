package ch07_예외;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E3_FileNotFoundException {
	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("./file/a.txt");
			System.out.println("파일을 찾았습니다.");
			
			int c;
			while((c = fis.read()) != -1) {
				System.out.print((char) c);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수가 없습니다.");
		} catch (IOException e) {							// catch는 여러개 사용 가능
			System.out.println("입출력에 오류가 발생되었습니다.");
		}
		System.out.println();
		System.out.println("종료합니다.");
		
	}
}
