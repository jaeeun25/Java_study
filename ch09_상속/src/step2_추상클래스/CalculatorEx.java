package step2_추상클래스;

import java.util.Scanner;

abstract class Calculator1{
	int num1=10;
	int num2=20;
	abstract void setValue(int num1, int num2);
	abstract int calculate();	
}

class Add extends Calculator1{

	@Override
	void setValue(int num1, int num2) {
		
		// 개념적으로는 this보단 super가 맞음 (출력값은 동일) -> 부모 필드라는 것을 알아보기 쉽게 super를 사용하는것이 더 좋음
		// 만약 Add클래스에 같은 필드가 있다면 super를 사용해야 부모 값 변경 가능(this는 안됨)
		super.num1 = num1;
		super.num2 = num2;
		
		//this.num1 = num1; 
		//this.num2 = num2;
	}

	@Override
	int calculate() {
		return num1 + num2;
	}
}

class Sub extends Calculator1{

	@Override
	void setValue(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;	
	}

	@Override
	int calculate() {
		return num1 - num2;
	}
	
}

class Mul extends Calculator1{

	@Override
	void setValue(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;	
	}

	@Override
	int calculate() {
		return num1 * num2;
	}
	
}

class Div extends Calculator1{

	@Override
	void setValue(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;	
	}

	@Override
	int calculate() {
		return num1 / num2;
	}
}

public class CalculatorEx {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = 0, y = 0;
		Calculator1 cal = null;
		
		while(true) {
			System.out.print("계산하고 싶은 연산자를 선택해주세요(1.더하기 / 2.빼기 / 3.곱하기 / 4.나누기) > ");
			int op = sc.nextInt();
			
			if(op < 5) {
				System.out.print("두 정수 입력 > ");
				x = sc.nextInt();
				y = sc.nextInt();
			}
			
			switch(op) {
			case 1:
				cal = new Add();
				//cal.setValue(x, y);
				//System.out.println(cal.calculate());
				break;
			case 2:
				cal = new Sub();
				//cal.setValue(x, y);
				//System.out.println(cal.calculate());
				break;
			case 3:
				cal = new Mul();
				//cal.setValue(x, y);
				//System.out.println(cal.calculate());
				break;
			case 4:
				cal = new Div();
				//cal.setValue(x, y);
				//System.out.println(cal.calculate());
				break;
			default:
				System.out.println("종료합니다");
				sc.close();
				System.exit(0);
			}
			
			cal.setValue(x, y);
			System.out.println(cal.calculate());
		}
	}
}
