package ch06_배열;

public class Array8 {
	public static void main(String[] args) {
		
		// 생성
		int[][] intNum = new int[4][];
		intNum[0] = new int[] {1,2,3};
		intNum[1] = new int[] {3,4};
		intNum[2] = new int[] {5,6,7,8};
		intNum[3] = new int[] {9};
		
		for(int[] num : intNum) {
			for(int n : num) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
	}

}
