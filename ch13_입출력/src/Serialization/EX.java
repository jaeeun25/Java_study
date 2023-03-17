package Serialization;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

class Item implements Serializable{
	
	private static final long serialVersionUID = -7808610503354799040L;
	
	private String name;
	private int price;
	private String shop;
	
	public Item(String name, int price, String shop) {
		this.name = name;
		this.price = price;
		this.shop = shop;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public String getShop() {
		return shop;
	}
}

class ItemManagement implements Serializable{
	private static final long serialVersionUID = -4687249815359502394L;
	
	//private ArrayList<Item> itemList;
	private HashMap<String, Item> itemList2;
	private File src;
	public ItemManagement() throws ClassNotFoundException {
		src = new File("C:\\LJE\\File\\EX_HashMap.txt");			// ArrayList로 한 파일은 EX_ArrayList.txt
		//itemList = new ArrayList<Item>();
		itemList2 = new HashMap<String, Item>();
		readItem();
	}
	
	void readItem() throws ClassNotFoundException {
		try {
			FileInputStream fis = new FileInputStream(src);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			ItemManagement m = (ItemManagement) ois.readObject();

			//itemList = m.itemList;
			itemList2 = m.itemList2;
			
			fis.close();
			ois.close();
			System.out.println("제품 목록을 정상적으로 불러왔습니다.");
		} catch (EOFException e) {
			return;
		} catch (IOException e) {
			System.out.println("제품 목록을 불러오는 중 오류가 발생했습니다.");
		}
	}
	
	void addItem(ItemManagement m) {
		System.out.print("제품명>> ");
		String name = EX.sc.next();
		System.out.print("가격>> ");
		int price = EX.sc.nextInt();
		System.out.print("제조사>> ");
		String shop = EX.sc.next();
		
		Item item = new Item(name, price, shop);
		
		try {	// itemList와 파일에 저장하는 건 같이(파일에서 저장이 안되면 리스트에도 되면 안됨)
			FileOutputStream fos = new FileOutputStream(src);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			//itemList.add(item);
			itemList2.put(name, item);
			oos.writeObject(m);
			
			fos.close();
			oos.close();
			
			
			System.out.println("제품을 등록했습니다.");
		} catch (IOException e) {
			System.out.println("제품 등록 중 오류가 발생했습니다.");
		}
	}
	
	void showAllItem() {
		/*
		if(itemList.isEmpty())System.out.println("등록된 제품이 없습니다.");
		else {
			for(Item i : itemList) {
				System.out.println(i.getName() + " : " + i.getPrice() + " : " + i.getShop());
				System.out.println("*******************");
			}
			System.out.println("모든 제품 목록을 정상적으로 출력했습니다.");
		}
		*/
		
		if(itemList2.isEmpty())System.out.println("등록된 제품이 없습니다.");
		else {
			for(String key : itemList2.keySet()) {
				Item i = itemList2.get(key);
				System.out.println(i.getName() + " : " + i.getPrice() + " : " + i.getShop());
				System.out.println("*******************");
			}
			System.out.println("모든 제품 목록을 정상적으로 출력했습니다.");
		}
		
	}
	
	void searchItem() {
		System.out.print("검색하고 싶은 제품의 이름을 입력해주세요> ");
		String name = EX.sc.next();
		
		Iterator<String> it = itemList2.keySet().iterator();
		while(it.hasNext()) {
			Item i = itemList2.get(it.next());
			if(name.equals(i.getName())){
				System.out.println(i.getName() + " : " + i.getPrice() + " : " + i.getShop());
				return;
			}
		}
		System.out.println("찾으시는 상품은 목록에 없습니다.");
	}
}

public class EX {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws ClassNotFoundException {
		ItemManagement m = new ItemManagement();
		
		while(true) {
			System.out.print("메뉴를 선택해주세요 (1.제품등록|2.전제품조회|3.특정제품조회|4.종료) ");
			int menu = sc.nextInt();
			switch(menu) {
			case 1:
				m.addItem(m);
				break;
			case 2:
				m.showAllItem();
				break;
			case 3:
				m.searchItem();
				break;
			case 4:
				System.out.println("제품 관리 프로그램을 종료합니다.");
				sc.close();
				System.exit(0);
			default:
				System.out.println("메뉴를 다시 선택해주세요.\n");
				continue;
			}
			
			System.out.print("계속 하시겠습니까?(y/n) ");
			String ans = EX.sc.next();
			System.out.println();
			if(ans.equals("n")) {
				System.out.println("제품 관리 프로그램을 종료합니다.");
				sc.close();
				System.exit(0);
			}
		}
	}
}
