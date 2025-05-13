package six.example.chap01_encapsultion;

public class Run {
	public static void main(String[] args) {
		Account a = new Account(); //객체
		
//		System.out.println(a.balance);
//		a.balance -= 20000;
//		System.out.println(a.balance);
		//데이터 은닉화가 되지 않아서 외부에서 데이터에 접근이 가능하면
		//private 로 숨길수있음
		
		a.displayBalance();
		
		a.deposit(1000000);
		a.displayBalance();
		
		a.widthdraw(150000);
		a.displayBalance();
		
		
		
	}
}
