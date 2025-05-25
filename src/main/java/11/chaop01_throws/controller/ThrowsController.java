package com.kh.example.chaop01_throws.controller;

public class ThrowsController {
	public void method1() throws Exception {
		System.out.println("method1() 호출됨...");
		method2();
		System.out.println("method1() 종료됨...");
	}
	public void method2() throws Exception {
		System.out.println("method2() 호출됨...");
		method3();
		System.out.println("method2() 종료됨...");
		
	}
	public void method3() throws Exception {
		System.out.println("method3() 호출됨...");
		throw new Exception("throws연습을 위한 예외 강제 발생");
//		System.out.println("method3() 종료됨...");
		
	}
	
	
	
}
