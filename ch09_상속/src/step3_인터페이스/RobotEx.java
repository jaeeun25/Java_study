package step3_인터페이스;

interface Robot{}

class DanseRobot implements Robot{
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}

class DrawRobot implements Robot{
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}

class SingRobot implements Robot{
	void sing() {
		System.out.println("노래를 부릅니다.");
	}
}

public class RobotEx {
	
	static void action(Robot r) {
		if(r instanceof DanseRobot) ((DanseRobot) r).dance();
		else if (r instanceof DrawRobot) ((DrawRobot) r).draw();
		else ((SingRobot) r).sing();
	}
	
	public static void main(String[] args) {
		
		// 업캐스팅해서 배열에 담기
		Robot[] rb = new Robot[3];
		rb[0] = new DanseRobot();
		rb[1] = new DrawRobot();
		rb[2] = new SingRobot();
		
		for(Robot r : rb) {
			action(r);		// static 메소드 안에서는 static 붙은 것들만 부를 수 있다.		
			/*
			// 다운캐스팅해서 각 클래스 마다 가지고있는 메소드 실행
			if(r instanceof DanseRobot) ((DanseRobot) r).dance();
			else if (r instanceof DrawRobot) ((DrawRobot) r).draw();
			else ((SingRobot) r).sing();
			*/
		}		
	}
}
