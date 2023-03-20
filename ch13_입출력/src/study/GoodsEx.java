package study;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class GoodsEx {
	public static void main(String[] srgs) {
		
		Scanner scanner = new Scanner(System.in);
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		GoodsArr goodsArr = new GoodsArr();
		
		while(true) {
			System.out.println("----------------제품 관리 프로그램----------------");
			System.out.println("1.제품등록|2.전체조회|3.선택조회|4.가격수정|5.삭제|6.종료");
			System.out.println("--------------------------------------------");
			
			System.out.print("메뉴를 선택하세요>> ");
			int menu = scanner.nextInt();
			
			switch(menu) {
			case 1:
				while(true) {
					System.out.println("제품을 등록합니다. 제품 내역을 등록바랍니다.");
					System.out.print("제품명: ");
					String item = scanner.next();
					System.out.print("가   격: ");
					int price = scanner.nextInt();
					
					Goods goods = new Goods(item, price);
					goodsArr.grr.add(goods);
					
					System.out.print("계속 등록하시겠습니까?(y/n)");
					String answer = scanner.next();
					if(answer.equals("n")) break;
				}
				try {
					fos = new FileOutputStream("", false);
					oos = new ObjectOutputStream(fos);
					
					oos.writeObject(goodsArr);
					
					oos.close();
					fos.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
				
			case 2:		// 전체 조회
				try {
					fis = new FileInputStream("");
					ois = new ObjectInputStream(fis);
					
					GoodsArr ga= (GoodsArr) ois.readObject();
					
					if(ga == null) {
						System.out.println("읽어올 객체가 없습니다.");
						break;
					}
					else {
						for(int i=0; i<ga.grr.size(); i++) {
							Goods g = ga.grr.get(i);
							System.out.println("************");
							System.out.println("상품명: " + g.name);
							System.out.println("상품명: " + g.price);
						}
					}
					ois.close();
					fis.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
				
			}
		}
	}
}
