package ch06_배열;

// 이차원 배열
/*

	. 행과 열로 된 배열이다
	. [행][열]
	 			[0][3]  -->  [][][]
	 			[1][4]  -->  [][][][]
	 			[2][5]  -->  [][][][][]
	 			[3][3]  -->  [][][]
	
	. {{},{},{},,,,}
	. 행: a.length	열: a[i].length
	
*/

public class Array6 {
	public static void main(String[] args){
		int[][] arr = new int[3][];
		arr[0] = new int[3];			// arr[0] --> [][][]
		arr[1] = new int[3];			// arr[1] --> [][][]
		arr[2] = new int[3];			// arr[2] --> [][][]
		
		// 입력
		arr[0][0] = 0;
		arr[0][1] = 1;
		arr[0][2] = 2;
		arr[1][0] = 3;
		arr[1][1] = 4;
		arr[1][2] = 5;
		arr[2][0] = 6;
		arr[2][1] = 7;
		arr[2][2] = 8;
		
		// 출력
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("**********************");
		
		for(int[] a : arr) {	// 한 행을 꺼내오니까 int[]
			for(int num : a) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
		
		
		
	}
}
