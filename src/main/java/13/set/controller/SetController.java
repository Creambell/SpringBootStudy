package com.kh.example.set.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

import com.kh.example.set.model.compare.DogComparator;
import com.kh.example.set.model.compare.SetComparator;
import com.kh.example.set.model.vo.Dog;

public class SetController {
	public void doSet() {
		HashSet<String> set = new HashSet<String>(); // 타입 추론
		set.add("해피");
		set.add("뭉치");
		set.add("나나");
		System.out.println("set : "+set);
		
		set.add("뭉치");
		System.out.println("set : "+set);
		
		HashSet<Dog> dogSet = new HashSet<Dog>();
		dogSet.add(new Dog("해피",6.0));
		dogSet.add(new Dog("뭉치",3.4));
		dogSet.add(new Dog("나나",8.2));
		System.out.println(dogSet);
		
		dogSet.add(new Dog("뭉치",3.4));
		System.out.println(dogSet + "");
		
		// LinkedHashSet : 순서가 유지되는 Set
		Set<String> set2 = new LinkedHashSet<String>();
		set2.add("초코");
		set2.add("바나나");
		set2.add("두부");
		set2.add("초코");
		System.out.println("set2 : " + set2);  // 중복저장은 x 순서유지 o
		
		set2.add("로이");
		set2.add("로사");
		set2.add("나옹이");
		set2.add("조이");
		System.out.println("set2 : " + set2);
		
		// TreeSet : 자동 정렬해주는 Set
		TreeSet<String> set3 = new TreeSet<String>(set2);
		System.out.println("set3 : " + set3);
		
		Set<Dog> dogSet2 = new TreeSet<Dog>(dogSet);
		System.out.println(dogSet2);
		
		TreeSet<String> set4 = new TreeSet<String>(new SetComparator());
		set4.addAll(set2);
		System.out.println(set4);
		
		//DogComparartpr 무게맞춰서 차순
		TreeSet<Dog> dogSet3 = new TreeSet<Dog>(new DogComparator());
		dogSet3.addAll(dogSet2);
		dogSet3.add(new Dog("초롱",3.4));
		System.out.println(dogSet3);
		
		// 1 . list화 하기
//		
//		List<String> list = new ArrayList<String>(set4);
//		for(int i = 0; i < list.size();i++) {
//			System.out.println(list.get(i));
//		}
//		
		// Set 안의 elements 차례대로 뽑기
		System.out.println("1. set의 데이터를 리스트로 옮기기");
		List<String> list = new ArrayList<String>(set4);
		for(int i = 0; i < list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		
		System.out.println("2. Iterator 이용하기"); // 단방향
		Iterator<String> it = set4.iterator();
		while(it.hasNext()) { // 다음 값이 있는지 함수
			String next = it.next();  //다음 값 가져다줌
			System.out.println(next);
			
		}
		
		while(it.hasNext()) {
			System.out.println("Re : " + it.next());
			
		}
		System.out.println("3. List이터럴 이용하기");
		ListIterator<String> lit = list.listIterator();
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		System.out.println();
		while(lit.hasPrevious()) { // 이전 값이 있는지
			System.out.println(lit.previous());
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
