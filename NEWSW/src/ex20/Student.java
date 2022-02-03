package ex20;

public class Student {
	
	private String name;
	private int grade;
	
	public Student(String name, int grade) {
		this.name = name; 
		this.grade = grade;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + ":" + grade;	
	
	}
	
	@Override
	public boolean equals(Object obj) {
		String compareVlaue = obj.toString();
		String thisValue = toString();
		return super.equals(compareVlaue);
	}
	
	@Override
	public int hashCode() {
		return toString().hashCode();
		
	}

}
