package 표준입출력;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Standard3 {
	public static void main(String[] args) {
		
		try {
			FileInputStream fio = new FileInputStream("C:\\LJE\\File\\file1.txt");			// 읽어오기. 역슬래쉬 쓰는 경우는 \\ 두개 써야 인식 됨(일반 슬래쉬 쓸꺼면 하나만 써도 된다)
			
			//스캐너와 연결
			//Scanner sc = new Scanner(fio);
			//String str = sc.next();
			//System.out.print(str);
			System.out.print(fio);
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
