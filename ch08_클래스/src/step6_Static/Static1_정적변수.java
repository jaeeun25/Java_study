package step6_Static;

class StaticVar{
	String name;
	static String address;		// 정적변수, 클래스변수, static변수
	
	void setName(String name) {
		this.name = name;
	}
	
	// 클래스 메소드(정적 메소드, static 메소드)
	static void print() {		// static 메소드 안에선 static 변수들만 부를 수 있음.
		address = "마포구";
		//name = "홍길동";		// static은 제일 먼저 생성됨. name은 객체 생성 후 생기기 때문에 사용 불가
		//this.setName("금요일");	// this는 객체가 생성됐을 때 사용가능. 객체 생성 전 static이 먼저 생성되기 때문에 사용 불가
		//setName("금요일");		// this가 없어도 사용 불가
		
		int age = 30;			// 선언 자체를 안에서 한 것은 사용 가능
		//static String tel = "010-1111-2222";		// static 안에서 static 선언은 불가
	}
}

public class Static1_정적변수 {
	public static void main(String[] args) {
		
		// 객체 생성 전
		StaticVar.address = "영등포";		// 정적변수라서 가장 먼저 메모리에 올라가기 때문에 객체 없이 부를 수 있음
		StaticVar.print();
		
		//StaticVar.setName("홍길동");		// setName()은 static 메소드 아님. 객체 생성 후 사용 가능
		
		// 객체 생성 후
		StaticVar sv1 = new StaticVar();
		String name = sv1.name;
		sv1.setName("홍길동");
		
		sv1.address = "마포구";
		
		StaticVar sv2 = new StaticVar();
		sv2.address = "강서구";
		
		// 전부 강서구 출력 --> static은 객체 간 공유되기 때문
		System.out.println(StaticVar.address);
		System.out.println(sv1.address);
		System.out.println(sv2.address);
		}

}
