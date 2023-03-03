package bak;

import step5_접근지정자.A2_Protected_A;;

public class A2_Protected_C extends A2_Protected_A {
	
	String address;
	public A2_Protected_C() {
		
		//A2_Protected_A pa = new A2_Protected_A();
		name="이순신";		// 상속관계 아닌경우 에러
		getName();
	}
	
	String getAddress() {
		return address;
	}
}
