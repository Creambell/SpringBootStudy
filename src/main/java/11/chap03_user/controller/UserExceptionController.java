package com.kh.example.chap03_user.controller;

import java.util.Scanner;

import com.kh.example.chap03_user.mode.exception.MyException;

public class UserExceptionController {
	public void inputAge() {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		try {
			checkAge(age);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void checkAge(int age) throws MyException {
		if(age < 19) {
			throw new MyException("입장 불가");
		}else {
			System.out.println("입장 가능");
		}
		
	}
	
}
