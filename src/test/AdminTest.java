import java.util.ArrayList;

import static org.junit.Assert.*;

public class AdminTest {
    @org.junit.Test
    public void testAdminCanSetGuidelines() {
        Course course = new Course();
//        setting maximum number of students that can get into a course
        assertEquals(50, course.setMaxNumberOfStudents(50));

//        set the prerequisites for a course
        ArrayList<Course> resultPrereqs = new ArrayList<Course>("SOFTENG251");
        assertEquals(resultPrereqs, course.setPrereqs("SOFTENG251"));

//        set availability
        assertEquals(false, course.setAvailaibility(false));
    }
}