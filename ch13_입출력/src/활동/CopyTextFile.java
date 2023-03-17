package 활동;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTextFile {
	public static void main(String[] args) {
		
		File src = new File("C:\\LJE\\File\\file10.txt");		// 원본
		File dest = new File("C:\\LJE\\File\\file10_copy.txt");		// 사본
		
		int c;
		try {
			FileReader fr = new FileReader(src);
			FileWriter fw = new FileWriter(dest);
			
			while((c = fr.read()) != -1) {
				fw.write((char) c); 
			}
			
			fr.close();
			fw.close();
			
			System.out.println(src.getPath() + "를 " + dest.getPath() + "에 복사하였습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
