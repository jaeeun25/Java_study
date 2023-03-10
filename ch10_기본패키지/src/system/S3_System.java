package system;

public class S3_System {
	public static void main(String[] args) {
		System.out.println("자바버전: " + System.getProperty("java.version"));
		System.out.println("자바경로: " + System.getProperty("java.home"));
		System.out.println("시스템: " + System.getProperty("os.name"));
		System.out.println("사용자 이름:" + System.getProperty("user.name"));
		System.out.println("사용자홈디렉터리: " + System.getProperty("user.home"));
		System.out.println("사용자 작업중 디렉터리: " + System.getProperty("user.dir"));
		System.out.println("환경변수: " + System.getProperty("JAVA_HOME"));
		
		System.gc();
		System.exit(0);		// 0은 정상종료, 1은 비정상종료
	}
}
