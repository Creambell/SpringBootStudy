package six.example.chap01_encapsultion;

public class Account {
	private String name = "박신우";
	private String phone = "010-1234-4567";
	private String pwd = " q1234";
	private int bankcode = 3030;
	private int balance = 0;
	
	//입금 메소드 인트 머니는 외부로부터 값을 받아오기위한 통로/매개변수
	public void deposit(int money) {
		if(money > 0) {
			balance += money;
			System.out.println(name + "님의 계좌에 " + money + "원이 입금");
		}else {
			System.out.println("잘못된 금액이 입력되었습니다.");
		}
	}
		
	//출금 메소드
	public void widthdraw(int money) {
		if(money <= balance ) {
			balance -= money;
			System.out.println(name + "님의 계좌에 " + money + "원이 출금");
		}else {
			System.out.println("잔액이 부족합니다");
		}
		
	}
	//잔액 조회 메소드
	public void displayBalance() {
		System.out.println(name = "님의 계좌 잔액은 " + balance + "원입니다.");
		
	}
	
	
	
}