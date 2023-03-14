package generic;

class Stack1{
	Integer[] push(Integer[] e1) {
		for(int i=0; i<e1.length; i++) {
			e1[i] = i*10;
		}
		return e1;
	}
	void pop(Integer[] e1) {
		for(int i=0; i<e1.length; i++) {
			System.out.println("e[" + i + "]=" + e1[i]);
		}
	}
}

public class Generic1 {
	public static void main(String[] args) {
		Integer[] e1 = new Integer[10];
		Stack1 s1 = new Stack1();
		
		s1.push(e1);
		s1.pop(e1);
	}
}
