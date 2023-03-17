package Serialization;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Goods implements Serializable{
	private static final long serialVersionUID = -8245642565935782542L;
	
	String item;
	int price;
	String shop;
	
	public Goods(String item, int price, String shop) {
		this.item = item;
		this.price = price;
		this.shop = shop;
	}
	
	public String toString() {
		return "상품명: " + item + ", 가격: " + price + ", 제조사: " + shop;
	}
}

public class S2_Serialization {
	public static void main(String[] args) throws ClassNotFoundException {
		
		Goods snack1 = new Goods("감자깡", 1800, "농심");
		Goods snack2 = new Goods("새우깡", 2000, "롯데");
		
		// 상품 목록 파일 생성
		try {
			FileOutputStream fos = new FileOutputStream("C:\\LJE\\File\\serialization2.out");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(snack1);
			oos.writeObject(snack2);
			
			fos.close();
			oos.close();
			
			System.out.println("상품목록파일이 생성되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 상품 목록 파일 읽어오기
		try {
			FileInputStream fis = new FileInputStream("C:\\LJE\\File\\serialization2.out");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			//Goods g1 = (Goods) ois.readObject();
			//Goods g2 = (Goods) ois.readObject();
			Goods g = null;
			
			while((g = (Goods) ois.readObject()) != null) {
				System.out.println(g.toString());
			}
			//System.out.println(g1.toString());
			//System.out.println(g2.toString());
			
		} catch (EOFException e) {		// while문으로 돌리는 경우 EOFException 발생하므로 예외처리
			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
