package ch06_배열;

import java.util.Scanner;

public class Array3_Ex {
	public static void main(String[] args) {
		
		// 1. 스캐너로 더하고 싶은 숫자를 10개 입력받는다.
		// 2. 입력받은 숫자를 배열에 저장한다.
		// 3. 총 합을 구한다.
		// 4. 여기의 최대값(max)과 최소값(min)을 구해서 출력한다.
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		int sum = 0, max = 0, min = 0, cnt = 0;
		
		// 해설
		while(true) {
			System.out.print((cnt+1) + "번째 숫자를 입력해주세요>> ");
			arr[cnt] = sc.nextInt();
			cnt++;
			if(cnt >= arr.length) {
				System.out.println("더 이상 입력이 불가합니다.");
				break;
			}
		}
		
		max = -10000;
		min = 100000;
		
		
		/*
		// 해설+내 생각
		while(true) {
			if(cnt > arr.length) {
				System.out.println("더 이상 입력이 불가합니다.");
				break;
			}
			
			System.out.print((cnt+1) + "번째 숫자를 입력해주세요>> ");
			arr[cnt] = sc.nextInt();
			
			if(cnt == 0) {
				max = arr[cnt];
				min = arr[cnt];
			}	
			
			cnt++;
		}
		*/
	
		/*
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i+1) + "번째 숫자를 입력해주세요>> ");
			arr[i] = sc.nextInt();
			
			if(i == 0) {
				max = arr[i];
				min = arr[i];
			}
		}
		System.out.println("더 이상 입력할 수 업습니다");
		*/
		sc.close();
		
		System.out.println("**********입력 결과**********");
		for(int a : arr) { 
			System.out.println(a);
		
			sum += a;
			
			if(max < a) max = a;
			if(min > a) min = a;		// 해설대로 하는 경우
			//else if(min > a) min = a;	
		}
		
		System.out.println("합계: " + sum);
		System.out.println("max: " + max);
		System.out.println("min: " + min);
		
	}
}
