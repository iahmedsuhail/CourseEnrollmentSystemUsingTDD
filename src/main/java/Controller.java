

public class Controller {

    public static void login(Person person, String username, String password){
        // Call method to match usernames and password from the database here
        if(true){
            person.loggedIn = true;
        }
        else {
//            Could not authenticate user
            person.loggedIn = false;
        }
    }
}
