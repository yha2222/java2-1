package kr.or.ddit.basic;

import java.util.ArrayList;
import java.util.List;

public class Report0719 {

	public static void main(String[] args) {
		List<Student> stdList = new ArrayList<Student>();
		stdList.add(new Student(30111, "이금기", 98, 55, 41));
		stdList.add(new Student(31023, "홍길동", 24, 88, 96));
		stdList.add(new Student(20507, "이성계", 36, 22, 73));
		stdList.add(new Student(20420, "강감찬", 77, 31, 86));
		stdList.add(new Student(10705, "고길동", 99, 42, 28));
		stdList.add(new Student(11122, "이순신", 14, 66, 99));
		
		System.out.println("정렬 전: ");
		for(Student std : stdList) {
			System.out.println(std);
		}
		System.out.println("==================================");
		
		System.out.println("정렬 후: ");
		for(Student std : stdList) {
			System.out.println(std);
		}
	}

}

// List에 저장된 데이터들을 /학번의 오름차순/으로 정렬하여 출력하는 부분과
//  /총점의 역순/으로 정렬하는 부분을 프로그램 하시오.
// (총점이 같으면 학번의 내림차순으로 정렬되도록 한다.)
// (학번 정렬기준은 Student클래스 자체에서 제공하도록 하고,
// 총점 정렬기준은 외부클래스에서 제공하도록 한다.)
class Student {
	private int num;
	private String name;
	private int korScore;
	private int engScore;
	private int matScore;
	private int allScore;
	private int rank;
	
	public Student(int num, String name, int korScore, int engScore, int matScore) {
		super();
		this.num = num;
		this.name = name;
		this.korScore = korScore;
		this.engScore = engScore;
		this.matScore = matScore;
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

	public int getKorScore() {
		return korScore;
	}

	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}

	public int getEngScore() {
		return engScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}

	public int getMatScore() {
		return matScore;
	}

	public void setMatScore(int matScore) {
		this.matScore = matScore;
	}
	
	
	
}