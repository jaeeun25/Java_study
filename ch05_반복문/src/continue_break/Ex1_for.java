package continue_break;

public class Ex1_for {
	// for문 1~50 사이에서 짝수만 출력하시오.
	// if문의 % 이용해서 해보시고 나서..
	// 그 밑에다가 continue를 이용해서도 작성 후 출력해 보세요
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 50; i++) {
			//if(i % 2 != 0) continue;
			if(i < 28) continue;		// 27보다 큰거 출력
			System.out.print(i + " ");
		}
	}
}
