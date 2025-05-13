package six.example.chap04_field.controller;

public class KindsOfVariable1 { // 클래스 영역의 시작
	//클래스 영역에 작성된 변수 : 필드 == 멤버변수 == 전역변수 == 멤버필드
	
	private int globalNum; // 필드는 캡슐화가 원칙 별다른설계가 없다면.
	
	public void method1(int num) { // 매개변수) { // 메소드 영역의 시작
		// 메소드 영역에서 작성된 변수 : 지역변수 local variable
		// 지역변수는 선언 외에 다시 사용치 위해서는 반드시 초기화를 해야함
		// 매개변수도 일종의 지역변수
		
		
		int localNum;
		
		System.out.println(globalNum); // 기본값 들어감
		//전역 변수는 클래스 전역에서 사용 가능
		
	} // 메소드 영역의 끝
	
	public void method2() {
//		localNum=0; / num 은 지역변수라 불가능하지만
		globalNum = 10; // 은 필드/멤버 전역 변수라 사용가능
	}
	
} // 클래스 영역의 끝
