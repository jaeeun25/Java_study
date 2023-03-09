package object;

class Rect{
	// 너비, 높이
	int width, height;
	
	// 생성자로 초기화
	public Rect(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	// equals(Rect obj) 이용해서	>>> 나아가서 Object obj로 바꿔 작성
	// 너비 * 높이 == obj.width*obj.height 같다면 true, 다르다면 false
	/*
	boolean equals(Rect obj) {
		int extent = width * height;
		
		if(extent == (obj.width * obj.height)) 
			return true;
		else 
			return false;
	}
	*/
	@Override
	public boolean equals(Object obj) {		// 업캐스팅 된 상태로 넘어옴
		Rect r = (Rect) obj;
		if((r.width*r.height) == width * height) 
			return true;
		else 
			return false;
	}
	
}

public class Obj4 {
	public static void main(String[] args) {
		
		// Rect 객체 생성1 - 2, 3
		Rect a = new Rect(2,3);
		// Rect 객체 생성2 - 3, 2
		Rect b = new Rect(3,2);
		// Rect 객체 생성3 - 3, 4
		Rect c = new Rect(3,4);
		
		// if문을 이용해서 a is equals to b ? 3개의 객체를 체크해보시오.
		if(a.equals(b)) System.out.println("a is equals to b");
		if(b.equals(c)) System.out.println("b is equals to c");
		if(a.equals(c)) System.out.println("a is equals to c");
	}
}
