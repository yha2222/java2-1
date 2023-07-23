package kr.or.ddit.basic;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Report0720 {
	public static void main(String[] args) {
		new Report0720().lottoStart();
	}

	private Scanner scan;
	int money;
	int cnt;
	int change;
	
	public void menu(){
		System.out.println();
		System.out.println("=================================");
		System.out.println("        Lotto 프로그램");
		System.out.println("---------------------------------");
		System.out.println("        1. Lotto 구입");
		System.out.println("        2. 프로그램 종료");
		System.out.println("=================================");
		System.out.println("메뉴선택 : ");
	}
	
	public void lottoStart() {
		scan = new Scanner(System.in);
		
		while(true) {
			menu();
			
			int menuNum = scan.nextInt();
			
			switch(menuNum) {
			case 1: purch();
				break;
			case 2 : 
				System.out.println("감사합니다");
				break;
			default : 
				System.out.println("잘못된 입력!");
			}
		}
	}
	
	private void purch() {
		scan = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Lotto 구입 시작");
		System.out.println("(1000원에 로또번호 하나입니다.)");
		System.out.println("금액 입력 : ");
		
		money = scan.nextInt();
		change = money % 1000;
		
		System.out.println("행운의 로또번호는 아래와 같습니다.");
		printLotto();
		System.out.println("받은 금액은 "+money+"원이고 거스름돈은 "+change+"원입니다.");
		
	}
	
	private void printLotto() {
		cnt = money / 1000;
		
		for(int i = 0; i < cnt; i++) {
			Set<Integer> lotto = new HashSet<Integer>();
			
			while(lotto.size() < 6) {
				int num = (int)(Math.random() * 45 + 1);
				lotto.add(num);
			}
			
		 System.out.println("로또번호" + (i+1) +": " + lotto);
		}
	}

	

}
