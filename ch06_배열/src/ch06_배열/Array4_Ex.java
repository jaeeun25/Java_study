package ch06_배열;

import java.util.Arrays;
import java.util.Scanner;

public class Array4_Ex {

	public static void main(String[] args) {
		
		// 스캐너로 배열에 실수값 10개를 저장한다.
		// 저장된 값을 오름차순으로 정렬한다.
		
		// 해설
		Scanner sc = new Scanner(System.in);
		
		double[] arr = new double[10];
		double temp = 0.0;
		
		int i = 0;
		while(i < 10) {
			System.out.print((i+1) + "번째 실수를 입력하세요>> ");
			arr[i] = sc.nextDouble();
			i++;
		}
		
		// 출력확인
		for(double a : arr)
			System.out.println(a + " ");
		
		// 정렬1
		/*
		for(int j = 0; j < arr.length; j++) {
			for(int k = j+1; k < arr.length; k++) {
				if(arr[j] > arr[k]) {
					temp = arr[j];
					arr[j] = arr[k];
					arr[k] = temp;
				}
			}
		}
		*/
		
		// 정렬2 - sort() 활용
		Arrays.sort(arr);
		
		System.out.print("정렬된 값은: ");
		for(double p : arr) {
			System.out.print(p + " ");
		}
		
		
		/*
		Scanner sc = new Scanner(System.in);
		
		double[] arr = new double[10];
		double temp = 0.0;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i+1) + "번째 실수를 입력하세요>> ");
			arr[i] = sc.nextDouble();
		}

		for(int i = 0; i < arr.length; i++) {
			for(int j=i+1; j< arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(double i : arr)
			System.out.println(i + " ");
		*/
	}


}
