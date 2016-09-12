package crawley.james.AliceAndBobGreeting;

/**
 * Created by jamescrawley on 9/9/16.
 */
public class User {

    String name;

    public User (String name) {
        this.name = name;
    }

    public String getGreeting() {

        if (name.toLowerCase().equals("alice") || name.toLowerCase().equals("bob")) {
            return "Hello " + name + ".";
        } else {
            return "Hello.";
        }
    }
}

