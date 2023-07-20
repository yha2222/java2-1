package kr.or.ddit.basic;

import java.util.HashSet;
import java.util.Set;

public class T07EqualsHashCodeTest {
/*
      해시함수(Hash Function)는 임의의 길이의 데이터를 고정된 길이의 데이터로 매핑하는 함수
      해시함수에 의해 얻어지는 값은 해시 값, 해시 코드 또는 간단히 해시라고도 한다
      HashSet, HashMap, Hashtable과 같은 객체들을 사용할 경우, 
      객체가 서로 같은지를 비교하기 위헤 equals()메서드와 hashCode()메서드를 호출함
      그래서 객체가 서로 같은지 여부를 결정하려면 두 메서드를 재정의 해야 함
      HashSet, HashMap, Hashtable에서 객체가 같은지 여부는 데이터를 추가할 때 검사함
      
      - equals() : 두 객체의 내용(값)이 같은지 비교하는 메서드
      - hashCode()는 객체에 대한 해시코드값을 반환하는 메서드
      
      - equals()와 hashCode()메서드에 관한 규칙(Convention)
      1. 두 객체가 같으면 반드시 같은 해시코드를 가져야 한다.
      2. 두 객체가 같으면 equals()메서드를 호출했을 때 true를 반환해야 한다.
      	즉, 객체 a, b가 같다면 a.equals(b)와 b.equals(a) 둘 다 true이어야 한다.
      3. 두 객체의 해시코드가 같다고 해서 두 객체가 반드시 같은 객체는 아니다.
      	하지만 두 객체가 같으면 반드시 해시코드가 같아야 한다.
      4. hashCode()는 기본적으로 힙메모리에 있는 객체에 대한 메모리 주소 매핑정보를 기반으로 하는 정수값을 반환한다.
       	그러므로 클래스에서 hashCode()를 override하지 않으면 절대로 두 객체가 같은 것으로 간주될 수 없다.
      5. equals()메서드를 override하는 경우에 hashCode()도 override 해야한다.
      
      - hashCode()에서 사용하는 '해싱 알고리즘'에서 서로 다른 객체에 대하여 같은 해시코드값을 생성할 수 았다.
      	그래서 객체가 같지 않더라도 해시코드값이 같을 수 있다.
 */
	public static void main(String[] args) {

		Person p1 = new Person(1, "홍길동");
		Person p2 = new Person(1, "홍길동");
		Person p3 = new Person(1, "이순신");
		
		System.out.println("p1.equals(p2): " + p1.equals(p2));
		System.out.println("p1 == p2: " + (p1 == p2));
		
		//같은 해시코드여도 다른 값인 거 확인
		System.out.println(p1.hashCode() + " : " + p2.hashCode());
		//equals는 같다고 나오지만 값 다르게 나옴 => override 해줘야 됨
		System.out.println(new String("홍길동").hashCode()); //다른 메모리인데 같은 해시코드 <= override
		System.out.println(new String("홍길동").hashCode());
		
		//충돌 확인
		//System.out.println("Aa".hashCode());
		//System.out.println("Bb".hashCode());
		
		Set<Person> pSet = new HashSet<Person>();
		System.out.println("pSet.add(p1) 성공여부 : " + pSet.add(p1));
		System.out.println("pSet.add(p2) 성공여부 : " + pSet.add(p2)); //중복 안들어가야 되는데 들어감 <= hashCode() ==> hashCode override 해줘야 됨
		
		System.out.println("p1, p2 등록 후 데이터: ");
		for(Person p : pSet) {
			System.out.println(p.getId() + " : " + p.getName());
		}
		
		System.out.println("pSet.add(p3) 성공여부 : " + pSet.add(p3));
		System.out.println("p3 등록 후 데이터: ");
		for(Person p : pSet) {
			System.out.println(p.getId() + " : " + p.getName());
		}
	}

}

class Person {
	private int id;
	private String name;
	
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
/*	
	@Override
		public boolean equals(Object obj) {

			Person p = (Person) obj;
			
		
			return this.getId() == p.getId()
					&& this.getName().equals(p.getName());
		}
	
	@Override
	public int hashCode() {
		return (name + id).hashCode();
	}
*/	
}