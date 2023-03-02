package step2_필드;

class Parking{
	String name;					// 차 이름
	int in, out;					// 입고 시간, 출고 시간
	final int AMTPERTIME = 1000;	// 시간 당 요금
	
	// 생성자로 초기화
	Parking(String name, int in, int out){
		this.name = name;
		this.in = in;
		this.out = out;
	}
	
	// 시간 정산
	// 영수증 출력
	void print() {
		int time = in < out ? out-in : 24-(in-out);
		
		int fare = AMTPERTIME * time;
		
		System.out.println("차 이름: " + name + "\n" +
							"입고 시간: " + in + "시\n" + 
							"출고 시간: " + out + "시\n" +
							"요금: " + fare + "원");
	}
	
}

public class V3_주차장Ex {

	public static void main(String[] args) {
		
		Parking c1 = new Parking("람보르기니", 1, 10);	//9시간
		Parking c2 = new Parking("아우디", 18, 11);	//17시간

		c1.print();
		System.out.println("************");
		c2.print();
	}

}
