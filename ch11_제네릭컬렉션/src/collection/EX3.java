package collection;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

class CountryHashMap<T, V>{
	private HashMap<T, V> hm;
	
	public CountryHashMap(){
		hm = new HashMap<T, V>();
	}
	
	public void put(T c, V p) {
		hm.put(c, p);
	}
	
	public boolean search(T name) {
		Iterator<T> it = hm.keySet().iterator();
		DecimalFormat df = new DecimalFormat("###,###,###,###");
		
		while(it.hasNext()) {
			T key = it.next();
			if(name.equals(key)){
				System.out.println(name + "의 인구수는 총 " + df.format(hm.get(key)) + "명 입니다.");
				return true;
			}
		}
		System.out.println("해당 나라의 인구수 데이터가 없습니다.");
		return false;
	}
}

public class EX3 {
	// 나라이름과 인구수를 입력받아서 저장하고,
	// "끝"이 입력될 때까지 키 값을 받아서 해당하는 나라의 인구수를 출력합니다. (HashMap 활용)
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		CountryHashMap<String, Long> chm = new CountryHashMap<String, Long>();
		StringTokenizer st;
		
		System.out.println("나라 이름에 \"끝\"을 입력 시 입력은 종료됩니다.");
		while(true) {
			System.out.print("나라 이름, 인구 수(끝: 종료)> ");
			st = new StringTokenizer(sc.nextLine(), " ");
			String c = st.nextToken();
			if(c.equals("끝")) break;
			
			long p = Long.parseLong(st.nextToken());
			
			chm.put(c, p);
		}
		System.out.println();
		
		System.out.print("인구 수를 알고싶은 나라 이름을 입력하세요> ");
		chm.search(sc.next());
	}

}
