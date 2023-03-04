package step4_메소드;

import java.util.Scanner;

class Add{	// 필드와 생성자 이용
	
	int x, y;
	
	Add(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	int add() {
		return x + y;
	}
	
}

class Sub{		// 메소드에서 받은 매개변수 이용
	int sub(int x, int y) {
		return x - y;
	}
}

class Mul{
	int mul(int x, int y) {
		return x * y;
	}
}

class Div{
	double div(int x, int y) {
		return x / (double) y;
	}
}

public class M_Calculator {
	
	public static void main(String[] args) {
	
		// 두 정수와 연산자를 입력받아서
		// switch문으로 연산처리한다.
		
		Scanner sc = new Scanner(System.in);
		double result = 0;
		
		System.out.print("첫 번째 정수 > ");
		int x = sc.nextInt();
		
		System.out.print("두 번째 정수 > ");
		int y = sc.nextInt();

		System.out.print("연산자 > ");
		String op = sc.next();
		
		switch(op) {
			case "+":
				Add a = new Add(x, y);
				result = a.add();
				break;
			case "-":
				Sub s = new Sub();
				result = s.sub(x, y);
				break;
			case "*":
				Mul m = new Mul();
				result = m.mul(x, y);
				break;
			case "/":
				Div d = new Div();
				result = d.div(x, y);
				break;
			default:
				System.out.println("연산자를 잘못 입력하였습니다.");
		}
		
		System.out.println(x + op + y + " = " + result);
		
		
		
	}
}
