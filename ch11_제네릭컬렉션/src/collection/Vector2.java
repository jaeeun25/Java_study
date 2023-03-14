package collection;

import java.util.Vector;

class Point{
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}

public class Vector2 {
	public static void main(String[] args) {
		
		// Point를 저장할 수 있는 벡터를 생성해서
		// 임의의 x,y 값을 갖는 Point객체 5개를 저장하고
		// 전체를 출력해 보세요.
		
		Vector<Point> v = new Vector<Point>();
		int x, y;
		
		for(int i=0; i<5; i++) {
			x = (int) ((Math.random()*10) + 1);
			y = (int) ((Math.random()*10) + 1);
			
			v.add(new Point(x, y));
		}
		
		for(Point p : v) {
			System.out.println(p.getX() + " " + p.getY());
		}
		
	}
}
