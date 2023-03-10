package Calendar;

import java.util.Calendar;
import java.util.Scanner;

// 두명의 플레이어가 엔터를 눌러 시작하고 10초를 예상해서 다시 엔터를 눌러 종료햇을 때
// 10에 가깝게 예상한 사람이 승리하는 게임

class Player{
	String name;
	int start;
	int end;
	int result = 0;
	
	Player(String name){
		this.name = name;
	}
	
	void result() {
		if(end < start) result = (60 + end) - start;
		else result = end - start;
	}
}

public class EX3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Calendar s;
		String enter = "", winner = "";
		
		// 플레이 인원수
		System.out.print("플레이 인원> ");
		int n = sc.nextInt();
		sc.nextLine();
		
		System.out.println("플레이어 " + n + "명의 이름을 차례로 입력해 주세요>");
		Player[] p = new Player[n];
		
		// 플레이어 이름 입력
		for(int i=0; i<n; i++) {
			p[i] = new Player(sc.nextLine());
		}
		
		System.out.println("10초에 가까운 사람이 이기는 게임입니다. 게임을 시작합니다.");
		// 게임 시작
		for(int i=0; i<n; i++) {
			
			System.out.print(p[i].name + "님 시작합니다. 시작 엔터키를 누르세요<Enter>");

			// 시작 엔터
			enter = sc.nextLine();
			s = Calendar.getInstance();		// 엔터를 누른 직후 초 가져오기
			p[i].start = s.get(Calendar.SECOND);
			System.out.println("시작한 시간 : " + p[i].start);
			
			// 종료 엔터
			System.out.print("10초가 되었다고 생각됩니까? 그러면 종료 엔터를 누르세요<Enter>");
			enter = sc.nextLine(); 
			s = Calendar.getInstance();		// 엔터를 누른 직후 초 가져오기
			p[i].end = s.get(Calendar.SECOND);
			System.out.println("종료한 시간 : " + p[i].end);
			
			p[i].result();
			System.out.println();
		}
		
		// 각 플레이어 시간 차 출력
		for(int i=0; i<n; i++) {
			System.out.println(p[i].name + "님의 시간차는 " + p[i].result + "입니다.");
		}
		
		// 결과 처리
		int min = p[0].result;
		winner = p[0].name;
		for(int i=0; i<n-1; i++) {
			if(Math.abs(10-min) < Math.abs(10-p[i+1].result)) {
				continue;
			}
			else if(Math.abs(10-min) > Math.abs(10-p[i+1].result)){
				min = p[i+1].result;
				winner = p[i+1].name + "님";
			}
			else {
				winner += p[i].name + "님 ";
			}
		}
		
		// 결과 출력
		System.out.println("\n승자는 바로 " + winner + " 입니다!");
		
		sc.close();
	}
}
