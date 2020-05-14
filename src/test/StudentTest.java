import javax.swing.plaf.ColorUIResource;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {
    @org.junit.Test
    public void testCanEnrolIntoCourses() {
        Student student = new Student();
        Course course = new Course("Software Requirements Engineering", "SOFTENG754", 15, true);

        ArrayList<Course> resultEnrolledCourses = new ArrayList<>();
        resultEnrolledCourses.add(course);

        student.enrol(new Course("Software Requirements Engineering", "SOFTENG754", 15, true));

        assertEquals(resultEnrolledCourses, getEnrolledCourses());

    }
}