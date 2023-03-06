package step1_상속;

import java.util.Scanner;

/*
	Point
		int x, y
		set(int, int) : void
		showPoint()	  : void  -->  (x, y) 출력

	ColorPoint
		String color
		setColor(String) : void
		showColorPoint() : void  --> 컬러
									 (x, y)
*/

class Point{
	private int x;
	private int y;
	
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void showPoint(){
		System.out.println("(" + x + ", " + y + ")");
	}
}

class ColorPoint extends Point{
	private String color;
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.println(color);
		super.showPoint();			// super 생략 가능
		
		/* 상속 x, x와 y값이 private이 아닌경우 이렇게도 가능
		Point p = new Point();
		p.x = 10;
		p.y = 20;
		System.out.println("(" + p.x + ", " + p.y + ")");
		*/
	}
}

public class Inher2_ColorPointEx {
	public static void main(String[] args) {
		
		// 객체 생성
		Scanner sc = new Scanner(System.in);
		ColorPoint cp = new ColorPoint();
		
		// 입력
		System.out.print("x 값 > ");
		int x = sc.nextInt();
		
		System.out.print("y 값 > ");
		int y = sc.nextInt();
		
		System.out.print("색상 > ");
		String color = sc.next(); 
		
		// 초기화 및 출력
		cp.set(x, y);			// 부모
		cp.setColor(color);		// 자식(내 거)
		cp.showColorPoint();
	}
}