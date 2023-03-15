package collection;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

class BigNumber {
	private Vector<Integer> vt;
	
	public BigNumber() {
		vt = new Vector<Integer>();
	}
	
	public void add(int n) {
		vt.add(n);
	}
	
	public void show() {
		System.out.print("입력한 수: ");
		
		for(int n : vt) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
	
	public int max() {
		int max = Integer.MIN_VALUE;
		
		Iterator<Integer> it = vt.iterator();
		while(it.hasNext()) {
			int num = it.next();
			max = max < num ? num : max;
		}
		
		return max;
	}
}

public class EX1 {
	// 정수 10개를 입력받고(종료:-1) 이 중에서 가장 큰 수를 출력한다. (Vector 활용)
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BigNumber ve = new BigNumber();
		
		for(int i=0; i<10; i++) {
			System.out.print("정수 입력(종료:-1)> ");
			int answer = sc.nextInt();
			
			if(answer == -1) break;
			
			ve.add(answer);
		}
		
		ve.show();
		
		System.out.println("가장 큰 수: " + ve.max());
	}
}
