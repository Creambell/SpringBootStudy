package six.example.chop06_method.controller;

import java.util.Arrays;

import com.kh.exapmle.chop05_constructor.model.User;

public class MethodPractice {
	//매개변수 x 반환 값 x
	public void method1() {
		System.out.println("매개변수와 반환값 둘다없음");
	}
	//매개변수 x 반환 값 o
	public int method2() {
//		return 0;
		int num = 10;
		return num;
	}
	//매개변수 o 반환 값 x
	public void method3(String name) {
		System.out.println(name + "님 환영합니다");
	}
	
	//매개변수 o 반환 값 o
	public char method4(String str, int index) {
		char ch = str.charAt(index);
		return ch;
	}
	// 매개변수/반환 값이 배열일때 주소값 넘어가는지 확인
	public int method5(double[] dArr) {
		System.out.println("MethodPractice dArr : " + dArr);
		//0.0 0.0. 0.0
		dArr[0] = 99.9;
		System.out.println(Arrays.toString(dArr));
		//99.9 0.0 0.0
		int sum = 0;
		for(int i = 0; i < dArr.length; i++) {
			sum += dArr[i];
		}
		
		return sum;
	}
	
	public User method6(String[] strArr) {
		System.out.println("MethodPractice strArr : " + strArr);
		
		User u = new User(strArr[0],strArr[1]);
		u.infrom();
		System.out.println("MethodPractice u : " + u);
		return null;
	}
	
}
