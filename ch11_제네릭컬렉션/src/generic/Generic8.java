package generic;

class Point1<T, V>{
	T x;
	V y;
	
	Point1(T x, V y){
		this.x = x;
		this.y = y;
	}
	
	public T getX() {
		return x;
	}
	public V getY() {
		return y;
	}
}

public class Generic8 {
	
	// 반환 타입 앞에 < > 붙이면 메소드에만 할 수 있음
	public static <T,V> double makeRectangle1(Point1<T,V> p1, Point1<T,V> p2) {
		
		// p1, p2의  x, y값을 읽어서 width와 height를 구하고 반환한다.
		// width
		int left = ((Number)p1.getX()).intValue();		// 숫자 객체타입으로 할때 Number 타입으로 통일 시킬 수 있음
		int right = ((Number)p2.getX()).intValue();
		// height
		double top = ((Number)p1.getY()).doubleValue();
		double bottom = ((Number)p2.getY()).doubleValue();
		
		double width = Math.abs(right - left);
		double height = Math.abs(bottom - top);
		
		return width * height;
	}
	
	public static void main(String[] args) {
		
		//Point p1 = new Point(0, 0);
		//Point p2 = new Point(2, 2);
		
		Point1<Integer, Double> p1 = new Point1<>(-5, 10.0);
		Point1<Integer, Double> p2 = new Point1<>(2, -3.5);

		System.out.println("구하려는 면적은 " + makeRectangle1(p1, p2));
	}
}
