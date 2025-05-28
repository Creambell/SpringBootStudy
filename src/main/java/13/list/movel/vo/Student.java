package com.kh.example.list.movel.vo;

import java.util.Objects;

public class Student implements Comparable<Student>{
	private String name;
	private int score;
	
	public Student() {}
	public Student(String name,int score) {
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return name + " " + score + "점";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		// 객체 자체 비교
		if(this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		if(getClass() != obj.getClass()) {
			return false;
		}
		// 객체 내용 비교
		Student other = (Student)obj;
		if(name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if(score != other.score) {
			return false;
		}
		return true;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name,score);
	}
	@Override
	public int compareTo(Student o) { // 이 클래스가 기준이고 매개변수가 대상
		return 0;
		// 점수 내림차순
		
		// 오름차순 로직
		// 기준 > 대상값 : 양수 기준 ==대상 0 기준 < 대상 : 음수
		
		// 기준 : score
		// 대상 : o.score
		
//		if(score > o.score) {
//			return -1; // 음수 리턴
//		}else if(score == o.score) {
//			return 1; // 같을때는 같게
//		}else {
//			return 0; // 양수 리턴
//		}
//	}
	
		
}
}
//	
//	Integer standard = score;
//	Integer object = o.score;
//	
//	return stardard.compareTo(object);
//	


