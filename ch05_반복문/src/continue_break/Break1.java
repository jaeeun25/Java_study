package continue_break;

public class Break1 {
	public static void main(String[] args) {
		
		int num = 0, sum = 0;
		
		while(true) {
			num++;
			sum += num;
			
			if(num == 100) break;
		}
		
		System.out.println("합계: " + sum);
		
		
		
		
	}
}
