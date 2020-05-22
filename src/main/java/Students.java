package second;

import java.util.LinkedList;

public class Students extends Person{
	public Students(int ID, String name, int age) {
		super(ID, name, age);
		// TODO Auto-generated constructor stub
	}

	
	
	LinkedList<Course> allCourses;
	
	public Students() {
		this.allCourses = new LinkedList<>();
	}
	
	public LinkedList<Course> getAllCourses(){
		return allCourses;
	}
	
	public void addCourse(Course course) {
		allCourses.add(course);
	}

	public LinkedList<Course> showAllCourses() {
		return allCourses;
	}
	
	
	public String getName() {
		return name;
	}
	
//	public String getStuInfo() {
//		return "Student information: student ID is: " + ID + ", student name is: " + name + 
//				", Student age is :" + age;
//	}
//	
	
	
	
}
