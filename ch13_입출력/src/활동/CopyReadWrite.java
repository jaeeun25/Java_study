package 활동;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyReadWrite {
	public static void main(String[] args) {
		File src = new File("C:\\LJE\\File\\choon.png");
		File dest = new File("C:\\LJE\\File\\choon_copy2.png");
		
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			
			byte[] buf = new byte[1024*10];
			while(true) {
				int n = fi.read(buf);
				fo.write(buf, 0, n);			// (배열, 시작 인덱스, 출력할 총 개수) -> 즉, n까지라는건 모두 출력하겠다는 뜻
				if(n<buf.length) break;
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath() + " -> " + dest.getPath());
			
		} catch (IOException e) {
			System.out.println("파일 복사 오류");
		}
		
	}
}
