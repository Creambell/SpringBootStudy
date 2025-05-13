package six.exapmle.chop05_constructor.model;

public class User {

	private String userId;
	private String userName;
	private int age;
	private double point;
	
	public User() {
//		System.out.println("기본생성자 User()");
		userId = "user01";
		userName = "조호선";
		age = 20;
		point = 1234.5;
	}
	
	//매개변수 있는 생성자
	public User(String userId, String userName, int age, double point) {
		//필드와 지역변수의 이름이 같으면 지역변수부터 우선권이 있어서 생기는 에러.
		//그래서 this로 주소값을 확정지어주는.
		this.userId = userId;
		this.userName = userName;
		this.age = age;
		this.point = point;
//		System.out.println("User : " + this);
//		userId = id;
//		userName = name;
//		age = nai;
//		point = p;
	}
	
	public User(String userId,String userName) {
		this.userId = userId;
		this.userName = userName;
	}
	
	
	public void infrom() {
		System.out.printf("%s, %s, %d, %f\n",userId,userName,age,point);
	}
	
	
}
