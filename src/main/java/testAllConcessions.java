package second;

import java.util.LinkedList;
import java.util.List;

public class testAllConcessions {
	
	public static void main(String args[]) {
		Students student1 = new Students(338337,"hong",24);
		Course course1 = new Course("BCIS","Data Structure","TMSK881",
				"Three assignments with above 80% grades","hong");
	
		
		Course course2 = new Course("BCIS","Algorithm","COMP007","pass with excellent","hong");
		
		
		student1.addCourse(course1);
		student1.addCourse(course2);
		
		student1.showAllCourses();
		
		
		assert(student1.getAllCourses().get(0).getCourseInfo().equals(course1.getCourseInfo()));
		
	}
	
	

}
