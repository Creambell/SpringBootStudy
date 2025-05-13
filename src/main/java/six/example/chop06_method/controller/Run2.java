package six.example.chop06_method.controller;

public class Run2 {
	public static void main(String[] args) {
		
		System.out.println();
		
		Trainee t1 = new Trainee();
		System.out.println(t1.infrom());
		
		Trainee t2 = new Trainee("마가렛",'R',"종일",34.8);
//		System.out.println(t2.infrom());
		t2.updateClassRoom('D');
		System.out.println(t2.infrom());
		
		Trainee t3 = new Trainee("바벳사",'A',"종일",88.3);
		t3.setName("델라벳");
		Trainee.setScore(100);
		
		System.out.println(t3.infrom());
		
		double kScore = Trainee.getScore();
		double oScore = Trainee.getScore();
		double avg = (kScore + oScore)/2;
		System.out.println(avg);
	}
}
