package ch06_배열;

public class Array9 {

	public static void main(String[] args) {
		
		Object[] arr = new Object[4];
		
		arr[0] = 100;
		arr[1] = "대한민국";
		arr[2] = 3.14f;
		arr[3] = 'A';
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
		int num = (int) arr[0];
		System.out.println(num);
		
		String str = (String) arr[1];
		System.out.println(str);
		
		float num2 = (float) arr[2];
		System.out.println(num2);
		
		char c = (char) arr[3];
		System.out.println(c);

	}

}
