package step3_인터페이스;

interface AIInterface{
	
	void recognizeSpeech();
	void systhesizeSpeech();
	
}

class AIPhone implements MobilePhoneInterface, PhoneInterface, AIInterface{

	@Override
	public void printLogo() {
		System.out.println("******삼성AI폰******");
	}
	
	@Override
	public void recognizeSpeech() {
		System.out.println("음성인식을 잘 합니다.");
	}

	@Override
	public void systhesizeSpeech() {
		System.out.println("음성합성을 잘 합니다.");
	}

	@Override
	public void sendCall() {
		System.out.println("AI가 전화를 겁니다.");
	}

	@Override
	public void receiveCall() {
		System.out.println("AI가 전화를 받아줍니다.");
	}

	@Override
	public void sendSMS() {
		System.out.println("AI가 문자를 보내줍니다.");
		
	}

	@Override
	public void receiveSMS() {
		System.out.println("AI가 문자를 받아 읽어줍니다.");
	}
}

public class SamsungAIPhoneEx {
	public static void main(String[] args) {
		AIPhone ai = new AIPhone();
		ai.printLogo();
		ai.sendCall();
		ai.sendSMS();
		ai.receiveCall();
		ai.receiveSMS();
		ai.recognizeSpeech();
		ai.systhesizeSpeech();	
	}
}
