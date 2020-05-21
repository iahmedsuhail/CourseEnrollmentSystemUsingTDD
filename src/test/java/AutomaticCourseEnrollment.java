import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AutomaticCourseEnrollment {
    @Test
    public void testAutoEnrol() {
        List<CourseClass> courseClassList = new ArrayList<>();
        courseClassList.add(new CourseClass("ABC", "123", 0, true));
        courseClassList.add(new CourseClass("XYZ", "456", 0, true));
        courseClassList.add(new CourseClass("LMN", "789", 0, true));
        CourseClass cor2 = courseClassList.get(1);
        cor2.makeMandatory();
        EnrollmentManager sys = new EnrollmentManager(courseClassList);
        StudentClass studentClass = new StudentClass();
        sys.AutoEnroll(studentClass);
        assertEquals(cor2, studentClass.getEnrolledCours().get(0));
        assertTrue(studentClass.getEnrolledCours().contains(cor2));
    }

}
