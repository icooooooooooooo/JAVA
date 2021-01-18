package p01_system_resources;

import p01_system_resources.interfaces.TimeGenerator;

public class Main {
    public static void main(String[] args) {
GreetingClock greetingClock = new GreetingClock(new TimeGeneratorImpl());

greetingClock.greeting();
    }
}
