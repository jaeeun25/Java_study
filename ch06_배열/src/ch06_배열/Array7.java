package ch06_배열;

public class Array7 {

	public static void main(String[] args) {
		
		// 생성
		int[][] intNum = {{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}};
		
		// 출력1
		for(int i=0; i<intNum.length; i++) {
			for(int j=0; j<intNum[i].length; j++) {
				System.out.print(intNum[i][j] + " ");
			}
			System.out.println();
		}
		
		// 출력2
		for(int[] i : intNum){
			for(int j : i){
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
