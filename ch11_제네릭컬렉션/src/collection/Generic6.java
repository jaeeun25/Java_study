package collection;

class Person{
	String name = "홍길동";
	
	void print() {
		System.out.println("저는" + name + "입니다.");
	}
}

class Stack6<T>{
	int point;
	Object[] stack;
	
	public Stack6() {
		point = 0;
		stack = new Object[10];
	}
	
	public void push(T item) {
		if(point == 10) {
			return;
		}
		stack[point++] = item;
	}
	
	public T pop() {
		if(point == 0) {
			return null;
		}
		return (T) stack[--point];
	}
}

public class Generic6 {
	public static void main(String[] args) {
		
		// 기본데이터 타입은 박싱해서 넣는다.
		Stack6<Integer> s1 = new Stack6<Integer>();
		s1.push(100);
		s1.push(200);
		s1.push(300);
		for(int i=0; i<3; i++) {
			System.out.println(s1.pop());
		}
		
		Stack6<Character> s2 = new Stack6<Character>();
		s2.push('가');
		s2.push('나');
		s2.push('다');
		for(int i=0; i<3; i++) {
			System.out.println(s2.pop());
		}
		
		//person
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		
		//p2.name = "김길동";
		//p3.name = "이길동";
		
		Stack6<Person> st3 = new Stack6<>();
		st3.push(p1);
		st3.push(p2);
		st3.push(p3);
		for(int i=0; i<3; i++) {
			Person p = st3.pop(); 				// 반환 값이 person이므로
			System.out.println(p.name);
			p.print();
		}
	}
}

// 1. 클래스에 선언한다.
// 2. 클래스 안에 필요한 데이터 타입은 선언한 이니셜로 변경한다
// ----------------------------------------
// Stack6< > = new Stack6<> ();