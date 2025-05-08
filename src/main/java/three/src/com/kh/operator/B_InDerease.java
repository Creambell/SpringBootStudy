package three.src.com.kh.operator;

public class B_InDerease {

	public void method1() {
		//전 후위 증감 연산자 테스
		int num1 = 10;
		System.out.println(num1);
		System.out.println(++num1);
		System.out.println(++num1);
		System.out.println(++num1);
		System.out.println(++num1);
		
		int num2 = 10;
		System.out.println(num2);
		System.out.println(num2++);
		System.out.println(num2++);
		System.out.println(num2++);
		System.out.println(num2);
	}
	
	public void method2() {
		int num1 = 30;
		int result1 = num1++ * 3;
		System.out.println("num1 : "+num1);
		System.out.println("result1 : "+result1);
		
		int num2 = 30;
		int result2 = num1++ * 3;
		System.out.println("num1 : "+num1);
		System.out.println("result2 : "+result2);
	}
	public void method3() {
		int a = 10;
		int b= 20;
		int c= 30;
		
		System.out.println(a++);
		
		System.out.println((++a) + b++);
		
		System.out.println((a++)+  (--b) + (+c));
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		
		
	}
}