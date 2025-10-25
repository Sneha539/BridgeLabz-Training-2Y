interface SmartDevice {
    void turnOn();
    void turnOff();
}

class Light implements SmartDevice {
    public void turnOn() {
        System.out.println("Light is turned on");
    }
    public void turnOff() {
        System.out.println("Light is turned off");
    }
}

class AC implements SmartDevice {
    public void turnOn() {
        System.out.println("AC is turned on");
    }
    public void turnOff() {
        System.out.println("AC is turned off");
    }
}

class TV implements SmartDevice {
    public void turnOn() {
        System.out.println("TV is turned on");
    }
    public void turnOff() {
        System.out.println("TV is turned off");
    }
}

public class SmartDeviceControl {
    public static void main(String[] args) {
        SmartDevice l = new Light();
        SmartDevice a = new AC();
        SmartDevice t = new TV();
        l.turnOn();
        a.turnOn();
        t.turnOn();
        l.turnOff();
        a.turnOff();
        t.turnOff();
    }
}
