package step3_생성자;

class Score{
	
	// 학생이름, 국어점수, 수학점수, 영어점수
	String name;
	int kor, math, eng;
	
	// 생성자를 활용해서 필드를 초기화 시킨다
	Score(String name, int kor, int math, int eng){
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	// print() 메소드에서
	/*
		홍길동님
		국어: 80, 영어: 75, 수학: 99
		총점: 200
		평균: 89.1
	*/	
	
	void print() {
		System.out.println(name + "님\n" +
							"국어: " + kor + ", 영어: " + eng + ", 수학: " + math +
							"\n총점: " + (kor + eng + math));
		System.out.printf("평균: %.1f\n", ((double) (kor + eng + math) / 3));
		System.out.println("*************************");
	}
}

public class C5_국영수합계평균출력 {

	public static void main(String[] args) {
		
		// 홍길동님
		Score hong = new Score("홍길동", 80, 99, 75);
		
		// 이순신님
		Score lee = new Score("홍길동", 95, 86, 70);

		// 강감찬님
		Score kang = new Score("홍길동", 85, 79, 83);
		
		// 결과 출력
		hong.print();
		lee.print();
		kang.print();
	}
}