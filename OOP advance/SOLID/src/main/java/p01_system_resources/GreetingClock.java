package p01_system_resources;

import p01_system_resources.interfaces.GreetingDevice;
import p01_system_resources.interfaces.TimeGenerator;

import java.time.LocalTime;

public class GreetingClock implements GreetingDevice {

    private TimeGenerator time;

    public GreetingClock(TimeGenerator timeGenerator) {
        this.time = timeGenerator;
    }

    @Override
    public void greeting() {
        if (time.getHour() < 12) {
            System.out.println("Good morning...");
        } else if (time.getHour() < 18) {
            System.out.println("Good afternoon...");
        } else {
            System.out.println("Good evening...");
        }
    }
}
