package continue_break;

public class Break3 {

	public static void main(String[] args) {
		
		int i = 0, j = 0;
		
		// target 지정 break 예제
		
		target: while(i < 10) {
			i++;
			System.out.println("현재의 i값은 " + i + "입니다.");
			
			while(true) {
				j++;
				System.out.println("현재의 j값은 " + j + "입니다.");
				
				if(j == 5) {
					j = 0;
					break target;		// 첫번째 while문을 빠져나간다.
				}
			}
		}
		System.out.println("끝났습니다.");
	}
}
