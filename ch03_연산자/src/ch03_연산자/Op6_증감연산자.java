package ch03_연산자;

/*
	증감 연산자
		. ++, -- : 1씩 증가, 감소
		
		. n++ : n = n + 1
		
		. 전위 증감 연산자: ++num
		. 후위 증감 연산자: num++
		
*/

public class Op6_증감연산자 {
	
	public static void main(String[] args) {
		
		int num;
		num = 10;
		
		num = num + 1;
		System.out.println(num);
		
		num++;
		System.out.println(num);
		
		num--;
		num--;
		System.out.println(num);
		
		//*******************
		
		int sum = ++num + 50;
		System.out.println(sum);
		System.out.println(num);
		
		sum = sum++ + 30;			// 대입보다 증감이 우선순위 먼저. 먼저 91 계산되고 sum 증감 되고 다시  91 대입되는 순인 듯
		System.out.println(sum);
		
		//*******************
		
		int n1 = 10;
		
		// 후위 증감
		int n2 = n1++;
		System.out.printf("n2 = %d, n1 = %d\n", n2, n1);
		
		int n3 = 10;
		System.out.printf("n3 = %d\n", n3++);
		System.out.printf("n3 = %d\n", n3);
		
		// 전위 증감
		int n4 = 10;
		System.out.printf("n4 = %d\n", ++n4);
		System.out.printf("n4 = %d\n", n4);
				
	}

}
