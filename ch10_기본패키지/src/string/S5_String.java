package string;

public class S5_String {

	static String[] arr = {
			"IMF", "제주도", "자바도사", "한글나라", "Computer",
			"모카", "인터넷탐색","초롱초롱", "Com", "바람",
			"스크립터", "군고구마", "도서", "their"};
	public static void main(String[] args) {
		
		// 정렬 전  데이터 출력
			for(String s : arr)
				System.out.println(s);
		
			System.out.println("---------------------------------");
		// 정렬 후 데이터 출력
		// sort는 쓰지말고, comparaTo() -> 현재 스트링이 다른 스트링보다
		//							-> 크면 양수,
		//							-> 작으면 음수, 같으면 0
			String temp = "";
			for(int i = 0; i < arr.length; i++) {
				for(int j = i+1; j < arr.length; j++) {
					if(arr[i].compareTo(arr[j]) <= 0) 
						continue;
					else {
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			
			for(String s : arr)
				System.out.println(s);
	}

}
