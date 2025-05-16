package eight.example.test.model.vo;

public class Snake extends Animal{
	
//	private String name;
//	private int age;
//	private double weight;
	private String pattern;
	
	public Snake() {}
	public Snake(String name,int age,double weight,String pattern) {
		super(name,age,weight);
		this.pattern = pattern;
	}
	
	
	public String getPattern() {
		return pattern;
	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	@Override
	public String toString() {
		return super.toString() +" "+ pattern;
	}
	
	
}
