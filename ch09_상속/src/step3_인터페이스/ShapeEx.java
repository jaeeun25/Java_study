package step3_인터페이스;

//import bak.*;		// 다불러오기
import bak.Circle;
import bak.Rect;
import bak.Shape;

public class ShapeEx {
	public static void main(String[] args) {
		
		// Shape배열 3개 크기 생성
		Shape[] sArr = new Shape[3];
		sArr[0] = new Circle(10);
		sArr[1] = new Rect(5, 4);

		// 전체 다시 그리기 출력
		// 전체 면적 계산 출력
		try {
			for(Shape s : sArr) {
				
				System.out.println("면적은 " + s.getArea() + "입니다.");
				System.out.println("-------------------");
				s.redraw();
				System.out.println("===================");

				
			}
		} catch(NullPointerException e) {
			System.out.println("값이 없는 방이 존재합니다.");
		}
	}
}
