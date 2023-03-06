package step1_상속;

class Parent{
	int x = 100;
	Parent() {			//4(super(x) 없는 경우)
		this(200);
		System.out.println("이때 x값은1: " + x);		// 200(3)
	}
	Parent(int x){		//5
		System.out.println("이때 x값은2: " + this.x);	// 100(1)   100(추가1)
		this.x = x;
		System.out.println("이때 x값은3: " + this.x);	// 200(2)	50(추가2)
	}
	int getX() {
		return x;
	}
}

class Child extends Parent{
	int x = 3000;
	Child(){			//2
		this(1000);									// this()가 있는 경우 super() 즉, 부모 생성자는 부르지 않음. 동시 호출 불가
		System.out.println("이때 x값은4: " + x);		// 1000 (6)
	}
	Child(int x){		//3
		super(x);	// 추가
		System.out.println("이때 x값은5: " + x);		// 1000 (4)		50(추가3)
		this.x = x;
		System.out.println("이때 x값은6: " + x);		// 1000 (5)		50(추가4)
	}
	int getY() {
		return x;
	}
}

public class Inher5 {
	public static void main(String[] args) {
		
		//Child c = new Child();	// 1
		Child c = new Child(50);	// 추가
		System.out.println("***************");
		System.out.println("x= " + c.getX());	// 200 (7)		50(추가5)
		System.out.println("y= " + c.getY());	// 1000 (8)		50(추가6)		
	}
}
