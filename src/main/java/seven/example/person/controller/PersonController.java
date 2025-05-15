package seven.example.person.controller;

import com.kh.example.person.model.vo.Person;

public class PersonController {
	public void method() {
		Person[] pArr = new Person[5];
		System.out.println("pArr : " + pArr);
		for(int i = 0; i < pArr.length;i++) {
			System.out.println("pArr[" + i + "] : "+ pArr[i]);
		}

		//현재 각 인덱스에는 참조 자료형의 기본 값 null이 들어가있어서 nullpointException 오류 발생
		//pArr[0].personInfo();
		
		pArr[0] = new Person();
		pArr[1] = new Person("홍길동", 10);
		pArr[2] = new Person("김김김", 30, '남', 184.5,68.3);
		pArr[3] = new Person("고릴라", 30, '남', 165,99);
		pArr[4] = new Person("바나라", 320, '여', 120,32);
		
		for(int i = 0; i < pArr.length;i++) {
			System.out.println("pArr[" + i + "] : "+ pArr[i]);
			System.out.println(pArr[i].personInfo());
		}
		
		Person[] pArr2 = {new Person(),
				new Person("뵹뵹뵹",77,'여',413,15),
				new Person("아기씨",22)};
		
		for(int i = 0; i < pArr2.length;i++) {
			System.out.println("pArr2[" + i + "] : "+ pArr2[i]);
			System.out.println(pArr2[i].personInfo());
		
		
		}
		
		
	}
}
	

