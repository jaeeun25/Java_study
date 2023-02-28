package continue_break;

public class Ex2_While {

	// 1~50사이에서 
	// while문을 활용해서 3의 배수를 출력하시오
	// . % 연산자를 활용 작성
	// . continue를 이용해서 작성
	
	// 35이하의 수만 출력하시오
	// . % 활용
	// . break를 활용
	
	public static void main(String[] args) {
		
		int num = 0;
		
		while(num < 50) {
			num++;
			/*
			// 첫번째 문제
			if(num % 3 != 0) continue;
			System.out.print(num + " ");	
			*/
			
			// 두번째 문제
			System.out.println(num + " ");
			if(num <= 35) break;
			/*
			// 두번째 문제 % 활용해서
			if(num == 36) break;
			else if(num / 10 == 3 && num % 10 <= 5) System.out.print(num + " ");
			else if(num / 10 < 3) System.out.print(num + " ");	
			*/
			
		}
	}
}
