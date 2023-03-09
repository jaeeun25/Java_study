package object;

import java.util.Scanner;

class Point{
	
	int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean equals(Point p) {
		if(x == p.x && y == p.y)
			return true;
		else
			return false;
	}
}

public class Obj3 {
	public static void main(String[] args) {
		Point a = new Point(2, 3);
		Point b = new Point(2, 3);
		Point c = new Point(3, 4);
		
		if(a == b) 			// false
			System.out.println("a==b");
		else
			System.out.println("a!=b");
		
		// 여기서 equals은 위에서 만든 메소드
		if(a.equals(b))		// true
			System.out.println("a와 b는 같다");
		else
			System.out.println("a와 b는 다르다");
		
		if(a.equals(c))  	// false
			System.out.println("a와 c는 같다");
		else 
			System.out.println("a와 c는 다르다");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력해 주세요> ");
		String name = sc.next();
		System.out.print("나이를 입력해 주세요> ");
		int age = sc.nextInt();
		
		
		if(name.equals("홍길동")) {
			
		}
		if(age == 10) {
			
		}
	}
}
