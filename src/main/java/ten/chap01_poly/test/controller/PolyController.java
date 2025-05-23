package ten.chap01_poly.test.controller;

import com.kh.example.chap01_poly.test.model.vo.Child1;
import com.kh.example.chap01_poly.test.model.vo.Child10;
import com.kh.example.chap01_poly.test.model.vo.Child2;
import com.kh.example.chap01_poly.test.model.vo.Child3;
import com.kh.example.chap01_poly.test.model.vo.Child4;
import com.kh.example.chap01_poly.test.model.vo.Child5;
import com.kh.example.chap01_poly.test.model.vo.Child6;
import com.kh.example.chap01_poly.test.model.vo.Child7;
import com.kh.example.chap01_poly.test.model.vo.Child8;
import com.kh.example.chap01_poly.test.model.vo.Child9;
import com.kh.example.chap01_poly.test.model.vo.Parent;

public class PolyController {
	public void method() {
		System.out.println("1. 부모타입 레퍼런스로 부모 객체를 다룰 때");
		Parent p1 = new Parent();
		// ㄴ 부모타입 레퍼런스  ㄴ 부모객체
		p1.printParent();
		System.out.println();
		
		System.out.println("2. 자식타입 레퍼런스로 자식 객체를 다룰 때");
		Child1 c1 = new Child1();
		//  ㄴ 자식타입 레퍼런스 ㄴ  자식객체
		c1.printChild1();
		c1.printParent();
		System.out.println();
		
		System.out.println("3. 부모타입 레퍼런스로 자식 객체를 다룰 때");
		Parent p2 = new Child2(); // 다형성 적용 : 업 캐스팅(부모타입의 변수가 자식객체를 받는 것)
		// ㄴ 부모타입 레퍼런스 ㄴ 자식객체
		p2.printParent();
		((Child2)p2).printChild2(); // 다운 캐스팅
		System.out.println();
		
		System.out.println("4. 자식타입 레퍼런스로 부모 객체를 다룰 때");
//		Child2 c2 = new Parent();
//		Child2 c2 = (child2)new Parent();
//		Child2 c2 = (Child2)p1;
		
		System.out.println();
		//다형성 간단 예제
		// 1/ 객체배열에서의 다형성
		Parent[] pArr = new Parent[4];
		pArr[0] = new Parent();
		pArr[1] = new Child1();
		pArr[2] = new Child2();
		pArr[3] = new Child1();
		
		for(int i = 0; i < pArr.length; i++) {
			if(pArr[i] instanceof Child1) {
				((Child1)pArr[i]).printChild1();
			}else if(pArr[i] instanceof Child2) {
				((Child2)pArr[i]).printChild2();
			}else if(pArr[i] instanceof Parent) {
				pArr[i].printParent();
			}
		}
		for(int i = 0; i < pArr.length;i++) {
			pArr[i].print();//메소드가 오버라이딩이 되어있기때문에 다 출력
		}
		
		
		
	}
	// 다형성 활용
	public void test(Parent p){}
//
//	
//	
//	public void test(Child1 c1) {}
//	public void test(Child2 c2) {}
//	public void test(Child3 c3) {}
//	public void test(Child4 c4) {}
//	public void test(Child5 c5) {}
//	public void test(Child6 c6) {}
//	public void test(Child7 c7) {}
//	public void test(Child8 c8) {}
//	public void test(Child9 c9) {}
//	public void test(Child10 c10) {}




}
