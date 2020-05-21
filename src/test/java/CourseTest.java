import java.util.ArrayList;
import static org.junit.Assert.*;

public class CourseTest {

    @org.junit.Test
    public void testCourseDetailsCanBeSeen() {
        Course course = new Course("Software Requirements Engineering", "SOFTENG754", 15, true);
        assertEquals("Software Requirements Engineering", course.getName());
        assertEquals("SOFTENG754", course.getCode());
        assertEquals(15, course.getPoints());
        assertEquals(true, course.getAvailability());
    }

    @org.junit.Test
    public void Given_StudentIsEnrolledInACourse_Expect_StudentCanSeeTheEnrolledCourses() {
        Student student = new Student();

//        Create 3 new courses
        Course course = new Course("Software Requirements Engineering", "SOFTENG754", 15, true);
        Course course1 = new Course("High Performance Computing", "SOFTENG751", 15, true);
        Course course2 = new Course("Software Tools and Techniques", "SOFTENG750", 15, true);

//        Enroll the student into the courses
        student.enrol(course);
        student.enrol(course1);
        student.enrol(course2);

//        Result object for comparison
        ArrayList<Course> resultEnrolledCourses = new ArrayList<>();
        resultEnrolledCourses.add(course);
        resultEnrolledCourses.add(course1);
        resultEnrolledCourses.add(course2);

        assertEquals(resultEnrolledCourses, student.getEnrolledCourses());
    }

    @org.junit.Test
    public void testCanSeeInstructor() {
//        Create a new course with an instructor.
        Teacher teacher = new Teacher("Kelly Blincoe");
        Course course = new Course("Software Requirements Engineering", "SOFTENG754", 15, true, teacher);

        assertEquals("Kelly Blincoe", course.getInstructor());
    }
}