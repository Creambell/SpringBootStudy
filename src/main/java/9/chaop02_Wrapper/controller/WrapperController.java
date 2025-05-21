package com.kh.example.chaop02_Wrapper.controller;

public class WrapperController {
	public void method() {
		// boxing : 기본 자료형을 객체로 변환
		// unboxing : 객체를 기본 자료형으로 변환
		int num1 = 10;
		Integer integer1 = new Integer(num1); // boxing
		int num2 = integer1.intValue(); // unboxing
		
		
		//JDK
		Integer integer2 = num1; // auto boxing
		int num3 = integer2;	//auto unboxing
	}
}
