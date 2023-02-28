package ch05_반복문;

public class For6 {
	
	public static void main(String[] args) {
		/*
				 *
				**
			   ***
		      ****
			 *****
			******		
		*/
		
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				if(j >= (5 - i)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
