package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class StudentEx{
	private int id;
	private String name, department;
	private double grade;
	
	public StudentEx(int id, String name, String department, double grade) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.grade = grade;		
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
}

class Management{
	
	private ArrayList<StudentEx> list;
	
	public Management() {
		list = new ArrayList<StudentEx>();
	}
	
	public void add() {
		System.out.print("학번 입력> ");
		int id = EX4.sc.nextInt();
		
		System.out.print("이름 입력> ");
		String name = EX4.sc.next();
		
		System.out.print("학과 입력> ");
		String department = EX4.sc.next();
		
		System.out.print("학점 입력> ");
		double grade = EX4.sc.nextDouble();
		
		list.add(new StudentEx(id, name, department, grade));
	}
	
	public void showAllList() {
		Iterator<StudentEx> it = list.iterator();
		
		while(it.hasNext()) {
			StudentEx st = it.next();
			
			System.out.println("학번: " + st.getId());
			System.out.println("이름: " + st.getName());
			System.out.println("학과: " + st.getDepartment());
			System.out.println("학점: " + st.getGrade());
			System.out.println("********************");
		}
	}
}

public class EX4 {
	// 학생은 name, deparment, id, grade 정보를 갖고 잇스비다.
	// 학생 객체를 생성할 때 학생을 생성합니다.
	// 학생 관리 클래스에서 Scanner를 활용하여 학생 정보를 입력받은 후
	// ArrayList에 저장하고, 다시 ArrayList에서 전체 학생의 정보를 출력합니다.
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Management m = new Management();
		
		while(true) {
			System.out.println("학생을 등록합니다.");
			m.add();
			
			System.out.print("더 등록하시겠습니까?(y/n) ");
			String answer = sc.next();
			System.out.println("--------------");
			
			if(answer.equals("n")) break;
		}
		
		System.out.println("등록을 종료합니다.");
		System.out.println();
		
		System.out.println("--------------\n등록된 학생 목록\n--------------");
		m.showAllList();
	}
}
