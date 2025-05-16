package eight.example.test.controller;

import com.kh.example.test.model.vo.Child1;
import com.kh.example.test.model.vo.Child2;
import com.kh.example.test.model.vo.Parent;

public class InheritanceTest {
	public void method() {
		System.out.println("Parent클래스의 num필드 접근");
		Parent p = new Parent();
		p.setNum(9);
		System.out.println("Parent 안에 있는 num : " + p.getNum());
		
		System.out.println("Child클래스의 str 필드 접근 ");
		Child1 c1 = new Child1();
		c1.setStr("안녕");
		System.out.println("Child1 안에 있는 str : " + c1.getStr());
		
		
		System.out.println("Child2클래스의 str필드 접근");
		Child2 c2 = new Child2();
		c2.setStr("세계");
		System.out.println("Child2 안에 있는 str : "+ c2.getStr());
		
		System.out.println("Child2클래스의 num의 값은");
		c2.setNum(99);
		System.out.println("Child2 안에 있는 num : "+c2.getNum());
		
	}
}
