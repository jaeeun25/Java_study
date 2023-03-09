package math;

public class Math2 {
	public static void main(String[] args) {
		
		double ran = Math.random();				// 0.0 ~ 1.0 미만 사이의 값 반환
		
		System.out.println(ran);
		System.out.println((int)(ran*10)+1);	// 1~10을 얻기 위해 +1 (없을 시 0~9)
		System.out.println((int)(ran*100)+1);
		System.out.println((int)(ran*1000)+1);
		System.out.println((int)(ran*10000)+1);
		
		System.out.println("******************");
		System.out.println("이번주 로또번호는..?");
		for(int i=0; i<6; i++) {
			double lotto = Math.floor(Math.random()*45+1);
			int lottoNo = (int)lotto;
			System.out.print(lottoNo + " ");
		}
		System.out.println();
		
		// 2~6사이의 랜덤 값
		System.out.println((int)((Math.random()*10) % 5 + 2));
		// 15~35 사이의 랜덤 값
		System.out.println((int)(Math.random()*100) % 21 + 15);
		// 1~1000
		System.out.println((int)(Math.random()*1000)+1);
		
	}
}
