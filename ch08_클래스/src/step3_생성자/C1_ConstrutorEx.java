package step3_생성자;

/*
	this	: 내 자신의 객체
	this()	: 나의 생성자 호출, 오버로딩방식 호출, 첫줄에 작성해야 한다.(선언부 바로 밑에)
	super	: 부모의 객체
	super()	: 부모의 생성자, 오버로딩방식 호출
	
	p.245 - 오버로딩과 this관련 내용
*/

class Sonata{
	
	// 생성자 - 기본생성자, 초기화, void 사용하지 않고, return도 없다
	Sonata() {}
	Sonata(int num){
		System.out.println("자동차 도어 수는 "+ num +"개 이다.");
	}
	Sonata(String color){
		System.out.println("자동차의 색상은  "+ color +"색 이다.");
	}
	Sonata(int num, String option){
		this(num);
		System.out.println("옵션은"+ option + "입니다.");
	}
}

public class C1_ConstrutorEx {

	public static void main(String[] args) {
		
		Sonata car1 = new Sonata();		// 기본 생성
		Sonata car2 = new Sonata(2);
		Sonata car3 = new Sonata("파랑");
		System.out.println("*******************");
		Sonata car4 = new Sonata(4, "에어백");
	}
}