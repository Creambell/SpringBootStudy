package com.kh.example.map.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

import com.kh.example.map.model.compare.MapComparator;
import com.kh.example.map.model.vo.Snack;

public class MapController {
	public void doMap() {
		Map<String,Snack> map = new HashMap<>();
		
		
		//put(k key, V value):V 메소드의 구성을 보여주고 :V는 반환타입
		Snack s1 = map.put("새우깡", new Snack("짠맛",1500));
		System.out.println(s1);
		map.put("다이제",new Snack("단맛",2500));
		map.put("뉴스낵",new Snack("짠맛",1500));
		map.put("고소미",new Snack("고소한맛",1000));
		System.out.println(map);
		
		Snack s2 = map.put("새우깡",new Snack("매운맛",1500));
		System.out.println(s2); // 짠맛 1500원
		System.out.println(map);
		
		// containKey(Object key):boolean
		// containValue(Object value):boolean
		System.out.println(map.containsKey("새우깡")); // 트루
		System.out.println(map.containsKey("홈런볼")); // 펄스
		System.out.println(map.containsValue(new Snack("짠맛",1500))); //펄스 
		
		// get(Object key)
		System.out.println(map.get("새우깡"));
		System.out.println(map.get("홈런볼"));
		
		// map엘리먼트 접근하기
		
		// 1. values():Collection<V>
		System.out.println(map.values()); // 밸류값만 쭉 보여줌
		
		// 2. keySet():Set<K> 맵안에 키들만 모아서 셋에 담아주는것.
		Set<String> set1 = map.keySet(); // set1에는 맵안에 키들만 담겨져있다.
		System.out.println(set1); // key들을 담아서 보여줌
		
		Iterator<String> it1 =  set1.iterator();// 셋에서 맵에 접하는게 이터레이터
		//set안에 map안에 있는 key를 넣음 String타입의
		while(it1.hasNext()) { // 이터럴을 써줘서 와일을 사용가능 다음값있는지 물어보는함수
			String key1 = it1.next(); //next로 가져옴 key를 가져옴 
			Snack snack = map.get(key1); // get으로 key1의 밸류값까지 가져올수있다.
			System.out.println(key1 + " = " + snack);	
		}
		System.out.println();
		
		// 3. entrySet():Set<Map.Entry<K,V>> 엔트리는 키와 값의 쌍
		Set<Entry<String,Snack>> set2 = map.entrySet();
		// 셋에서 엔트리 = 키와 값 STring과 Snack을 넣어줌.
		Iterator<Entry<String,Snack>> it2 = set2.iterator();
		while(it2.hasNext()) {
			Entry<String,Snack> entry1 = it2.next();
			String key = entry1.getKey();
			Snack value = entry1.getValue();
			System.out.println(key + " = " + value);
		}
		
		System.out.println();
		
		Map<String,Snack> map2 = new TreeMap<>(map); // 정렬은 키로 기준으로
		System.out.println(map2); // 스트링의 자체적정렬로 되고있음
								// comparator 과 다르게 오류가 안남
		TreeMap<String, Snack> map3 = new TreeMap<>(new MapComparator());
		map3.putAll(map);
		System.out.println(map3);
		
		
		// size():int
		System.out.println(map3.size());
		
		// remove(Object key):V
		System.out.println(map3.remove("뉴스낵"));
		System.out.println(map3);
		
		//remove(Object key, Object value):boolean
		System.out.println(map3.remove("고소미",new Snack("고소한맛" , 1000)));
		System.out.println(map3); // Snack에 오버라이딩되있어서 삭제가능
		
		// clear():void
		// isEmpty():boolean
		System.out.println(map3.isEmpty());
		map3.clear();  // 내부 클리어
		System.out.println(map3);
		System.out.println(map3.isEmpty());
		
		
		
		
	}
	
	public void doProperties() {
		Properties prop = new Properties();
//		prop.put("뭐지", "이상하다");
//		prop.put(10, 20);
//		System.out.println(prop);
		
		// setProperty(String key,String value):object
		System.out.println(prop.setProperty("채소", "오이")); // 키가 중복되면 값이 덮어짐);
		prop.setProperty("과일", "사과");
		prop.setProperty("간식", "젤리");
		System.out.println(prop);
		
		System.out.println(prop.setProperty("채소", "피망"));
		System.out.println(prop);
		
		System.out.println();
		
		// getProperty(String key):String
		// getProperty(String key, String defaultValue):String
		System.out.println(prop.getProperty("채소"));
		System.out.println(prop.getProperty("견과"));
		System.out.println(prop.getProperty("채소", "땅콩")); // null값 반환 x
		System.out.println(prop.getProperty("견과", "땅콩")); // 그래서 피망과 땅콩이 뜸
		
		
		
		
		
	}
	
	public void fileSave() {
		try(FileOutputStream fos = new FileOutputStream("test.properties");) {
		
			Properties prop = new Properties();
			prop.setProperty("title", "Properties Practice");
			prop.setProperty("width", "100");
			prop.setProperty("heigth", "200");
			prop.setProperty("language", "kor");
			
			// store(OutputStream out, String comments):void
			// store(Writer writer, String comments):void
			prop.store(fos, "Properties Text file");
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}
	public void fileSave2() {
		try(FileOutputStream fos = new FileOutputStream("test.xml");) {
		
			Properties prop = new Properties();
			prop.setProperty("title", "Properties Practice");
			prop.setProperty("width", "100");
			prop.setProperty("heigth", "200");
			prop.setProperty("language", "kor");
			
			// storeToXML(OutputStream out, String comments):void
			prop.storeToXML(fos, "Properties(XML) Text file");
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}
	
	public void fileOpen() {
		try(FileInputStream fis = new FileInputStream("test.properties")){
			Properties prop = new Properties();
			System.out.println(prop);
			
			// load(InputStream inStream):void
			//load(Reader reader):void
			prop.load(fis);
			System.out.println(prop);
			
			// loadFromXML( InputStream in):void
			try(FileInputStream fis1 = new FileInputStream("test.XML")){
				prop.loadFromXML(fis1);
				System.out.println(prop);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
