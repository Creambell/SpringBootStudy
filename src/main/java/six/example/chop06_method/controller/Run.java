package six.example.chop06_method.controller;

import java.util.Arrays;

public class Run {
	public static void main(String[] args) {
		MethodPractice mp = new MethodPractice();
//		mp.method1();
//		mp.method2();
//		mp.method3("홍길동");
//		mp.method4("퍼펙트", 2);
//		System.out.println(mp.method4("마벨러스",2));
		
		double[] doubleArray = new double[3];
		System.out.println(Arrays.toString(doubleArray));
		System.out.println("Run doubleArray : " + doubleArray);
		int result2 = mp.method5(doubleArray);
		System.out.println(result2);
		
		
		
		
		String[] stringArray = {"chcolatto","초코레"};
		System.out.println("Run StringArray :" + stringArray);
		System.out.println("Run StringArray :" + Arrays.toString(stringArray));
//		User resultUser = mp.method6(stringArray);
//		System.out.println("Run user : " + resultUser);
		
	}
}
