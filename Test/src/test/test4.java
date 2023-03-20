package test;

public class test4 {
	public static void main(String[] args) {
		int sumFive = 0;
		int sumSeven = 0;
		
		for(int i=1; i<=100; i++) {
			if(i % 5 == 0) sumFive += i;
			if(i % 7 == 0) sumSeven += i;
		}
		
		System.out.println("5의 배수의 합: " + sumFive);
		System.out.println("7의 배수의 합: " + sumSeven);
	}
}
