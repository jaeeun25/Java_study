package collection;

class GStack1{
	
	int point;
	Object[] stack;
	
	public GStack1(){
		point = 0;
		stack = new Object[10];
	}
	
	public void push(String item) {
		if(point == 10) {
			return;
		}
		stack[point++] = item;
	}
	
	public String pop() {
		if(point == 0) {
			return null;
		}
		return (String) stack[--point];
	}
}

public class Generic4 {
	public static void main(String[] args) {
		
		GStack1 st = new GStack1();
		
		st.push("서울");
		st.push("부산");
		st.push("광주");
		
		for(int n=0; n<3; n++) {
			System.out.println(st.pop());
		}
	}
}
