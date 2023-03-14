package collection;

import java.util.ArrayList;
import java.util.Scanner;

class Student{
	private String name;
	private String tel;
	private String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}

// 학생 객체 생성 클래스
class Registration{
	Student p = new Student();
	
	// 등록하기() - 입력받아서 학생객체 반환
	Student registering(){
		System.out.println("학생 정보를 등록합니다.");
		System.out.print("이름 >> ");
		p.setName(ArrayList_실습.sc.next());
		System.out.print("전화번호 >> ");
		p.setTel(ArrayList_실습.sc.next());
		System.out.print("주소 >> ");
		p.setAddress(ArrayList_실습.sc.next());
		
		return p;
	}
}

public class ArrayList_실습 {
	
	static ArrayList<Student> file = new ArrayList<Student>();
	static Scanner sc = new Scanner(System.in);
	
	// ArrayList에 학생 객체 추가하기
	public static void insert(Student st) {
		file.add(st);
	}
	
	// ArrayList에서 조회하기
	public static void read(String name) {
		for(Student f : file) {
			if(f.getName().equals(name)) {
				System.out.println("학생을 찾았습니다.");
				System.out.println(f.getName());
				System.out.println(f.getTel());
				System.out.println(f.getAddress());		
				break;
			}
		}
		System.out.println("찾는 학생이 존재하지 않습니다.");
	}
	
	public static void main(String[] args) {
		/*
		// 객체생성
		ArrayList<String> arr = new ArrayList<String>();
		
		// 요소입력
		arr.add(new String("라면"));
		arr.add("떡볶이");
		arr.add("순대");
		arr.add("햄버거");
		
		
		// 읽어오기
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		System.out.println(arr.get(2));
		
		// 크기알아보기
		System.out.println("크기: " + arr.size());
		
		// 제거
		arr.remove(0);
		System.out.println(arr.get(0));
		
		// 중간삽입
		arr.add(1, "돈까스");
		for(String a : arr)
			System.out.println(a);
		
		System.out.println("------------------------------");
		*/
		// 실습 - 객체 넣고 출력하기(전체 출력)
		//		반복문으로 Scanner로 입력받아서 학생을 등록

		System.out.println("학생 관리 프로그램을 시작합니다.");
		String answer;
		while(true) {
			System.out.println("메뉴를 선택해 주세요(1.학생등록, 2.학생검색, 3.종료)");
			
			int menu = sc.nextInt();
			switch(menu) {
			case 1:
				while(true) {
					Registration r = new Registration();
					insert(r.registering());
					
					System.out.print("더 등록하시겠습니까?(y/n) ");
					answer = sc.next();
					if(answer.equals("n")) {
						System.out.println("학생등록을 종료합니다.");
						break;
					}
				}
				break;
			case 2:
				while(true) {
					System.out.print("검색할 학생이름을 입력하세요>> ");
					String name = sc.next();
					read(name);
					
					System.out.print("학생 검색을 계속하시겠습니까?(y/n) ");
					answer = sc.next();
					if(answer.equals("n")) {
						break;
					}
				}
			}
			System.out.print("업무를 계속하시겠습니까?(y/n) ");
			answer = sc.next();
			if(answer.equals("n")) {
				sc.close();
				break;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}
}