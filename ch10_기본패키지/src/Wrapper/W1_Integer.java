package Wrapper;

public class W1_Integer {
	public static void main(String[] args) {
		
		//-------------Integer-------------
		//박싱
		//Integer num1 = new Integer(10);	// 권장 x
		//Integer num1 = Integer.valueOf(10);	// 권장
		Integer num1 = 10;	// 자동 박싱
		
		String strNum = Integer.toString(10);		// Integer이용해 정수 -> 문자로 받기
		int intNum = Integer.parseInt("10");		// Integer이용해 문자 -> 정수로 받기
		
		//언박싱
		//int num2 = num1.intValue();
		int num2 = num1;
		
		//-------------Character-------------
		// 박싱
		//Character charStr = new Character('a');
		//Character charStr = Character.valueOf('a');
		Character charStr = 'a';
		
		//언박싱
		//char c = charStr.charValue();
		char c = charStr;
		
		//-------------Float-------------
		//박싱
		//Float floatNum = new Float(3.14f);
		//Float floatNum = Float.valueOf(3.14f);
		Float floatNum = 3.14f;
		
		//언박싱
		float f = floatNum;
		
		//-------------Double-------------
		//박싱
		//Double doubleNum = new Double(3.141592);
		//Double doubleNum = Double.valueOf(3.141592);
		Double doubleNum = 3.141592;
		
		//언박싱
		//double d = doubleNum.doubleValue();
		double d = doubleNum;
		
		Double dc = Double.parseDouble("3.141592");
		double dc2 = dc.doubleValue();
		
		String ds = Double.toString(dc);
	}
}
