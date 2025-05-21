package com.kh.example.chop01_String.run;

import com.kh.example.chaop02_Wrapper.controller.WrapperController;
import com.kh.example.chop01_String.controller.StringController;

public class Run {

	public static void main(String[] args) {
		StringController sc = new StringController();
//		sc.method1();
//		sc.method2();
//		sc.method3();
		
		WrapperController wr = new WrapperController();
		new WrapperController().method();
		
		
	}

}
