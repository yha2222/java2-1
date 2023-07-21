package kr.or.ddit.basic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class T05HashSetTest {

	public static void main(String[] args) {
		Set hs1 = new HashSet();
		
		//Set에 데이터를 추가할 때도 add()를 사용
		hs1.add("DD");
		hs1.add("AA");
		hs1.add(2);
		hs1.add("CC");
		hs1.add(1);
		hs1.add(3);
		
		System.out.println("Set 데이터: " + hs1);
		System.out.println();
		
		//Set은 데이터의 중복을 허용하지 않음 => 이미 존재하는 데이터를 추가하면 false 반환, 데이터는 추가  안함
		boolean isAdded = hs1.add("FF");
		System.out.println("중복되지 않을 때 : " + isAdded);
		System.out.println("Set 데이터 : " + hs1);
		System.out.println();
		
		isAdded = hs1.add("CC");
		System.out.println("중복될 때 : " + isAdded);
		System.out.println("Set 데이터 : " + hs1);
		System.out.println();
		
		//Set 데이터를 수정하려면 수정하는 명령이 따로 없기 때문에 해당 데이터 삭제 후 새 데이터 추가해야 함
		//삭제 메서드
		// 1) clear() => 전체 데이터 삭제
		// 2) remove(삭제할 데이터) => 해당 데이터 삭제
		// 예) 'FF'를 'EE'로 수정하기
		hs1.remove("FF");
		System.out.println("삭제 후 데이터 : " + hs1);
		System.out.println();
		
		hs1.add("EE");
		System.out.println("Set 데이터: " + hs1);
		System.out.println();
		
		System.out.println("데이터 수정 후 크기: " + hs1.size());
		System.out.println();
		
		//hs1.clear();   //전체자료 삭제
		//System.out.println("clear() 후 데이터 크기 : " + hs1.size());
		
		// Set은 데이터 인덱스 개념이 존재하지 않기 때문에 데이터를 하나씩 가져오기 위해서 Iterator 객체를 이용
		Iterator it = hs1.iterator();
		
		//데이터 개수만큼 반복하기
		//Iterator 타입 객체 -> hasNext(), next() ...
		//hasNext() 메서드 => 포인터 다음 위치에 데이터가 있으면 true, 없으면 false를 반환
		while(it.hasNext()) {    //다음 데이터 있는지 검사
			// next() 메서드 => 다음 위치의 데이터를 반환
			System.out.println(it.next());
		}
		//fhEh..
		//1~100 사이의 중복되지 않는 정수 5개 만들기
		Set<Integer> intRnd = new HashSet<Integer>();
		
		while(intRnd.size() < 5) {
			int num = (int)(Math.random() * 100 + 1);
			intRnd.add(num);
		}
		
		System.out.println("만들어진 난수들: " + intRnd);
		
		//Collection 유형의 객체들은 서로 다른 자료 구조로 쉽게 변경해서 사용 가능-호환 가능
		// 다른 종류의 객체를 생성할 때 생성자에 변경할 객체를 넣어주면 됨
		//Set => List 
		List<Integer> intRndList = new ArrayList<Integer>(intRnd);
		System.out.println("List의 자료 출력...");
		
		for(Integer num : intRndList) {
			System.out.print(num + " ");
		}
	}

}
