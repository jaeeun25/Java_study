package step4_싱글톤;

// 싱글톤
class Company{
	
	private static Company instance = new Company();
	private Company() {}	// 생성자 접근 제한둬서 main에서 new로 객체 만들 수 없게 함
	
	public static Company getInstance() {
		if(instance == null) {	// 아직 만들지 않았다면
			instance = new Company();
		}
		return instance;
	}
}

public class CompanyEx {
	public static void main(String[] args) {
		//Company instance = new Company();
		
		Company c1 = Company.getInstance();
		Company c2 = Company.getInstance();
		Company c3 = Company.getInstance();
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
	}
}
