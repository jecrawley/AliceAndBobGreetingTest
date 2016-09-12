package crawley.james.AliceAndBobGreeting;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jamescrawley on 9/9/16.
 */
public class AliceAndBobGreetingTest {


    public void AliceAndBobTest () {
        testAlice();
        testBob();
        testDan();
    }

    @Test
    public void testAlice() {
        User alice = new User("Alice");
        Assert.assertEquals("The greeting should be for Alice.","Hello Alice.", alice.getGreeting());
    }

    @Test
    public void testBob() {
        User bob = new User("Bob");
        Assert.assertEquals("The greeting should be for Bob.","Hello Bob.", bob.getGreeting());
    }

    @Test
    public void testDan() {
        User dan = new User("Dan");
        Assert.assertEquals("The greeting should be generic.","Hello.", dan.getGreeting());
    }
}
