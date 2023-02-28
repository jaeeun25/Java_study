package Ex;

// 4x + 5y = 60이 되는 모든 해(x, y)를 구하시오.
// 단, x, y는 10 이하이다.

public class Q8_방정식 {
	
	public static void main(String[] args) {
		
		// 4*x + 5*y = 60
		
		for(int x = 1; x < 11; x++) {
			for(int y = 1; y < 11; y++) {
				
				if((4 * x) + (5 * y) == 60) System.out.println("x: " + x + ", y: " + y);
			}
		}
		
		
	}
}
