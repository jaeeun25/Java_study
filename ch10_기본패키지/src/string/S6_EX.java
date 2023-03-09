package string;

import java.util.Arrays;
import java.util.Scanner;

public class S6_EX {
	public static void main(String[] args) {
		
		// 문자열을 스캐너를 통해서 입력합니다.
		// nextLine()
		// 문자열 길이 출력하고
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer(sc.nextLine());
		
		// 받은 문자열을 한글짜씩 회전시킨다
		// LOVE FOREVER
		// OVE FOREVERL
		// VE FOREVERLO
		//		~
		
		System.out.println("--------delete, append--------");
		
		for(int i=0; i<sb.length(); i++) {
			char c = sb.charAt(0);
			sb.deleteCharAt(0);
			sb.append(c);
			System.out.println(sb);
		}
 
		System.out.println("--------substring--------");
		
		for(int i=0; i<sb.length(); i++) {
			System.out.println(sb.substring(i+1) + sb.substring(0, i+1));
		}
	
		/* 배열 서로 값 변경해서 할 순 없을까
		String s = sc.nextLine();
		String[] arr = s.split("");
		String temp = "";
		int i, j, cnt=0;
		while(true) {
			i=0; j=1;
			while(i != arr.length-1) {
				if(i == 0) {
					temp = arr[i];
				}
				arr[i++] = arr[j++];
			}
			arr[i] = temp;
			for(String a : arr) System.out.print(a);
			cnt++;
			if(cnt == arr.length) break;
			
		}
		*/
		sc.close();
	}
}
