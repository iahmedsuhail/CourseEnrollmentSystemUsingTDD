import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConcessionApproval {
    AdminClass adminClass;
    CourseClass courseClass;

    @Before
    public void init() {
        adminClass = new AdminClass();
        courseClass = new CourseClass("Software Requirements Engineering", "SOFTENG754", 15, true);
    }

    @Test
    public void testCheckEnrollmentConcessions() {
        StudentClass stu = new StudentClass();
        stu.setName("testUser");
        EnrollmentConcession con = new EnrollmentConcession(stu, courseClass);
        adminClass.acceptConscession(con);
        assertEquals(true, con.getAccepted());
        adminClass.rejectConscession(con);
        assertEquals(false, con.getAccepted());
    }
}
