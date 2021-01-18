package p01_system_resources;

import p01_system_resources.interfaces.TimeGenerator;

import java.time.LocalTime;

public class TimeGeneratorImpl implements TimeGenerator {

    private LocalTime time;

    public TimeGeneratorImpl() {
        this.time = LocalTime.now();
    }

    @Override
    public int getHour() {
        return this.time.getHour();
    }
}
