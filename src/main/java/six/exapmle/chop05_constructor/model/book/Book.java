package six.exapmle.chop05_constructor.model.book;

public class Book {

	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	public Book(){
		
	}
	public Book(String title,String publisher,String author) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;	
	}
	public Book(String title,String publisher,String author,int price,double discountRate) {
		this(title,publisher,author);
		this.price = price;
		this.discountRate = discountRate;
	}
	public void inform() {
		System.out.printf("%s %s %s %d %f\n",title,publisher,author,price,discountRate);
		
	}
	
	
}
