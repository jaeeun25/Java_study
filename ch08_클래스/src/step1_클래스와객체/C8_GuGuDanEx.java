package step1_클래스와객체;

import java.util.Scanner;

class GuGuDan{
	
	// dan, su
	int dan, su;
	
	GuGuDan() {}	// 기본 생성자
	// 생성자 - dan, su 초기화
	GuGuDan(int dan, int su){
		this.dan = dan;
		this.su = su;
	}

	// setNum() - dan, su 초기화
	void setNum(int dan, int su){		// 매개변수는 데이터 타입과, 갯수, 순서 맞춰서 넣어야한다
		this.dan = dan;
		this.su = su;
	}
	
	// guguDan(){
		// 구구단 출력까지 처리 - 해당하는 단의 1~su까지만 출력
	//}
	void guguDan(){
		for(int i=1; i<=su; i++)
			System.out.println(dan + " * " + i + " = " + (dan*i));	
	}
}

public class C8_GuGuDanEx {

	public static void main(String[] args) {
		
		// 스캐너로 단, 수 입력받는다
		// 객체를 생성해서
		// 초기화시키고
		// guguDan을 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단과 수를 입력해주세요 >> ");
		int dan = sc.nextInt();
		int su = sc.nextInt();
		
		/*
		// 생성자로 초기화
		GuGuDan gugudan1 = new GuGuDan(dan, su);
		gugudan1.guguDan();	
		*/
		
		// 메소드로 초기화
		GuGuDan gugudan2 = new GuGuDan();
		gugudan2.setNum(dan, su);
		gugudan2.guguDan();	
		
	}

}
