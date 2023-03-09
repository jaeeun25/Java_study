package object;

class Student{
	String name = "홍길동";
}

public class Obj2 {
	public static void main(String[] args) {
		Student st1 = new Student();
		Student st2 = new Student();
		System.out.println(st2.toString());
		System.out.println(st1.toString());
		
		if(st1 == st2) {
			System.out.println("같다");
		}
		else {
			System.out.println("다르다");
		}
		
		if(st1.equals(st2)) {
			System.out.println("같다");
		}
		else {
			System.out.println("다르다");
		}
		
	}
}
