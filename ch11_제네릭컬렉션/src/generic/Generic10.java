package generic;

import java.util.Scanner;

class Point2<T,V>{ // x는 정수 y는 실수
	T x;
	V y;
	Point2(T x, V y){
		this.x = x;
		this.y = y;
	}
	public T getX() {
		return x;
	}
	public V getY() {
		return y;
	}
	
	// 메소드
	public <E> E print(E i) {
		System.out.println(i);
		E sum = i;
		System.out.println(sum);
		return i;
	}
	
	// 합계를 구하는 메소드(String, String 받아서 Double로 계산 후 String으로 리턴)	// 매개변수도 A타입으로 받으면 Double.parseDouble()불가
	public <A> A sum(String a, String b) {
		Double s = Double.parseDouble(a) + Double.parseDouble(b);
	
		return (A)Double.toString(s);
	}
}

public class Generic10 {
	public static void main(String[] args) {
		
		// 1. x:정수, y:실수
		Point2<Integer, Double> p1 = new Point2<>(10, 20.0);
		System.out.print("x: " + p1.getX() + " ");
		System.out.println("y: " + p1.getY());
		p1.<String>print("1000");
		p1.<Integer>print(100);
		
		// 2. x:실수, y:정수
		Point2<Double, Integer> p2 = new Point2<>(10.0, 20);
		System.out.print("x: " + p2.getX() + " ");
		System.out.println("y: " + p2.getY());
		
		// 3. x:실수, y:실수
		Point2<Double, Double> p3 = new Point2<>(10.0, 20.0);
		System.out.print("x: " + p3.getX() + " ");
		System.out.println("y: " + p3.getY());
		
		System.out.println(p3.<String>sum("10", "20"));
	}
}
