package bak;

public class Circle implements Shape {

	public double radius = 3.14;
	public Circle(double radius) {
		this.radius = radius;
	}
	@Override
	public void draw() {
		System.out.println("반지름이 " + radius + "인 원입니다.");
	}

	@Override
	public double getArea() {
		return radius * radius * PI;
	}

}
