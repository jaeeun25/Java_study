package bak;

import step5_접근지정자.A3_Default_A;

public class A3_Default_C{
	
	String address;
	A3_Default_C() {
		
		A3_Default_A pa = new A3_Default_A();
		
		// 다른 패키지 접근불가 - 디폴트지정
		//pa.name="이순신";	
	}
	
	String getAddress() {
		return address;
	}
}
