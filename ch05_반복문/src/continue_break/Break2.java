package continue_break;

public class Break2 {
	public static void main(String[] args) {
		
		// 중첩 반복인 경우
		
		int i = 0, j = 0;
		
		while(true) {
			i++;
			System.out.println("현재의 i값은 " + i + "입니다.");
	
			while(true) {
				j++;
				System.out.println("현재의 j값은 " + j + "입니다.");
				
				if(j == 5) break;
			
				System.out.println("1");	// break 만나면 실행되지 않음. 즉, j가 5인 경우 실행 x
			}
			
			j = 0;
			if(i == 10) break;
		}
		
		
		
		
	}
}
