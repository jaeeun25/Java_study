package step1_클래스와객체;

public class C11_MyExpEx {

	int base;
	int exp;
	int getValue() {
		int res = 1;
		for(int i=1; i<=exp; i++) {
			res *= base;		// res = 1*5 , res = 5*5 , res = 25*5
		}						
		return res;
	}
	
	public static void main(String[] args) {
		
		C11_MyExpEx num = new C11_MyExpEx();
		
		num.base = 5;
		num.exp = 3;
		
		int result = num.getValue();
		System.out.println(num.base + "**" + num.exp + " = " + result);
		
	}

}