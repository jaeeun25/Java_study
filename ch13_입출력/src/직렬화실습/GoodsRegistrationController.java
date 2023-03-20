package 직렬화실습;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Iterator;
import java.util.Scanner;

public class GoodsRegistrationController {
	String url;
	GoodsStorage goodsStorage;
	Scanner scanner;
	
	public GoodsRegistrationController(String url) {
		this.url = url;
		scanner = new Scanner(System.in);
		
		// 제품 목록 파일 불러오기
		try {
			FileInputStream fis = new FileInputStream(url);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			goodsStorage = (GoodsStorage) ois.readObject();
			
			ois.close();
			fis.close();
		} catch(EOFException e) {		// 저장된 목록이 없으면 새로 생성
			goodsStorage = new GoodsStorage();
			System.out.println("읽어올 목록이 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	// 제품 등록
	boolean insert() {
		while(true) {
			System.out.println("제품을 등록합니다. 제품 내역을 등록바랍니다.");
			System.out.print("제품명: ");
			String item = scanner.next();
			System.out.print("가   격: ");
			int price = scanner.nextInt();
			
			Goods goods = new Goods(item, price);
			goodsStorage.grr.add(goods);
			
			System.out.print("계속 등록하시겠습니까?(y/n)");
			String answer = scanner.next();
			if(answer.equals("n")) {
				return true;
			}
		}
	}
	
	// 전체 제품 조회
	void selectAll() {
		Iterator<Goods> it = goodsStorage.grr.iterator();
		
		while(it.hasNext()) {
			Goods g = it.next();
			System.out.println("******************");
			System.out.println("제품명: " + g.name);
			System.out.println("가   격: " + g.price);
		}
	}
	
	// 특정 제품 조회
	void select(String name){
		Iterator<Goods> it = goodsStorage.grr.iterator();
		
		while(it.hasNext()) {
			Goods g = it.next();
			if(name.equals(g.name)) {
				System.out.println("제품명: " + g.name);
				System.out.println("가   격: " + g.price);
				return;
			}
		}
		System.out.println("해당 제품이 없습니다.");
	}
	
	// 제품 수정
	boolean update(String name, int price) {
		Iterator<Goods> it = goodsStorage.grr.iterator();
		
		while(it.hasNext()) {
			Goods g = it.next();
			if(name.equals(g.name) && (price == g.price)) {
				System.out.print("변경) 제품명: ");
				g.name = scanner.next();
				System.out.print("변경) 가   격: ");
				g.price = scanner.nextInt();
				return true;
			}
		}
		return false;
	}
	
	// 제품 삭제
	boolean delete(String name){
		Iterator<Goods> it = goodsStorage.grr.iterator();
		
		while(it.hasNext()) {
			Goods g = it.next();
			if(name.equals(g.name)) {
				goodsStorage.grr.remove(g);
				return true;
			}
		}
		return false;
	}
}
