package ex;

import java.util.Scanner;

public class Ex4 {
	// 학생의 이름, 국어점수, 영어점수, 수학점수를 입력받아
	// 이름 - 1차원 배열
	// 국어/영어/수학/합계 - 2차원 배열
	// 평균 - 1차원 배열
	
	// 단 합계와 평균은 연산하여 배열에 저장하고
	// 전체를 출력하시오
	
	public static void main(String[] args) {
		
		int n = 2;
		
		String[] strName = new String[n];
		int[][] intScore = new int[4][n];
		float[] floatAvg = new float[n];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<n; i++) {
			System.out.print("이름>> ");
			strName[i] = sc.next();
			
			int sum = 0, avg = 0;
		
			for(int j=0; j<4; j++) {
				if(j < 3) {
					intScore[j][i] = sc.nextInt();
					sum += intScore[j][i];	
				}
				else if(j == 3) {
					intScore[3][i] = sum;
				}
			}
			floatAvg[i] = sum / (float) 3;
		}
			
		for(int i=0; i<n; i++) {
			System.out.println(strName[i] + "의 국영수 성적");
			for(int j=0; j<4; j++) {
				if(j < 3) System.out.print(intScore[j][i] + " ");
				else if(j == 3) System.out.println("\n총합: " + intScore[j][i]);
			}
			System.out.println("평균: " + floatAvg[i]);
		}
		
	}
}
