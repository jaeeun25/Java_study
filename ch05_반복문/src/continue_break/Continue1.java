package continue_break;

public class Continue1 {
	public static void main(String[] args) {
		
		target: for(int i = 0; i < 5; i++) {	
			System.out.println("쪽박 현재 i= " + i);
			
			for(int j = 0; j < 10; j++) {
				// 0 1 2
				if(j > 2) {
					System.out.println(j);
					continue target;
				}
				System.out.println("대박");
			}
		}
		System.out.println("끝났습니다.");
	}
}
