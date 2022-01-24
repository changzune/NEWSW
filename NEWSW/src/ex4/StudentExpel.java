package ex4;

import java.util.ArrayList;

public class StudentExpel {
	
	ArrayList<Student> expelStudents;
	
	public StudentExpel() {
		// TODO Auto-generated constructor stub
		expelStudents = new ArrayList<Student>();
	}
	
	public void addExpelStuduent(String name, int age, int studentNum, String major) {
		// TODO Auto-generated method stub
		expelStudents.add(new Student(name, age, studentNum, major));
	}
	
}
