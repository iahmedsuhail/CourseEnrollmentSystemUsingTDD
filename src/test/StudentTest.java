import java.util.ArrayList;
import java.util.List;

public class StudentTest {
    @org.junit.Test
    public void testCanEnrolIntoCourses() {
        Student student = new Student();
        Course course = new Course("Software Requirements Engineering", "SOFTENG754", 15, true);

        List<Course> resultEnrolledCourses = new ArrayList<>();
        resultEnrolledCourses.add(course);

        student.enrol(new Course("Software Requirements Engineering", "SOFTENG754", 15, true));

//        Won't work probably because the they aren't the same objects in memory
//        assertEquals(resultEnrolledCourses, student.getEnrolledCourses());

//        This test gets details (as a string) of the enrolledCourses and the course we just added
        assert(student.getEnrolledCourses().get(student.enrolledCourses.size()-1).showInfo().equals(resultEnrolledCourses.get(0).showInfo()));
    }
}