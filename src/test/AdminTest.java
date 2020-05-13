import java.util.ArrayList;

import static org.junit.Assert.*;

public class AdminTest {

    @org.junit.Before
    public void createCourseObject() {
        Course course = new Course("Software Requirements Engineering", "SOFTENG754", 15, true);
    }
    
    @org.junit.Test
    public void testAdminCanSetGuidelines() {
//        setting maximum number of students that can get into a course
        assertEquals(50, course.setMaxNumberOfStudents(50));

//        set the prerequisites for a course
        ArrayList<Course> resultPrereqs = new ArrayList<Course>("SOFTENG251");
        assertEquals(resultPrereqs, course.setPrereqs("SOFTENG251"));

//        set availability
        assertEquals(false, course.setAvailaibility(false));
    }
}