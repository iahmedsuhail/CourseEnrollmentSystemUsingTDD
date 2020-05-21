import static org.junit.Assert.*;
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

    @org.junit.Test
    public void Given_StudentEnrolsIntoACourse_Expect_TheFeeOwedByTheStudentIncreases(){
        Student student = new Student();
        Teacher teacher = new Teacher("Kelly Blincoe");
        Course course = new Course("Software Requirements Engineering", "SOFTENG754", 15, true, teacher, 500);

        student.enrol(course);

        assertEquals(500, student.feeLiable);
    }

    @org.junit.Test
    public void Given_CourseIsNotAvailable_Expect_StudentsCantBeEnrolledIntoCourse(){
        Course course = new Course("Software Requirements Engineering", "SOFTENG754", 15, true);
        course.setAvailability(false);

        Student student = new Student();
        ArrayList<Course> emptyListOfCourses = new ArrayList<>();

        student.enrol(course);

        assert(emptyListOfCourses.equals(student.getEnrolledCourses()));
    }
}