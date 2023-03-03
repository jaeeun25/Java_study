package step5_접근지정자;

// public을 붙이면 다른 패키지에서 불러서 사용할 수 있다.

// 원본
public class A1_PublicA {	// public 없으면 다른 패키지에서 import도 못함(+ 생성자도 붙여줘야함)

	//String name;		// public등 아무것도 안붙이면 default -> 같은 패키지만 접근 가능
	public String name;
	
	public String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}

}
