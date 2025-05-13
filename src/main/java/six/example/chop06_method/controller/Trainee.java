package six.example.chop06_method.controller;

public class Trainee {
	private String name;
	private final String ACADEMY ="KH";
	private char classRoom;
	private String time;
	private static double score;
	
	
	public Trainee() {
		
	}
	public Trainee(String name, char classRoom,String time,double score) {
		this.name = name;
		this.classRoom = classRoom;
		this.time = time;
		Trainee.score = score;
	}
	
	//데이터 일부 수정 일부 반환
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public String printACADEMY() {
		return ACADEMY;
	}
	public void updateClassRoom(char classRoom) {
		this.classRoom = classRoom;
	}
	public char showClassRoom() {
		return classRoom;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
	public String getTime() {
		return time;
	}
	
	public static void setScore(double score) {
		Trainee.score = score;
	}
	public static double getScore() {
		return score;
	}
	
	
	public String infrom() {
		return ACADEMY + " "+ name+" 훈련생은 "+classRoom+"반"+"이고, "+score+"점입니다";
	}
	
}
