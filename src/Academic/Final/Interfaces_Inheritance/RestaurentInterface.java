package Academic.Final.Interfaces_Inheritance;
import java.util.*;

/**
 * Create an interface MyRestaurant having a method eat(), create another
 * interface MyJourney having a method travel(). Create a class Holiday
 * implements both interfaces.
 */

interface MyRestaurent{

    void eat();

}

interface MyJourney{

    void travel();
}

class Holiday implements MyJourney,MyRestaurent{

    public void travel(){
        System.out.println("Travel at a beautiful destination for holiday");

    }

    public void eat() {
        System.out.println("Eat delicious meals at your holiday");
    }
}



public class RestaurentInterface {

    public static void main(String[] args) {

        Holiday holiday = new Holiday();

        holiday.eat();
        holiday.travel();


    }
}
