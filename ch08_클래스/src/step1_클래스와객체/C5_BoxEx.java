package step1_클래스와객체;

import java.util.Scanner;

class Box{
	// 가로, 세로, 깊이
	int width, height, depth;
	
	// 가로, 세로, 깊이 필드값 setValue()
	// 부피 구하기
	void setValue(int width, int height, int depth){
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	double volume() {
		return width * height * depth;
	}
}

public class C5_BoxEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 스캐너로 입력받기
		System.out.print("박스의 가로, 세로, 깊이 입력>> ");
		int w = sc.nextInt();
		int h = sc.nextInt();
		int d = sc.nextInt();
		
		// box1 객체 부피 구하기
		Box b1 = new Box();
		
		b1.setValue(w, h, d);
		System.out.println(w + " * " + h + " * " + d + " = " + b1.volume());
		
		// box2 객체 부피 구하기
		System.out.print("박스의 가로, 세로, 깊이 입력>> ");
		w = sc.nextInt();
		h = sc.nextInt();
		d = sc.nextInt();
		
		Box b2 = new Box();
		
		b2.setValue(w, h, d);
		System.out.println(w + " * " + h + " * " + d + " = " + b2.volume());
		
	}
	
}
