import java.util.ArrayList;

import static org.junit.Assert.*;

public class AdminTest {


    @org.junit.Test
    public void testAdminCanSetGuidelines() {
        Course course = new Course("Software Requirements Engineering", "SOFTENG754", 15, true);
//        setting maximum number of students that can get into a course
        course.setMaxNumberOfStudents(50);
        assertEquals(50, course.getMaxNumberOfStudents());

//        set the prerequisites for a course
        course.addPrereqs("SOFTENG251");
        ArrayList<String> resultPrereqs = new ArrayList<>();
        resultPrereqs.add("SOFTENG251");
        assertEquals(resultPrereqs, course.getPrereqs());

//        set availability
        course.setAvailaibility(false);
        assertEquals(false, course.getAvailaibility());
    }
}