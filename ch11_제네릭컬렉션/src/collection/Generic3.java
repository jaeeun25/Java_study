package collection;

class Stack3<T>{	// T자리엔 객체 선언시 넣었던 타입 모두 들어감
	T[] push(T[] e1) {
		for(int i=0; i<e1.length; i++) {
			//e1[i] = (T)Integer.valueOf(i);
			e1[i] = (T)Character.valueOf((char)(i+97));
		}
		return e1;
	}
	
	void pop(T[] e1) {
		for(int i=0; i<e1.length; i++) {
			System.out.println("e1[" + i + "]=" + e1[i]);
		}
	}
}

public class Generic3 {
	public static void main(String[] args) {
		
		/*
		// 1. 정수타입
		Integer[] e1 = new Integer[10];
		
		Stack3 s3 = new Stack3();
		s3.push(e1);
		s3.pop(e1);
		*/
		
		Character[] e2 = new Character[10];
		Stack3<Character> s4 = new Stack3<Character>();		// 구체화 시켰다고 한다.
		s4.push(e2);
		s4.pop(e2);
	
	}
}
