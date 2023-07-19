package kr.or.ddit.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class T03ListSortTest {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("일지매");
		list.add("홍길동");
		list.add("성춘향");
		list.add("변학도");
		list.add("이순신");
		
		System.out.println("정렬 전: " + list);
		
		//정렬은 Collections.sort() 메서드를 이용하여 정렬
		//    - 이름 호출 => class 메소드, 정적 메소드  /  list 타입 객체만
		//정렬은 기본적으로 '오름차순 정렬'을 수행
		Collections.sort(list);
		System.out.println("정렬 후: " + list);
		
		Collections.shuffle(list);
		System.out.println("섞기 후 : " + list);
		
		//정렬방식을 결정하는 외부정렬자를 이용하여 정렬하기
		//Desc desc = new Desc();
		Collections.sort(list, new Desc()); //내림차순 정렬을 parameter로
		System.out.println("외부정렬자 이용한 후 : " + list);
		
	}
}

//정렬 방식을 결정하는 정렬자 클래스
//내림차순
class Desc implements Comparator<String>{
/*
 * -오름차순 정렬일 경우 => 앞 값이 크면 양수, 같으면 0, 작으면 음수를 반환하도록 함
 */
	@Override
	public int compare(String str1, String str2) {
		return str1.compareTo(str2) * -1; //양수=>음수, 음수=>양수
	}
	
}
