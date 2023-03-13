package mylib;

public class DayOfCalculator {
	public String getResult(int[] join, int[] resign) {
		int yy = resign[0] - join[0];
		int mm = resign[1] - join[1];
		int dd = resign[2] - join[2];
		
		return (Integer.toString(yy) + "년" +
				Integer.toString(mm) + "월" + 
				Integer.toString(dd) + "일");
	}
}
