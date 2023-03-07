package step3_인터페이스;

class AISound implements MobilePhoneInterface, AIInterface, MP3Interface{

	@Override
	public void printLogo() {
		System.out.println("******AI Sound Phone******");
	}
	
	@Override
	public void sendCall() {
		System.out.println("전화를 받기 전 AI가 안내 내용을 읽어줍니다.");
		
	}

	@Override
	public void receiveCall() {
		System.out.println("전화를 걸기 전 AI가 안내 내용을 읽어줍니다.");
		
	}

	@Override
	public void recognizeSpeech() {
		System.out.println("AI가 음성인식을 합니다.");
	}

	@Override
	public void systhesizeSpeech() {
		System.out.println("음성을 인식해 AI 음성을 합성합니다.");
	}

	@Override
	public void sendSMS() {
		System.out.println("문자를 받아 AI가 내용을 읽어줍니다.");
	}

	@Override
	public void receiveSMS() {
		System.out.println("음성을 인식한 AI가 내용을 읽으면서 문자를 작성해 보냅니다.");
	}

	@Override
	public void play() {
		System.out.println("AI가 노래를 틀어줍니다.");
	}

	@Override
	public void stop() {
		System.out.println("AI가 노래를 끕니다.");
	}
	
}

public class AISoundPhone {
	public static void main(String[] args) {
		AISound as = new AISound();
		as.printLogo();
		as.sendCall();
		as.receiveCall();
		as.sendSMS();
		as.receiveSMS();
		as.recognizeSpeech();
		as.systhesizeSpeech();
		as.play();
		as.stop();
	}
}
