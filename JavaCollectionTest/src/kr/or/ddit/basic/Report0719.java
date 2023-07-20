package kr.or.ddit.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Report0719 {

	public static void main(String[] args) {
		List<Student> stdList = new ArrayList<Student>();
		stdList.add(new Student("30111", "이금기", 98, 0, 0));
		stdList.add(new Student("31023", "홍길동", 24, 0, 0));
		stdList.add(new Student("20507", "이성계", 36, 0, 0));
		stdList.add(new Student("20420", "강감찬", 0, 0, 86));
		stdList.add(new Student("10705", "고길동", 0, 42, 0));
		stdList.add(new Student("11122", "이순신", 0, 98, 0));
		
		Collections.sort(stdList);
		System.out.println("회원 번호 기준: ");
		for(Student std : stdList) {
			System.out.println(std);
		}
		System.out.println("==================================");
		
		Collections.sort(stdList, new SortSumDesc());
		
		System.out.println("총점 기준 역순: ");
		for(Student std : stdList) {
			System.out.println(std);
		}
	}

}

class Student implements Comparable<Student> {
	private String stdNo;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int sum;
	private int rank;
	
	public Student(String stdNo, String name, int kor, int eng, int mat) {
		super();
		this.stdNo = stdNo;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	public String getStdNo() {
		return stdNo;
	}

	public void setStdNo(String stdNo) {
		this.stdNo = stdNo;
	}

	public int getSum() {
		sum = kor + eng + mat;
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
		return this.getStdNo().compareTo(std.getStdNo());
	}
		
}

class SortSumDesc implements Comparator<Student>{

	@Override
	public int compare(Student mem1, Student mem2) {
		int sumCom = new Integer(mem1.getSum()).compareTo(mem2.getSum()) * -1;
		
		if(sumCom != 0) {
			return sumCom;
		} else {
			return mem1.getStdNo().compareTo(mem2.getStdNo());
		}	
		
	}
	
}