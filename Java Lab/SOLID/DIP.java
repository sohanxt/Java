interface Switchable {
    void turnOn();
    void turnOff();
}

class LightBulb implements Switchable {
    public void turnOn() {
        System.out.println("LightBulb ON");
    }

    public void turnOff() {
        System.out.println("LightBulb OFF");
    }
}

class Fan implements Switchable {
    public void turnOn() {
        System.out.println("Fan ON");
    }

    public void turnOff() {
        System.out.println("Fan OFF");
    }
}

class Switch {

    private Switchable device;

    public Switch(Switchable device) {
        this.device = device;
    }

    public void operate() {
        device.turnOn();
    }
}

public class DIP {
    public static void main(String[] args) {

        Switchable bulb = new LightBulb();
        Switchable fan = new Fan();

        Switch bulbSwitch = new Switch(bulb);
        Switch fanSwitch = new Switch(fan);

        bulbSwitch.operate();
        fanSwitch.operate();
    }
}
