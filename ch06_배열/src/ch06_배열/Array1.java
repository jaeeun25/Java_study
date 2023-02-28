package ch06_배열;

public class Array1 {
	public static void main(String[] args) {
		
		// 1. 배열 생성
		int[] intArr = new int[3];
		
		System.out.println(intArr.length);
		
		// 2. 값을 넣어보자 - 초기화
		intArr[0] = 1;
		intArr[1] = 2;
		intArr[2] = 3;
		//intArr[3] = 4;	// 고정 배열로 범위를 벗어나면 안됨
		
		// 3. 가져온다 - 출력
		System.out.println(intArr[0]);
		
		int sum = 0;
		// 4. 전체 출력
		for(int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
			
			// 전체 합계를 출력하시오
			sum += intArr[i];
		}
		System.out.println(sum);
		
		// 5. 확장 for
		for(int a : intArr) {
			System.out.println("intArr" + a);
		}
		
		
		//*******************************************
		
		// 우리나라 산이름을 저장하는 배열 5개 생성 하고
		// 초기화 시켜서, 하나씩 3개 출력하고
		// 전체를 일괄 출력해 보시오.
		
		String[] mountain = {"불암산", "도봉산", "북한산", "한라산", "지리산"};
		String str = "";
		for(int i = 0; i < mountain.length; i++) {
			if(i < 3) System.out.println(mountain[i]);
			str += mountain[i] + " ";
		}
		System.out.println(str);
		
		for(String s : mountain) {
			System.out.println(s);
		}
		
		
		
	}
}
