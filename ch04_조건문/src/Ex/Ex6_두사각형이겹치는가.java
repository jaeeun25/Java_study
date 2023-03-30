package Ex;

import java.util.Scanner;

public class Ex6_두사각형이겹치는가 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 사각형1: (x1, y1), (x2, y2)
		System.out.print("사각형1 첫 번째 x1, y1 좌표 >> ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		
		System.out.print("사각형1 두 번째 x2, y2 좌표 >> ");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		// 사각형2: (p1, q1), (p2, q2)
		System.out.print("사각형2 첫 번째 p1 ,q1 좌표 >> ");
		int p1 = sc.nextInt();
		int q1 = sc.nextInt();
		
		System.out.print("사각형2 두 번째 p2, q2 좌표 >> ");
		int p2 = sc.nextInt();
		int q2 = sc.nextInt();
		
		if((x2 < p1) || (x1 > p2) || (y1 > q2) || (y2 < q1)) {
			System.out.println("두 사각형은 겹치지 않는다.");
		}
		else {
			System.out.println("두 사각형은 겹친다.");
		}
	}

}
