package OOPs;

public class Lamp {

    Boolean isOn;

    public void turnoff(){
        isOn = false;
        System.out.println("Light is Turned off");
    }

    public void turnOnn(){
        isOn = true;
        System.out.println("Light is turned On");
    }
}
