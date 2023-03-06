package step4_메소드;

class Computer{
	int sum1(int[] values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int sum2(int ... values) {		// 넘겨준 값의 수에 따라 자동으로 배열 생성되고 매개값으로 사용
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}

public class M_매개변수개수모를경우_실습 {
	public static void main(String[] args) {
		Computer c = new Computer();
		
		int[] values = {1, 2, 3};
		int result;
		
		result = c.sum1(values);
		System.out.println(result);
		result = c.sum2(1,2,3);
		System.out.println(result);
		result = c.sum2(new int[] {1,2,3,4,5});
		System.out.println(result);
	}
}
