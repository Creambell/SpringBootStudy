package com.kh.example.map.model.compare;

import java.util.Comparator;

public class MapComparator implements Comparator<String>{
	
	
	//문자열 내림차순
	@Override
	public int compare(String o1, String o2) {
		return -o1.compareTo(o2);
		
		
		
	}
	
	
		
}
