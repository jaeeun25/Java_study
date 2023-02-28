package step1_클래스와객체;

/*
	. 클래스의 이름은 파일의 이름과 같아야 한다.
	. 생성자는 클래스의 이름과 같은 특별한 메소드이다.
	. 생성자는 객체생성과 초기화의 역할을 한다.
	. 클래스의 구성은
		- 필드
		- 생성자
			. 비어있는 생성자를 기본 생성자라고 부른다.
			. 이 기본 생성자는 코드에서 생략하면 자동으로 컴파일 시에 추가해준다.
		- 메소드
			. 기능을 구현한다.
			. void가 있으면 return이 없다.
			. return이 필요하다면 메소드명 앞에 반환 타입을 명시해야 한다.
			. set메소드, get메소드는 관례적으로 작명해야 한다.
			
	. 객체 생성 후에 활용한다.
		- 객체명.필드명, 객체명.메소드()
	
	* 실습 - 통장 클래스 생성
	* 		- 입출금 실행
*/

// 통장 클래스
class Account{
	// bank, name, balance(잔고)
	String bank, name;
	int balance = 0;
	
	// 생성자
	
	Account() {}	// 기본 생성자
	Account(String bank, String name, int balance) {
		this.bank = bank;
		this.name = name;
		this.balance = balance;
	}
	
	// 입금 - deposit(int amt)
	void deposit(int amt) {
		balance += amt;
	}
	// 출금 - withdraw(int amt)
	void withdraw(int amt) {
		if(balance < amt) System.out.println("잔액이 부족합니다.");
		else balance -= amt;
	}
	// 잔액조회 - balance()
	void balance() {
		System.out.println(name + "님의 통장 잔액: " + balance);
	}	
}

// 실행 클래스
public class C6_AccountEx {
	
	public static void main(String[] args) {
		
		// 통장1 개설 - 객체 생성
		// Account ac = new Account();
		Account ac1 = new Account("우리은행", "곽두팔", 10000);		// 생성자 통해 초기화
		
		// 잔액 조회
		ac1.balance();
		// 입금 - 3000
		ac1.deposit(3000);
		// 잔액 조회
		ac1.balance();
		// 출금 - 5000
		ac1.withdraw(5000);
		// 잔액 조회
		ac1.balance();
		
		ac1.withdraw(12000);
		
		System.out.println();
		
		// 통장2 개설 - 객체 생성
		Account ac2 = new Account("국민은행", "황갑돌", 100000);
		// 잔액 조회
		ac2.balance();
		// 입금 - 5000
		ac2.deposit(5000);
		// 잔액 조회
		ac2.balance();
		// 출금 - 70000
		ac2.withdraw(70000);
		// 잔액 조회
		ac2.balance();
	}
}
