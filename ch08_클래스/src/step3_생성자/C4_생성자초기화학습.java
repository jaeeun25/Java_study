package step3_생성자;

class Product{
	// 초기화 블럭
	{
		System.out.println("1. 초기화 블럭");	
	}
	
	// 클래스 초기화 블럭
	static {	// static이 붙은건 공유하기 때문에 한번만 실행(제일 먼저 실행)
		System.out.println("2. 클래스 초기화 블럭");
	}
	
	// 생성자 초기화
	Product(){
		System.out.println("3. 생성자 블럭");
	}
	Product(int x){
		System.out.println("4. 매개변수 있는 생성자");
	}
	
	// 메소드
	void print() {
		System.out.println("메소드-기능담당, 함수의 기능을 한다.");
	}
}

public class C4_생성자초기화학습 {

	public static void main(String[] args) {
	
		Product p1 = new Product();
		System.out.println("***********");
		
		Product p2 = new Product(10);
		System.out.println("***********");
		
		Product p3 = new Product();
		
		p1.print();
		p2.print();
		p3.print();	
	}
}