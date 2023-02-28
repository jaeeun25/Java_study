package ch05_반복문;

public class For5 {
	public static void main(String[] args) {
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("점점 줄어들게 모양을 찍습니다.");
		for(int i = 4; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}		
		
		System.out.println("다이아몬드");
		for(int i = 1; i < 8; i++) {
			for(int j = 1; j < 8; j++) {
				if(i <= 4 && j >= 5-i && j <= 3+i) {
					System.out.print("*");
				}
				else if(i >= 5 && j >= i-3 && j <= 8-(i-3)) {
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

//1234567
//   *			i=1 -> j=4  		
//  ***			i=2 -> j=3,4,5  	
// *****		i=3 -> j=  2,3,4,5,6			
//*******		i=4 -> j=1,2,3,4,5,6,7		
// *****		i=5 -> j=2,3,4,5,6			
//  ***			i=6 -> j=3,4,5  	
//   *			i=7 -> j=4  		
