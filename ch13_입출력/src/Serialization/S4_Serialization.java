package Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class S4_Serialization {
	public static void main(String[] args) throws ClassNotFoundException {
		
		try {
			FileInputStream fin = new FileInputStream("C:\\LJE\\File\\serialization3.out");
			ObjectInputStream objin = new ObjectInputStream(fin);
			
			PersonArr pa = (PersonArr) objin.readObject();		// ClassNotFoundException 없으면 빨간줄 뜸
			
			for(int i=0; i<pa.arr.length; i++) {
				if(pa.arr[i] == null) {
					break;
				} else {
					System.out.print(pa.arr[i].getName() + " ");
					System.out.print(pa.arr[i].getAge() + " ");
					System.out.println(pa.arr[i].getAdrress());
				}
			}
			System.out.println("출력이 완료되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
