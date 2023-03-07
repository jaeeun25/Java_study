package step3_인터페이스;

class LGPhone implements PhoneInterface{

	@Override
	public void sendCall() {
		System.out.println("LG폰으로 전화를 겁니다.");		
	}

	@Override
	public void receiveCall() {
		System.out.println("LG폰으로 전화를 받습니다.");
		System.out.println("지정된 시간: " + TIMEOUT);
	}
	
	@Override
	public void printLogo() {
		System.out.println("******LG Phone******");
	}
	
}

public class PhoneLG {
	public static void main(String[] args) {
		LGPhone lg = new LGPhone();
		lg.sendCall();
		lg.receiveCall();
		lg.printLogo();
	}

}
