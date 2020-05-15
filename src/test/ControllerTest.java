import org.mockito.Mockito;
import static org.junit.Assert.*;

public class ControllerTest {

    @org.junit.Test
    public void testPersonCanLogin() {
        Person person = new Person();
        Controller.login(person,"username", "password");
        assertTrue(person.isLoggedIn());
    }

    @org.junit.Test
    public void testCanSubmitEnrollmentConcession() {
//        Mocked student because the getName function doesn't exist
        Student mockedStudent = Mockito.mock(Student.class);
        Course course = new Course("Software Requirements Engineering", "SOFTENG754", 15, true);

//        Create a new Enrollment Concession
        EnrollmentConcession ec = new EnrollmentConcession(mockedStudent, course);

        Mockito.when(mockedStudent.getName()).thenReturn("Ahmed");
        assertEquals("Ahmed wants to enrol in SOFTENG754", ec.getDetails());
    }
}