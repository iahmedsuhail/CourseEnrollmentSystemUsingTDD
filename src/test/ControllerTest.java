import static org.junit.Assert.*;

public class ControllerTest {

    @org.junit.Test
    public void testPersonCanLogin() {
        Person person = new Person();
        person.login("username", "password");
        assertTrue(person.isLoggedIn());
    }
}