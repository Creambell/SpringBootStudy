package com.kh.example.set.model.compare;

import java.util.Comparator;

public class SetComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// 문자열 내림차순
		return o2.compareTo(o1); // 내림차순 o1과 o2를 바꾸면 o1 에 - 장착바람
	}

}
