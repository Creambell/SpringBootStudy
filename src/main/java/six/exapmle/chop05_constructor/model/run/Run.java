package six.exapmle.chop05_constructor.model.run;

import com.kh.exapmle.chop05_constructor.model.book.Book;

public class Run {
	public static void main(String[] args) {
		
		
		Book bo = new Book();
		bo.inform();
		
		Book b2 = new Book("자바의 정석","천재교육","남궁민");
		b2.inform();
		
		Book b3 = new Book("작은 왕","퍼블리셔","작은 등",12031,0.24);
		b3.inform();
		
		
		
//		User us = new User();
//		us.infrom();
//		
//		User u2 = new User("user02","지지지",30,123.4);
//		u2.infrom();
//		
//		User u3 = new User("user03","베베베");
//		u3.infrom();
//		
	}
}
