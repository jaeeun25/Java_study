package step3_인터페이스;

public interface PhoneInterface {
	public static final int TIMEOUT = 10000;
	public abstract void sendCall();
	public abstract void receiveCall();
	public default void printLogo() {
		System.out.println("******PHONE******");
		System.out.println(TIMEOUT);
	}
}