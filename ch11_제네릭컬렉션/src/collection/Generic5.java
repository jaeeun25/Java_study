package collection;

class GStack2{
	
	int point;
	Object[] stack;
	
	public GStack2(){
		point = 0;
		stack = new Object[10];
	}
	
	public void push(Integer item) {
		if(point == 10) {
			return;
		}
		stack[point++] = item;
	}
	
	public Integer pop() {
		if(point == 0) {
			return null;
		}
		return (Integer) stack[--point];
	}
}

public class Generic5 {
	public static void main(String[] args) {
		
		GStack2 st = new GStack2();
		
		st.push(1);
		st.push(2);
		st.push(3);
		
		for(int n=0; n<3; n++) {
			System.out.println(st.pop());
		}
	}
}
