package com.kh.example.chop01_String.controller;

import java.util.StringTokenizer;

public class StringController {
	public void method1() {
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");
		
		
		
		System.out.println("str1과 str2의 주소는 같은가?"+(str1 == str2));
		//참조 자료형에서 ==은 주소값비교
		System.out.println("str1과 str3의 주소는 같은가?"+(str1 == str3));
		//객체로 만든 자바는 주소값이 다름
		System.out.println("str1 과 str2의 값은 같은가?" + str1.equals(str2));
		System.out.println("str1 과 str3의 값은 같은가?" + str1.equals(str3));
		
		// hashCode
		// 어지간하면 맞지만 안맞는경우
		System.out.println("str1의 hashCod : " + str1.hashCode());
		System.out.println("str2의 hashCod : " + str2.hashCode());
		System.out.println("str3의 hashCod : " + str3.hashCode());
		
		//더 정확한 주소값찾기
		System.out.println("str1의 실주소값 : " + System.identityHashCode(str1));
		System.out.println("str2의 실주소값 : " + System.identityHashCode(str2));
		System.out.println("str3의 실주소값 : " + System.identityHashCode(str3));

		
	}
	

	public void method2() {
		StringBuffer buffer1 = new StringBuffer();
		System.out.println("초기 buffer1의 수용량 : " + buffer1.capacity());
		System.out.println("buffer1에 들어있는 실제값 길이 : "+buffer1.length());

		StringBuffer buffer2 = new StringBuffer(100);
		System.out.println("초기 buffer2의 수용량 : " + buffer2.capacity());
		System.out.println("buffer2에 들어있는 실제값 길이 : "+buffer2.length());

		StringBuffer buffer3 = new StringBuffer("abc");
		System.out.println("초기 buffer3의 수용량 : " + buffer3.capacity());
		System.out.println("buffer3에 들어있는 실제값 길이 : "+buffer3.length());

		System.out.println("buffer3의 실주소 값 : "+ System.identityHashCode(buffer3));
		
		buffer3.append("abc"); // 뒤에 붙이는 함수
		System.out.println("abc 추가 후의 버퍼3 : "+buffer3);
		System.out.println("abc 추가 후의 버퍼3 용량 : "+buffer3.capacity());
		System.out.println("abc 추가 후의 버퍼3 길이 : "+buffer3.length());
		
		buffer3.append("def");
		System.out.println("def 추가 후의 버퍼3 : "+buffer3);
		System.out.println("def 추가 후의 버퍼3 용량 : "+buffer3.capacity());
		System.out.println("def 추가 후의 버퍼3 길이 : "+buffer3.length());
		
		System.out.println("buffer3의 실주소 값 : "+ System.identityHashCode(buffer3));
		
		buffer3.insert(2, "zzz");
		System.out.println(buffer3);
		
		buffer3.delete(2, 5); //스타느는 포함되지만 마지막은 포함안됌.
		System.out.println(buffer3);
		
		buffer3.reverse();//반대로
		System.out.println(buffer3);
		
		StringBuffer sb = new StringBuffer("abc");
		sb.append("zzz").insert(2, "yy").reverse().delete(1, 3);
		//abyyczzz  zcyyba
		System.out.println(sb);
		
	}

	public void method3() {
		String str = "Hello World";
		
		
		//1. charat(int index):char
		char ch = str.charAt(4);
		System.out.println(ch);
		
		// 2. concat(String str):STring
		String concatStr = str.concat("!!!");
		System.out.println(concatStr);
		str += "!!!";
		System.out.println(str);
		
		// 3. equals(Object anObject):boolean
		System.out.println("concatStr.equals(str) : " + concatStr.endsWith(str));
		
		// 4. substring(int beginIndex):String 일부만 가져오기
		//	  substring(int beginIndex,int endIndex):String
		System.out.println("str.substring(6) : "+str.substring(6));
		System.out.println("str.substring(0,4) : "+str.substring(0,4));
		
		// 5. replace (char oldChar, char newChar):String
		System.out.println("str.replace('1','e') :"+ str.replace('l','e'));
		
		// 6. toUpperCase()/toLowerCase():String
		String upper = str.toUpperCase();
		String lower = str.toLowerCase();
		System.out.println("str.toUpperCase() : "+upper);
		System.out.println("str.toLowerCase() : "+lower);
		
		// 7. equalsIgnoerSace(String anotherString):boolean
		System.out.println(upper.equals(lower));
		System.out.println(upper.equalsIgnoreCase(lower));
		// IgnoerCase를 붙이면 대소문자를 통합해줌
		
		// 8. trim():String  공백제거
		String str2 = "	Java";
		String str3 = "Java   ";
		String str4 = "   Ja      va";
		System.out.println(str2+" : "+str2.trim() +"!");
		System.out.println(str3+" : "+str3.trim() +"!");
		System.out.println(str4+" : "+str4.trim() +"!");
		
		// 9. split(String str):String[]
		String splitStr = "Java, oracle, JDBC, Front, Server, Framework";
		String[] splitArr = splitStr.split(", ");
		for(int i = 0; i < splitArr.length;i++) {
			System.out.println(splitArr[i]);
		}
		String splitStr2 = "JAVA|ORACLE,JDBC-FRONT*SERVSER FRAMEWORK";
		String[] splitArr2 = splitStr2.split(", *-|");
		for(int i = 0; i < splitArr2.length;i++) {
			System.out.println(splitArr2[i]);
		}
		StringTokenizer st = new StringTokenizer(splitStr2,", *-|");
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
		
		
		
		
	}
}
