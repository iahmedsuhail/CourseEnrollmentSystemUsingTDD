import org.junit.Test;
import org.junit.experimental.categories.Category;
import java.util.ArrayList;
import static org.junit.Assert.*;

interface IntegrationTests { /* Category marker */ }

public class CourseEnrollmentSystemTest {

    @Category(IntegrationTests.class)
    @org.junit.Test
    public void test_Student_CanSubmit_EnrollmentConcession_ForA_Course_WithA_Teacher(){
        Student student = new Student();
        Teacher teacher = new Teacher("Kelly Blincoe");
        Course course = new Course("Software Requirements Engineering",
                "SOFTENG754", 15, true, teacher, 500);

        student.enrol(course);

        ArrayList<Course> resultEnrolledCourses = new ArrayList<>();
        resultEnrolledCourses.add(course);

        assertEquals(resultEnrolledCourses, student.getEnrolledCourses());
    }
}