package collection;

import java.util.ArrayList;
import java.util.Scanner;

class GradesEx{
	private ArrayList<Character> grades;
	
	public GradesEx() {
		 grades = new ArrayList<Character>();
	}
	
	public void add(char c) {
		grades.add(c);
	}
	
	public void search(int i) {
		char c = 0;
		double score = 0;
		try {
			c = grades.get(i-1);
			switch(c) {
				case 'A':
					score = 4.0; break;
				case 'B':
					score = 3.0; break;
				case 'C':
					score = 2.0; break;
				case 'D':
					score = 1.0; break;
				case 'F':
					score = 0.0; break;
				default:
					System.out.println("해당 학점의 점수 데이터를 찾을 수 없습니다.");
					return;
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("학생은 총 " + grades.size() + "명입니다.");
			return;
		}
		
		System.out.println(i + "번째 학생의 학점은 " + c + "로 점수는 " + score + "입니다.");
	}
}

public class EX2 {
	// 스캐너를 활용하여 6개 학점('A', 'B', 'C', 'D', 'F')을 문자로 입력받아서
	// ArrayList에 저장하고 ArrayList를 검색해
	// 학점을 점수 (A:4.0 B:3.0 C:2.0 D:1.0 F:0.0)로 변환하여 출력한다.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		GradesEx ge = new GradesEx();
		
		for(int i=0; i<6; i++) {
			System.out.print((i+1) + "번째 학생의 학점을 입력해주세요> ");
			ge.add(sc.next().charAt(0));
		}
		
		System.out.println();
		System.out.print("몇번째 학생의 성적을 변환할까요?>> ");
		ge.search(sc.nextInt());
	}
}
