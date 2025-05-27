package com.kh.example.chap03_assist.part02_object.model.vo;

import java.io.Serializable;

public class Member implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2689004720931047002L;
	private String userId;
	private String userPwd;
	private String userName;
	private String email;
	private int age;
	private char gender;
	private double point;
	
	public Member() {}
	public Member(String userId,String userPwd,String userName) {
		this.userId =userId;
		this.userPwd = userPwd;
		this.userName = userName;
	}
	public Member(String userId,String userPwd,String userName,String email,int age, char gender,double point) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.email = email;
		this.age = age;
		this.gender = gender;
		this.point = point;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId() {
		this.userId = userId;
	}
	public String getUsePwd() {
		return userPwd;
	}
	public void setUserPwd() {
		this.userPwd = userPwd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName() {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail() {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge() {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender() {
		this.gender = gender;
	}
	public double getPoint() {
		return point;
	}
	public void setPoint() {
		this.point = point;
	}
	@Override
	public String toString() {
		return  userId + "비밀번호 :"+userPwd+"유저 이름 :"+userName+"이메일 :"+email+"나이 : "+age+"성별 : "+gender+"포인트 : "+point;
	}
	
	
	
	
}
