package step5_접근지정자;

// 원본
public class A4_Private_A {	
	
	// 1. 같은 클래스 내에 접근
	private String name;
	
	public String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}

}
