package 활동;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ImageCopy {
	public static void main(String[] args) {
		
		File src = new File("C:\\LJE\\File\\choon.png");
		File dest = new File("C:\\LJE\\File\\choon_copy.png");
		
		int c;
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			
			System.out.println("이미지를 복사하시겠습니까?(y/n)");
			Scanner sc = new Scanner(System.in);
			String ans = sc.next();
			if(ans.equals("y")) {	// n 입력 시 파일 자체는 생성되지만 write가 되지 않기 때문에 깨진 파일로 생성된다. 
				while((c = fi.read()) != -1) {
					fo.write((byte) c);
				}
				fi.close();
				fo.close();
			}
			
			System.out.println("원본: "+ src.getPath());
			System.out.println("사본: " + dest.getPath());
			System.out.println("복사 완료 되었습니다.");
			
		} catch (IOException e) {
			System.out.println("파일 복사 오류!");
		}
	}
}
