package step6_익명클래스;

interface LamdaFunction{
	void method();
}

interface Point{
	void setPoint(int x, int y);
}
interface Student{
	void setName(String name, int grade);
	default void print() {
		System.out.println("학생입니다.");
	}
}
interface Bank{
	int balance = 500;		// final static 생략되어 있음
	int deposite(int amount);
}

public class Anonymouse3_Lamda {
	static int num1, num2;
	public static void main(String[] args) {
		
		LamdaFunction f = new LamdaFunction() {
			@Override
			public void method() {
				System.out.println("함수적 인터페이스로 구현한겁니다.");
			}
		};
		f.method();
		
		LamdaFunction f2 = () -> {		// 인풋 타입 없음 --> ()
			System.out.println("함수적 인터페이스로 구현한겁니다.");
		};
		f2.method();
		
		System.out.println("**************************");
		
		Point p = new Point() {
			@Override
			public void setPoint(int x, int y) {
				// num1, num2는 static 변수라 this로 지정 불가(static이라 객체 생성 전 먼저 생성되기 때문)
				// num1, num2가 static이 아니더라도 main이 static 메소드이기 때문에 불가
				//this.num1 = x;
				//this.num2 = y;
				
				// static 메소드 안 -> main 안이므로 num1과 num2도 static이어야 한다.
				num1=x;
				num2=y;
			}
		};
		
		p = (int x, int y) -> {
			num1 = x;
			num2 = y;
		};
		
		p.setPoint(10, 20);
		System.out.println(Anonymouse3_Lamda.num1 + "+" + Anonymouse3_Lamda.num2 + "=" + (num1+num2));
		
		System.out.println("**************************");
		
		Student st = new Student() {
			@Override
			public void setName(String name, int grade) {
				System.out.println("이름: " + name + ", " + "학년: " + grade);
			}
		};
		st.setName("홍길동", 3);
		st.print();

		System.out.println("**************************");
		
		Bank bank = new Bank() {
			@Override
			public int deposite(int amount) {
				int balance = Bank.balance + amount;
				return balance;
			}
		};
		Bank bank2 = (amount) -> {
			int balance = Bank.balance + amount;
			return balance;
		};
		System.out.println(bank.deposite(100));
		System.out.println(bank2.deposite(200));
	}
}
