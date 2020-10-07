package com.choa.point;

public class PointDTO {
	
	//멤버변수의 접근지정자는 모두 private
	//멤버변수명은 테이블의 컬럼명과 동일하게
	//멤버변수의 데이터타입은 테이블의 컬럼과 동일하게
	
	//getter , setter 생성
	
	//생성자 는 기본생성자는 꼭 필요
	
	private String name;
	private int num;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	
	

}
