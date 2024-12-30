package OOPs;

public class LampClient {

    public static void main(String[] args) {

        Lamp led = new Lamp();

        Lamp halogen = new Lamp();

        led.turnOnn();
        halogen.turnoff();
    }
}
