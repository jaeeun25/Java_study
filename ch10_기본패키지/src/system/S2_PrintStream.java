package system;

import java.io.IOException;

public class S2_PrintStream {
	public static void main(String[] args) throws IOException {
		
		char in = 0;
		boolean flag = false;
		
		System.out.print("여러개의 영문자를 입력하세요> ");
		while(true) {
			in = (char) System.in.read();		//  ctrl+z는 -1을 반환한다.
			if(!flag) {							// 출력 시작 판단
				System.out.println("입력받은 문자들은:");
				flag = true;
			}
			if(in == 13 || in == 10) {			// 엔터값(엔터치면 커서 앞으로 이동 + 줄바꿈 -> 13과 10 순으로 둘 다 입력(엔터 두번))
				if(in == 10) flag = false;
				continue;
			}
			if(in == 'q') {
				break;
			}
			
			System.out.println(in);
		}
	}
}
