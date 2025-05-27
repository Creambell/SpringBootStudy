package com.kh.example.chop02_char.run;

import com.kh.example.chop02_char.model.dao.CharDAO;

public class Run {

	public static void main(String[] args) {
		CharDAO ch = new CharDAO();
		ch.fileSave();
		ch.fileOpen();
	}

}
