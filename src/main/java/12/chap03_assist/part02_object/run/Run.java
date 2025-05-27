package com.kh.example.chap03_assist.part02_object.run;

import com.kh.example.chap03_assist.part02_object.model.dao.ObjectDAO;

public class Run {

	public static void main(String[] args) {
//		new Member().toString();
//		Member me = new Member();
//		me.toString();
		
		ObjectDAO od = new ObjectDAO();
//		od.fileSave();
//		od.fileOpen();
		od.exampleWrite();
	}

}
