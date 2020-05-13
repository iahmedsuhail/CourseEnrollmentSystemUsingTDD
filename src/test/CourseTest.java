import static org.junit.Assert.*;

public class CourseTest {

    @org.junit.Test
    public void testCourseDetailsCanBeSeen() {
        Course course = new Course("Software Requirements Engineering", "SOFTENG754", 15, true);
        assertEquals("Software Requirements Engineering", course.getName());
        assertEquals("SOFTENG754", course.getCode());
        assertEquals(15, course.getPoints());
        assertEquals(true, course.getAvailaibility());
    }
}