package kr.or.ddit.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class T04ListSortTest {

	public static void main(String[] args) {
		
		List<Member> memList = new ArrayList<Member>();
		memList.add(new Member(1, "홍길동", "010-1111-1111"));
		memList.add(new Member(5, "변학도", "010-6666-1111"));
		memList.add(new Member(9, "성춘향", "010-5555-1111"));
		memList.add(new Member(3, "이순신", "010-4444-1111"));
		memList.add(new Member(6, "강감찬", "010-3333-1111"));
		memList.add(new Member(2, "일지매", "010-2222-1111"));
		
		System.out.println("정렬 전: ");
		for(Member mem : memList) {
			System.out.println(mem);
		}
		System.out.println("==================================");
		
		Collections.sort(memList); //이름 기준 오름차순 정렬 시키기
		
		System.out.println("정렬 후: ");
		for(Member mem : memList) {
			System.out.println(mem);
		}
	}

}

//회원 이름 기준 오름차순 정렬되도록 할 수 있는 클래스
class Member implements Comparable<Member> {
	private int num; 		//번호
	private String name;	//이름
	private String tel; 	//전화번호
	
	public Member(int num, String name, String tel) {
		super();
		this.num = num;
		this.name = name;
		this.tel = tel;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

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

	@Override
	public String toString() {
		return "Member [num=" + num + ", name=" + name + ", tel=" + tel + "]";
	}

	//정렬용 - 원래 나랑 비교해서 내가 더 크면 양수, 아니면 음수
	@Override
	public int compareTo(Member mem) {
		return this.getName().compareTo(mem.getName());  //this.getName()=>내 이름
	}	
}

//회원 번호 이용한 내림차순 정렬 위한 외부 정렬자
//외부정렬자 - 번호 이용해서 정렬 기능
class SortNumDesc implements Comparator<Member>{

	@Override
	public int compare(Member o1, Member o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}