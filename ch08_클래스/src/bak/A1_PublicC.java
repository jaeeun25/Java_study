package bak;

import step5_접근지정자.A1_PublicA;

public class A1_PublicC{
	
	String address;
	public A1_PublicC() {
		
		A1_PublicA pa = new A1_PublicA();
		pa.name="이순신";
	}
	
	String getAddress() {
		return address;
	}
}
