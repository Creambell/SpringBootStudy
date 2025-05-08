package three.src.com.kh.operator;

public class D_Comparison {
	public void method() {
		int a = 10;
		int b = 25;
		
		boolean result1 = (a==b);
		boolean result2 = (a<= b);
		boolean result3 = (a>b);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		System.out.println("b가 양수인가? : " +(0<b));
		//!(0<b)도 !를 통해 양수인가?를 음수인가?로 뒤집음.
		System.out.println("b가 음수인가? : " +(0>b));
		System.out.println("b가 홀수인가? : " +(b%2>=1));
		System.out.println("b가 짝수인가? : " +(b%1>=1));
		//b % 2 == 1 / b % 2 != 0
	}
}
