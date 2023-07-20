package kr.or.ddit.basic;

import java.util.HashSet;
import java.util.Set;

public class Report0720 {

	public static void main(String[] args) {
		
		
		//프린트
		//변수 설정 //받은 금액 , 거스름돈, 횟수
		//if 1이면 구입 시작 화면 
		// List<List<Integer>> lottoList = getLotto(count);
		//로또 번호 보여주기
		//향상된 for문으로 로또 번호 출력
		//받은 금액, 거스름돈 출력
		//2면 감사합니다하고 종료 System.exit(0);
		//아니면 잘못된 숫자 입력
		
		
		Set<Integer> lotto = new HashSet<Integer>();
		
		while(lotto.size() < 6) {
			int num = (int)(Math.random() * 45 + 1);
			lotto.add(num);
		}
		
		System.out.println("로또번호1: " + lotto);
		System.out.println("로또번호2: " + lotto);
		
		

	}

}
