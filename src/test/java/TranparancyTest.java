import org.junit.Before;
import org.junit.Test;

public class TranparancyTest {
    StudentClass studentClass;
    CourseClass courseClass;
    @Before
    public void init(){
        studentClass = new StudentClass();
        courseClass = new CourseClass("Software Requirements Engineering", "SOFTENG754", 15, true);

    }

    @Test(expected = IllegalStateException.class)
    public void testConcessionsBeforeEnrollment(){
        studentClass.applyForConcession(courseClass);
        studentClass.enrol(new CourseClass("test", "code",01,true));
    }
}
