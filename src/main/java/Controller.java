

public class Controller {

    public static void login(Person person, String username, String password){
        // Call method to match usernames and password from the database here
        if(matchDetailsFromDatabase(person, username, password)){
            person.loggedIn = true;
        }
        else {
//            Could not authenticate user
            person.loggedIn = false;
        }
    }

    public static boolean matchDetailsFromDatabase(Person person, String username, String password){
        if(username == "username" || password == "password"){
            return true;
        }
        else {
            return false;
        }
    }
}
