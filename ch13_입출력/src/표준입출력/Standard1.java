package 표준입출력;

import java.io.IOException;

/*
	1. 스트림이란?
		- 컴퓨터공학에서 연속적인 데이터흐름 또는 데이터를 전송하는 소프트웨어 모듈을 말한다.
		- 스트림은 도착한 순서대로 데이터를 흘려보낸다.
		- 자바에서의 입출력 스트림은 응용프로그램과 입출력장치를 연결하는 소프트웨어 모듈이다.
		
	2. 특징
		- 단방향
		- 선입선출(FIFO)
		- 기본단위 1바이트 > 문자 2바이트
		- 스트림끼리 서로 연결할 수 있다.
		
	3. 구분
		1) 입력이냐 출력이냐?
			- 입력: Input 또는 Reader
			- 출력: Output 또는 Writer
		2) 바이트냐 문자냐?
			- 바이트 스트림: ~~~~Stream
			- 문자 스트림: ~~~~Reader(Writer)
		3) 기반/보조?
			- 기반: File	(직접 읽/쓰기)
			- 보조: 그 외
	
	4. 입출력처리 예외
		- FileNotFoundException
		- IOExciption
		- ClassNotFoundException
	
	5. 구현
		- try ~ catch문 안에서 입출력 처리
		- 스트림은 닫아야 한다. close()
*/

public class Standard1 {
	public static void main(String[] args) {
		
		System.out.println("숫자1, 영어A, 한글 가 입력해보자");
		
		int i;
		try {
			i = System.in.read();
			System.out.println(i);
			System.out.println((char) i);
		} catch(IOException e) {
			e.printStackTrace();		// 에러 메세지의 발생 근원지를 찾아서 단계별로 에러를 출력
		}
		
	}
}
