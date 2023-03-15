package collection;

import java.util.HashSet;
import java.util.Iterator;

class Member{
	private String name, tel;
	public Member(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	
}

class MemberHashSet{
	private HashSet<Object> hs;
	
	// 생성자
	public MemberHashSet() {
		hs = new HashSet<Object>();
	}
	
	// 회원추가
	void addMember(Member m) {
		hs.add(m);
	}
	
	// 특정 회원 삭제
	boolean removeMember(String name) {
		Iterator<Object> it = hs.iterator();
		while(it.hasNext()) {
			Member m = (Member) it.next();
			String tmpName = m.getName();
			if(name.equals(tmpName)) {
				hs.remove(m);
				return true;
			}
		}
		System.out.println(name + "가 존재하지 않습니다.");
		return false;
	}
	
	// 회원 조회
	void showAllMember() {
		for(Object m : hs) {
			Member member = (Member) m;
			System.out.println(member.getName() + " 회원님의 전화번호는 " +
								member.getTel() + "입니다.");
		}
	}
}

public class HashSet3 {
	public static void main(String[] args) {
		
		//1. MemberHashSet 객체생성
		MemberHashSet mh = new MemberHashSet();
		
		//2. Member 객체 생성 및 등록
		mh.addMember(new Member("홍길동", "010-1111-1111"));
		mh.addMember(new Member("이길동", "010-2222-2222"));
		mh.addMember(new Member("박길동", "010-3333-3333"));
		
		//3. Member 전체 조회
		mh.showAllMember();
		
		//4. Member 삭제
		mh.removeMember("박길동");

		System.out.println();
		mh.showAllMember();
	}
}
