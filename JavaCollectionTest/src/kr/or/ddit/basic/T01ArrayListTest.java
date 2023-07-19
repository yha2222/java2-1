package kr.or.ddit.basic;

import java.util.ArrayList;
import java.util.List;

public class T01ArrayListTest {
	public static void main(String[] args) {
		
		//Default Capacity = 10
		List list1 = new ArrayList();
		
		//add()메서드를 이용하여 데이터를 추가
		list1.add("aaa");
		list1.add("bbb");
		list1.add(111);
		list1.add('k');
		list1.add(true);
		list1.add(12.34); //double(8), float(4) 하고 싶으면 f
		
		//size() => 데이터의 개수
		System.out.println("size =>" + list1.size());
		System.out.println("list1 => " + list1);
		
		//get()으로 데이터 꺼내기
		System.out.println("1번째 자료: " + list1.get(0)); //첫번째 꺼내기
		
		//데이터 끼워넣기도 동일
		list1.add(0,"zzz");
		System.out.println("list1 => " + list1);
		
		//데이터 변경하기
		String temp = (String)list1.set(0,  "YYY");
		System.out.println("temp: " + temp); //이전값 리턴하고 값 변경
		System.out.println("list1 => " + list1);
		
		//데이터 삭제하기
		list1.remove(0); //첫번째 지움
		System.out.println("삭제 후: " + list1);
		
		list1.remove("bbb"); //데이터 알고 인덱스는 몰를 때
		System.out.println("bbb 삭제 후: " + list1);
		System.out.println("================================");
		
		//111 지우기
		//list1.remove(1); 인덱스
		list1.remove(new Integer(111)); //Object - 기본 타입도 객체화 됨(Wrapper?)
		System.out.println("111 삭제 후: " + list1);
		System.out.println("================================");
		
		//제너릭을 지정하여 인터페이스 선언할 수 있다
		List<String> list2 = new ArrayList<String>();
		list2.add("AAA");
		list2.add("BBB");
		list2.add("CCC");
		list2.add("DDD");
		list2.add("EEE");
		
		for(String str : list2) {
			System.out.println(str);
		}
		System.out.println("--------------------------");
		
		//contains(비교객체) => 리스트에 '비교객체'가 있으면 true 아니면 false
		System.out.println(list2.contains("DDD"));
		System.out.println(list2.contains("ZZZ"));
		
		//indexOf(비교객체) => 리스트에서 '비교객체'를 찾아 '비교객체'기 있는 index값 반환, 없으면 '-1'
		System.out.println("DDD의 index값: " + list2.indexOf("DDD"));
		System.out.println("ZZZ의 index값: " + list2.indexOf("ZZZ"));
		System.out.println("-----------------------------------------");
		
		//리스트 삭제 처리에 대해
		//ArrayList 지우고 배열 정리 => 빈칸 채우느라 안지워진 거 2개
//		for(int i = 0; i < list2.size(); i++) {
//			list2.remove(i);
//		}
		System.out.println("삭제 전 리스트2의 크기 : " + list2.size());
		//리스트 삭제 제대로 => 뒤에서부터 지워야 깔끔
		for(int i = list2.size()-1; i >= 0; i--) {
			list2.remove(i);
		}
		System.out.println("삭제 후 리스트2의 크기 : " + list2.size());
		
	}
}
