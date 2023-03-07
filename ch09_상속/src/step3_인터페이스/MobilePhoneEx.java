package step3_인터페이스;

interface MobilePhoneInterface extends PhoneInterface{
	
	// 추가
	void sendSMS(); // public abstract 생략되어 있음
	void receiveSMS();
}

interface MP3Interface extends PhoneInterface{
	void play();
	void stop();
}

interface MusicPhoneInterface extends MobilePhoneInterface, MP3Interface{
	void playMP3RingTone();
}

class MyPhone implements MusicPhoneInterface{

	@Override
	public void sendCall() {
		System.out.println("내 폰으로 전화 걸기");
	}

	@Override
	public void receiveCall() {
		System.out.println("내 폰으로 전화 받기");
	}

	@Override
	public void sendSMS() {
		System.out.println("폰으로 문자보내기");
	}

	@Override
	public void receiveSMS() {
		System.out.println("내 폰으로 문자 받기");
	}

	@Override
	public void play() {
		System.out.println("내 폰으로 음악듣기");
		
	}

	@Override
	public void stop() {
		System.out.println("내 폰에 음악 끄기");
		
	}

	@Override
	public void playMP3RingTone() {
		System.out.println("내 폰 벨소리.. 띠띠리리링~");
	}	
}


public class MobilePhoneEx {
	public static void main(String[] args) {
		MyPhone mp = new MyPhone();
		mp.sendCall();
		mp.receiveCall();
		mp.play();
		mp.stop();
		mp.playMP3RingTone();
	}
}
