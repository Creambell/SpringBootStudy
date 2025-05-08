package three.src.com.kh.operator;

public class A_LogicalNegation {
	//boolean논리 부정 연산자 : !
	public void method() {
		boolean bool1 = false;
		boolean bool2 = true;
		
		System.out.println("bool1 : "+ bool1); //false
		System.out.println("bool2 : "+ bool2); //true
		System.out.println("!bool1 : " + !bool1);
		System.out.println("!bool2 : "+ !bool2);
		System.out.println("!!bool1 : "+ !!bool1);
		System.out.println("!!bool2 : "+ !!bool2);
				
		System.out.println(!false);
		System.out.println(!true);
		
//boolean논리연산자의 부정인 !를 넣어 false true를 구분했다.
//!false = true || not연산자 느낌 !!가 두개니 다시 false가 됌
		
	}
	
	
}
