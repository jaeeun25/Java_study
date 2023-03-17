package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person2 implements Serializable{
	private static final long serialVersionUID = 8872610238867040428L;
	
	private String name;
	private int age;
	private String adrress;
	
	public Person2() {}
	public Person2(String name, int age, String adrress) {
		this.name = name;
		this.age = age;
		this.adrress = adrress;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAdrress() {
		return adrress;
	}
	public void setAdrress(String adrress) {
		this.adrress = adrress;
	}
}

class PersonArr implements Serializable{
	private static final long serialVersionUID = 6212334950094799927L;
	
	Person2[] arr;					// 다른 객체 변수를 사용하는 경우 해당 객체의 클래스도 Serializable 인터페이스를 구현해야한다.
	public PersonArr() {
		arr = new Person2[5];
	}
}

public class S3_Serialization {
	public static void main(String[] args) {
		Person2 p1 = new Person2();
		p1.setName("홍길동");
		p1.setAge(20);
		p1.setAdrress("한양시");
		
		Person2 p2 = new Person2("슈퍼맨", 40, "워싱턴");
		Person2 p3 = new Person2("베트맨", 25, "고담");
		Person2 p4 = new Person2("스파이더맨", 30, "뉴욕");
		Person2 p5 = new Person2("앤트맨", 50, "개미굴");
		
		PersonArr parr = new PersonArr();
		
		parr.arr[0] = p1;
		parr.arr[1] = p2;
		parr.arr[2] = p3;
		parr.arr[3] = p4;
		parr.arr[4] = p5;
		
		try {
			// 스트림 생성
			FileOutputStream fio = new FileOutputStream("C:\\LJE\\File\\serialization3.out", true);
			ObjectOutputStream objout = new ObjectOutputStream(fio);
			
			// 쓰기
			objout.writeObject(parr);
			
			System.out.println("정상적으로 직렬화 되었습니다.");
		} catch (IOException e) {
			System.out.println("직렬화 중 오류가 발생되었습니다.");
		}
		
	}
}
