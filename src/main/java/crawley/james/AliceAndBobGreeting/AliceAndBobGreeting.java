package crawley.james.AliceAndBobGreeting;

import java.util.*;

/**
 * Created by jamescrawley on 9/9/16.
 */
public class AliceAndBobGreeting {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String userName = scanner.nextLine();
        User user = new User(userName);
        System.out.println(user.getGreeting());

    }

}
