
import jolly.human.Person;

public class AccessTest {

    public static void main(String[] args) {
        new AccessTest().runMe();;

    }

    private void runMe() {
        Person pers = new Person("Joker");
        System.out.println(pers);

    }
}
