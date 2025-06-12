package pratice1.chap01_poly.controller;

import chap01_poly.model.vo.AniBook;
import chap01_poly.model.vo.Book;
import chap01_poly.model.vo.CookBook;
import chap01_poly.model.vo.Member;

public class LibraryController {
	private Member mem = null;
	private Book[] bList = new Book[5];
	
	{
		bList[0] = new CookBook("나의 왕 만세", "대여기간" ,"네덜란드",true);
		bList[1] = new CookBook("산골짜기이야기", "123","프랑스",true);
		bList[2] = new AniBook("라플란드 산맥", "이십일","노르웨이",20);
		bList[3] = new CookBook("펑퍼짐한 청바지", "나랏","한국",false);
		bList[4] = new CookBook("텍사스","아르투토사","쿠사",true);
	}
	
	public void insertMember(Member mem) {
		this.mem = mem;
	}
	
	public Member myInfo() {
		return mem;
	}
	
	public Book[] selectAll() {
		return bList;
	}
	
	public Book[] searchBook(String keyword) {
		Book[] newList = new Book[bList.length];
		
		int count = 0;
		for(int i = 0; i < bList.length; i++) {
			if(bList[i].getTitle().contains(keyword)) {
				newList[count++] = bList[i];
			}
		}
		return newList;
	}
	
	public int rentBook(int index) {
		int result = 0;
		
		if(bList[index] instanceof AniBook) {
			if(((AniBook)bList[index]).getAccessAge() > mem.getAge()) {
				result = 1;
			}
		}
		
		if(bList[index] instanceof CookBook) {
			if(((CookBook)bList[index]).isCoupon() == true) {
				mem.setCouponCount(mem.getCouponCount() + 1);
				result = 2;
			}
		}
		return result;
	}
}
