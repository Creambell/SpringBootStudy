package com.kh.example.list.contooler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.example.list.movel.compare.ListComparator;
import com.kh.example.list.movel.vo.Student;

public class ListController {
	public void doList() {
		List l = new ArrayList();

		
		ArrayList<String> list = new ArrayList<String>(3);
		list.add(new String("테스트"));
		list.add("도대담");
		list.add("남나눔");
		System.out.println("list : " + list);
		
		list.add("하현호");
		System.out.println("list : " + list);
		
		list.add("문미미");
		System.out.println("현재 list에 담긴 엘리먼트 개수 = " + list.size());
//		.l.add(ledngth가 아니라 litl)
		
		// add(int index, E ) 두개의 메소드 오버로딩
		list.add(0,"유라라");
		System.out.println("list : " + list);
		list.add(3,"강건마");
		System.out.println("list : " + list);
		
		// remove(int index) :E
		// remove(Object o):boolean 오버로딩 되있음
		String pop = list.remove(1);
		System.out.println(pop);
		System.out.println("list : " + list);
		
		boolean remove1 = list.remove("강건마");
		System.out.println(remove1);
		System.out.println("list : " + list);
		
		boolean remove2 = list.remove("강건마");
		System.out.println(remove2);
		System.out.println("list : " + list);
	
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("박보배",100));
		studentList.add(new Student("김덕배",70));
		studentList.add(new Student("강건마",40));
		System.out.println(studentList);
		
		studentList.remove(new Student("박보배",100));
		System.out.println(studentList);
		
		
		// 1. Collections 클래스 이용
		Collections.sort(list); 
		System.out.println("list : " + list ); //오른 차순 정렬
		
		// 2. List.sort()메소드 이용해서 정렬
		//sort안에 Comparator가 들어가있음
		list.sort(new ListComparator());
		System.out.println("확인 list : "+ list );
		
		Collections.sort(studentList);
		System.out.println(studentList);
		
		// set(int index, E e):E
		list.set(3, "빅브라더"); // set 은 인덱스 번호에 내가 쓴걸로 대체,교체함
		System.out.println("list : " + list);
		
		// get(int index):E
		String s = list.get(3); // get 은 가져옴
		System.out.println(s);
		
		// subList(int index1, int index2):List<E>
		List<String> subList = list.subList(2, 5); // 부분 소환
		System.out.println(subList);
		
		System.out.println(list.contains("남나눔")); // 있는지 확인
		System.out.println(list.contains("고구마"));
		System.out.println(list.indexOf("빅브라더")); // 위치 확인 
		// 없는 위치는 -1로 표기해줌
		
		// clear():void
		// isEmpty():boolean
		System.out.println("list : "+list);
		System.out.println("list가 비었나요? " + list.isEmpty());
		list.clear();
		System.out.println("list : "+list);
		System.out.println("list가 비었나요? " + list.isEmpty());
	}
}
