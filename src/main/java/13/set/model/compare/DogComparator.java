package com.kh.example.set.model.compare;

import java.util.Comparator;

import com.kh.example.set.model.vo.Dog;

public class DogComparator implements Comparator<Dog>{ // dog의 새 기준정렬이라
									//제네릭,기준타입에 dog를 넣어줌

	@Override
	public int compare(Dog o1, Dog o2) {
		// 				기준		대상
		// 무게 내림차순, 만일 같은 무게면 이름으로 오름차순
		double stdWeight = o1.getWeight();
		double objWeight = o2.getWeight();
		if(stdWeight> objWeight) {
			return -1; // 음수
		}else if (stdWeight == objWeight){
			return o1.getName().compareTo(o2.getName()); // 무게 같으면
		}else {									// 이름으로 오름차순
			return 1; // 양수
		}
		
		
	}


}
