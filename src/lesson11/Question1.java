package lesson11;

import java.util.Arrays;
import java.util.HashMap;

class Course {

	private String CourseName;
	private String[] faculty;

	public Course(String courseName, String[] faculty) {
		CourseName = courseName;
		this.faculty = faculty;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	public String[] getFaculty() {
		return faculty;
	}

	public void setFaculty(String[] faculty) {
		this.faculty = faculty;
	}

	@Override
	public String toString() {
		return "Course of Faculty are: [CourseName=" + CourseName + ", and faculty's are" + Arrays.toString(faculty) + "]";
	}
	

}

class Question1 {
	public static void main(String[] args) {
		String[] f1= {"Renuka","Promila"};
		Course c1= new Course("FPP",f1);	
		String[] f2= {"Prabhat","Poudel"};
		Course c2= new Course("MPP",f2);
		HashMap<String, Course> cm = new HashMap<String, Course>();
		cm.put("CS390",c1);
		cm.put("CS400",c2);
		System.out.println(cm.get("CS390").toString());
		System.out.println(cm.get("CS400").toString());
		System.out.println(cm.containsKey("CS400"));
		System.out.println(cm.keySet().toString());
		System.out.println(cm.size());
		for(String s:cm.keySet())
		{
			System.out.println(cm.get(s).toString());
		}
		
		System.out.println(cm.toString());

	}

}
