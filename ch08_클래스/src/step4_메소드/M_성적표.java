package step4_메소드;

public class M_성적표 {
	public static void main(String[] args) {
		
		String[] tit = {"이름", "국어", "영어", "수학", "총점", "평균"};
		String[] name = {"김나나", "이미미", "박소소", "류하하"};
		int[][] score = {{90, 80, 70}, {76, 86, 90}, {90, 78, 90}, {80, 80, 80}};
		int[] tot = new int[3];
		int sum;
		
		System.out.println("성적표\n");
		for(String t : tit) System.out.print(t + "\t");
		System.out.println("\n=============================================");
		for(int i=0; i<score.length; i++) {
			sum = 0;
			
			System.out.print(name[i] + "\t");
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
				sum += score[i][j];
			}
			System.out.println(sum + "\t" + (sum/3));
		}
		System.out.println("=============================================");
		
		System.out.print("합계\t");
		sum = 0;
		for(int i=0; i<tot.length; i++) {
			for(int j=0; j<name.length; j++) {
				tot[i] += score[j][i];
				sum += score[j][i];
			}
			System.out.print(tot[i] + "\t");
		}
		System.out.println(sum + "\t" + (sum/tot.length));
		
		System.out.print("평균\t");
		sum = 0;
		for(int t : tot) {
			sum += t/name.length;
			System.out.print(t/name.length + "\t");
		}
		System.out.println(sum + "\t" + (sum/tot.length));
	}
}
