package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
	직렬화와 역직렬화
		- 객체(인스턴스)가 생성된 후 객체의 변수값은 생명처럼 지속 변경된다.
		- 객체가 생성된 후 어느 순간 그대로 저장하거나 네트워크를 통해 어느 시점의
		    데이터를 전송하는 것..을 직렬화라 한다.
		- 자바 내부 시스템에서 사용되는 객체 또는 데이터를 외부 자바시스템에서도
		    활용할 수 있도록 byte 형태로 데이터 변환하는 기술(직렬화)과 바이트로 된 데이터를
		    다시 객체로 변환하는 기술(역직렬화)을 아우러서 직렬화로 한다.
		 > JVM 속의 힙메모리 영역의 객체 데이터를 바이트 형태로 변환해서 전송/받게한다.
*/

class Person implements Serializable{	// 직렬화 시키고 싶은 클래스 implements Serializable
	private static final long serialVersionUID = -3355861263530529666L;		// 직렬화 버전의 고유값. 클래스 버전이 맞는지 확인하기 위한 용도
	
	String name;
	String job;
	
	public Person() {}
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
		
	public String toString() {
		return name + "," + job;
	}
}

public class S1_Serialization{
	public static void main(String[] args) throws ClassNotFoundException  {
			
		Person park = new Person("박길동", "대표이사");
		Person kim = new Person("김길동", "상무이사");
		
		try {
			//1. 스트림
			FileOutputStream fos = new FileOutputStream("C:\\LJE\\File\\serialization1.out");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
					
			//2. 객체를 스트림에 써준다
			oos.writeObject(park);
			oos.writeObject(kim);
			
			//3. 닫아준다.
			oos.close();
			fos.close();
			
			System.out.println("Person 객체를 바이트로 파일에 저장했습니다.");
			
		} catch(IOException e) {
			
		}		
		
		//*******************************************8
		try {
			FileInputStream fis = new FileInputStream("C:\\LJE\\File\\serialization1.out");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Person p1 = (Person) ois.readObject();		// Object이니까 Person으로 다운 캐스팅
			Person p2 = (Person) ois.readObject();	
			
			System.out.println(p1.name);
			System.out.println(p1.job);
			System.out.println(p2.name);
			System.out.println(p1.job);
			System.out.println("****************************");
			System.out.println(p1.toString());
			System.out.println(p2.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
