package bak;

public class Rect implements Shape{

	double width, height;
	
	public Rect(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void draw() {
		System.out.println("가로가 " + width + "이고, 세로가 " + height + "인 사각형입니다.");
	}

	@Override
	public double getArea() {
		return width * height;
	}

}
