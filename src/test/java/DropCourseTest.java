import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DropCourseTest {
    StudentClass studentClass;
    CourseClass courseClass;
    @Before
    public void init(){
        studentClass = new StudentClass();
        

    }

    @Test
    public void testDropCourses(){
        CourseClass courseClass1 = new CourseClass("Software Engineering", "SOFTENG751", 12, true);
        studentClass.enrol(courseClass);
        studentClass.enrol(courseClass1);
        assertTrue(studentClass.dropOutCourse(courseClass));
        assertEquals(1, studentClass.getEnrolledCours().size());
    }
}
