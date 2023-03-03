package step4_메소드;

class Factorial{
	
	int result = 1;
	
	void factorial(int cnt) {
		if(cnt == 1) System.out.println("1 = " + result);
		else {
			System.out.print(cnt + " * ");
			result *= cnt;
			factorial(--cnt);		// 재귀함수
		}
	}
	
}

public class M6_FactorialEx {
	public static void main(String[] args) {
		
		Factorial f = new Factorial();
		
		for(int i=10; i>0; i--) {
			f.result = 1;
			f.factorial(i);
		}
	}
}
