package generic;

class Queue<T>{		// T --> String, Integer, Double, Person(객체)..
	T[] push(T[] data) {
		for(int i=0; i<data.length; i++) {
			data[i] = (T)("학습" + i);
		}
		return data;
	}
	
	void pop(T[] data) {
		for(int i=0; i<data.length; i++) {
			System.out.println("data[" + i + "]=" + data[i]);
		}
	}
}

public class Generic9 {
	public static void main(String[] args) {
	
		String[] data = new String[10];
		Queue<String> q = new Queue<>();
		
		q.push(data);
		q.pop(data);
		
		
	}
}
