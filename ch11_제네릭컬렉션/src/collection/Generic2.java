package collection;

class Stack2{
	Character[] push(Character[] e1) {
		for(int i=0; i<e1.length; i++) {
			e1[i] = (char)(i+97);
		}
		return e1;
	}
	
	void pop(Character[] e1) {
		for(int i=0; i<e1.length; i++) {
			System.out.println("e1[" + i + "]=" + e1[i]);
		}
	}
}

public class Generic2 {
	public static void main(String[] args) {
		Character e1[] = new Character[10];
		Stack2 s2 = new Stack2();
		s2.push(e1);
		s2.pop(e1);
	}
}
