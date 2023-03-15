package collection;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

abstract class GraphicObjects{
	int x, y, w, h;					// 어떻게 초기화?
	public GraphicObjects(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}
	public abstract void view();	// x, y에서 w, h면 선(사각형)입니다.
}

class Line extends GraphicObjects{	// 어떻게 구현?

	public Line(int x, int y, int w, int h) {
		super(x, y, w, h);
	}

	@Override
	public void view() {
		double length = Math.sqrt(Math.pow(x-w, 2) + Math.pow(y-h, 2));
		
		System.out.println("선의 길이는 " + String.format("%.1f", length) + "cm");
		
	}
	
}
class Rect extends GraphicObjects{	// 어떻게 구현?

	public Rect(int x, int y, int w, int h) {
		super(x, y, w, h);
	}

	@Override
	public void view() {
		int width = Math.abs(x-w);
		int height = Math.abs(y-h);
		
		System.out.println("사각형의 넓이는 " + width*height + "cm^2");
	}
}

public class GraphicEditorEX {

	Vector<GraphicObjects> v = new Vector<GraphicObjects> ();		// < > 안에 넣을 타입?
	
	// add와 draw(출력) 어떻게 구현?
	void add(GraphicObjects obj) {							
		v.add(obj);
	};
	void draw() {
		Iterator<GraphicObjects> it = v.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			if(obj instanceof Rect) {
				((Rect) obj).view();
			}
			else {
				((Line) obj).view();
			}
		}
	};
	
	public static void main(String[] args) {
		
		GraphicEditorEX ge = new GraphicEditorEX() {};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x, y 값 입력 >> ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.print("w, h 값 입력 >> ");
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		// Vector에 add(?) - 선			// Verctor, add, draw가 static이 아닌데 어떻게 호출?
		ge.add(new Line(x,y,w,h));
		
		// Vector에 add(?)- 사각형
		ge.add(new Rect(x,y,w,h));
		
		//출력
		ge.draw();
	}
}
