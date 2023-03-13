package mylib;

import java.util.Calendar;
import java.util.StringTokenizer;

public class ConvertDateArr implements ConvertDate {

	@Override
	public int[] setDate(String date) {
		StringTokenizer st;
		Calendar convertDate1 = Calendar.getInstance();
		
		st = new StringTokenizer(date.trim(), ".");
		String[] strDate = new String[3];
		int[] intDate = new int[3];
		int i = 0;
		while(st.hasMoreTokens()) {
			strDate[i] = st.nextToken().trim();
			intDate[i] = Integer.parseInt(strDate[i]);
			i++;
		}
		convertDate1.set(intDate[0], intDate[1], intDate[2]);
		
		return intDate;
	}	
}
