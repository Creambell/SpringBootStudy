package com.kh.example.list.movel.compare;

import java.util.Comparator;

public class ListComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return -o1.compareTo(o2);
		
		
	}
	
	
}
