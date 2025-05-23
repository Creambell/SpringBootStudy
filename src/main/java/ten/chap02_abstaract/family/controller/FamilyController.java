package ten.chap02_abstaract.family.controller;

import com.kh.example.chap02_abstaract.family.model.vo.Baby;
import com.kh.example.chap02_abstaract.family.model.vo.Basic;
import com.kh.example.chap02_abstaract.family.model.vo.Family;
import com.kh.example.chap02_abstaract.family.model.vo.Mother;

public class FamilyController {
	public void method() {
		//Family : 추상 클래스
		//Basic : 인터페이스
		// 객체 생성불가능, 레퍼런스 타입 가능
		
		Mother m1 = new Mother();
		Baby b1 = new Baby();
		
		Family f = new Mother(); // 추상클래스가 레퍼런스 타입이 됌.
		Basic b = new Baby(); 
		
		
	}
	
}
