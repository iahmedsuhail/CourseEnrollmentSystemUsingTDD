import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import ort.hamcrest.*;
import org.junit.Test;
import java.util.*;

public class testIfConcessionApproved {
	
	
	
	public static void main(String args[]) {
		
	
	//check student information
	Students stu1 = new Students(131992,"Hanhan",24);
	String info = stu1.getStuInfo();
	System.out.println(info);
	System.out.println("-----------------------------------");
	
	///check course info
	Course course1 = new Course("SXAU","General Economic","COMP722",
			"pass with grades above 80%","Amanda");
	String info2 = course1.getCourseInfo();
	System.out.println(info2);
	System.out.println("-----------------------------------");
	
	
	//set or reject the course
	System.out.println(course1.getStatus());
	course1.setStatus(true);
	System.out.println(course1.getStatus());
	System.out.println("-----------------------------------");
	assertThat(true,course1.getStatus());
	
	
	
	// sent notification to student 
	
	}
}
