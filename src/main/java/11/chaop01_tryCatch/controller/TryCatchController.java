package com.kh.example.chaop01_tryCatch.controller;

import java.io.IOException;

public class TryCatchController {
	public void method1() {
		System.out.println("method1() 호출됨....");
		try {
			method2();
		} catch (IOException e) { //IO~ e = new IO~
//			e.printStackTrace("그래도 출력");
			System.out.println(e.getMessage());
		} catch(Exception e) { // EX가 먼저 올라가면 오류남 IO보다 상위객체라서 04-09
			System.out.println("Exception으로 잡음");
		}finally {
			System.out.println("무조건 실행");
		}
		System.out.println("method1() 종료됨....");
		
		
	}
	public void method2() throws IOException {
		System.out.println("method2() 호출됨....");
		throw new IOException("강제 예외 발생상황");
//		System.out.println("method2() 종료됨....");

		
	}
	
}
