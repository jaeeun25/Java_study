package step1_상속;

abstract class Shape1{
	Shape1 next;
	
	abstract void draw();
}

class Line1 extends Shape1{
	@Override
	void draw() {
		System.out.println("선을 그립니다.");
	}
}

class Rect1 extends Shape1{
	@Override
	void draw() {
		System.out.println("사각형을 그립니다.");
	}
}

class Circle1  extends Shape1{
	@Override 
	void draw() {
		System.out.println("원을 그립니다.");
	}
}

public class Inher11 {
	public static void main(String[] args) {
		/*
		 p--|				obj -->		obj -->
			start --> next	-->	next -->	next
					  draw()	draw()		draw()
					  ------	------		------
					  Line		Rect		Line
			last  ---> 
			last  -------------->
			last --------------------------->
		
		*/
		 Shape1 start, last, obj;
		 
		 start = new Line1();
		 last = start;
		 
		 obj = new Rect1();
		 last.next = obj;		// Line1 next에 Rect1 객체 저장
		 last = obj;
		 
		 obj = new Line1();
		 last.next = obj;		// Rect1 next에 Line1 객체 저장
		 last = obj;
		 	
		 obj = new Circle1();
		 last.next = obj;		// Line1 next에 Circle1 객체 저장
		 last = obj;
		 
		 // 출력
		 Shape1 p = start;
		 while(p != null) {
			 p.draw();
			 p = p.next;
		 }
		 
		 System.out.println("*************");
		 last.draw();
		 System.out.println("*************");
		 start.draw();
	}
}
