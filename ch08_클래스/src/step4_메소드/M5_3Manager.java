package step4_메소드;

public class M5_3Manager {

	private String name;
	private int age;
	private String part;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	void print() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("부서: " + part);
		System.out.println("================");
	}
	
}
