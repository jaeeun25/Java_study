package object;

class Person extends Object{
	String name = "홍길동";
	void print() {
		System.out.println("사람입니다.");
	}
	
	@Override
	public String toString() {
		return "Object입니다";
	}

	// 아래 함수 쓰든 안쓰든 일단 Object 상속받으므로 갖고있음
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
}

public class Obj1 {
	public static void main(String[] args) {
		
	}
}
