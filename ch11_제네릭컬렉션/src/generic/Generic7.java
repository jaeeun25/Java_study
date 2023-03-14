package generic;

class Point<T>{
	T x;
	T y;
	
	Point(T x, T y){
		this.x = x;
		this.y = y;
	}
	
	public T getX() {
		return x;
	}
	public T getY() {
		return y;
	}
}

public class Generic7 {
	
	// 반환 타입 앞에 < > 붙이면 메소드에만 할 수 있음
	public static <T> double makeRectangle(Point<T> p1, Point<T> p2) {
		
		// p1, p2의  x, y값을 읽어서 width와 height를 구하고 반환한다.
		// width
		double left = ((Double)p1.getX()).doubleValue();
		double right = ((Double)p2.getX()).doubleValue();
		// height
		double top = ((Double)p1.getY()).doubleValue();
		double bottom = ((Double)p2.getY()).doubleValue();
		
		double width = Math.abs(right - left);
		double height = Math.abs(bottom - top);
		
		return width * height;
	}
	
	public static void main(String[] args) {
		
		//Point p1 = new Point(0, 0);
		//Point p2 = new Point(2, 2);
		
		Point<Double> p1 = new Point<>(-5.0, 10.5);
		Point<Double> p2 = new Point<>(2.0, -3.0);

		System.out.println("구하려는 면적은 " + makeRectangle(p1, p2));
	}
}
