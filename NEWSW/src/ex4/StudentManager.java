package ex4;

import java.util.ArrayList;

public class StudentManager {

		ArrayList<Student> students = new ArrayList<Student>();
		StudentExpel studentExpel = new StudentExpel();
		
		public static void main(String[] args) {
			
			StudentManager studentManager = new StudentManager();
			
			studentManager.addStudent("È«±æµ¿", 22, 20123487, "¿µ±Ø¿µÈ­");
			studentManager.addStudent("È«±æ¼ø", 24, 20106428, "¼öÇĞ°ú");
			studentManager.addStudent("ÀÌÀº°æ", 21, 20135788, "±¹¹®°ú");
			studentManager.addStudent("±èÃ¶¼ö", 23, 20114221, "Ã¼À°°ú");
			studentManager.addStudent("±è¼øÈñ", 26, 20089883, "¹«¿ë°ú");
			
		}
		
		private void addStudent(String name, int age, int studentNum, String major) {
		
			students.add(new Student(name, age, studentNum, major));
			System.out.println(name + " ÇĞ»ı Á¤º¸ ÀÔ·Â ¼º°ø!!");
		}
	}

	
	
	
	

