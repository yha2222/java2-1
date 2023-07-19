package kr.or.ddit.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//학번, 이름, 국어점수, 영어점수, 수학점수, 총점, 등수를 멤버로 갖는
//Student클래스를 만든다.
//생성자는 학번, 이름, 국어, 영어, 수학 점수만 매개변수로 받아서 처리한다.
//이 Student객체들은 List에 저장하여 관리한다.

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
		
		Collections.sort(stdList);
		
		System.out.println("정렬 후: ");
		for(Student std : stdList) {
			System.out.println(std);
		}
	}

}

//  /총점의 역순/으로 정렬하는 부분을 프로그램 하시오.
// (총점로이 같으면 학번의 내림차순으 정렬되도록 한다.)

// 총점 정렬기준은 외부클래스에서 제공하도록 한다.)
class Student implements Comparable<Student> {
	private int stdNo;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int sum;
	private int rank;
	
	public Student(int stdNo, String name, int kor, int eng, int mat) {
		super();
		this.stdNo = stdNo;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	public int getStdNo() {
		return stdNo;
	}

	public void setStdNo(int stdNo) {
		this.stdNo = stdNo;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}


	@Override
	public String toString() {
		return "Student [stdNo=" + stdNo + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + "]";
	}

	@Override
	public int compareTo(Student std) {
		//return this.getStdNo().compareTo(std.getStdNo());
		return this.getStdNo() - std.getStdNo();
	}
		
}

class SortSumDesc implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getSum() - o2.getSum();
	}
	
}