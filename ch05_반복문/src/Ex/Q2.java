package Ex;

public class Q2 {

	public static void main(String[] args) {
		/*
		 for를 이용해서 구현해 보시오
				 *
				**
			   ***
		      ****
			 *****
			 ****  	5-2
			 ***	6-4
			 **		7-6
			 *		
		*/
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 5; j++) {
				if(i <= 4 && j >= 4-i) {
					System.out.print("*");
				}
				else if(i > 4 && j <= 8 - i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		// 해설
		for(int i = 0; i < 4; i++) {
			for(int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();			
		}
		
		for(int i = 0; i <= 4; i++) {
			for(int j = 4; j >= i; j--) {
				System.out.print("*");
			}
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
