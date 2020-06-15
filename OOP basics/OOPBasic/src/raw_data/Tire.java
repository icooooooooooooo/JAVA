package raw_data;

import java.util.List;

public class Tire {
    private static final int DFAULT_LENGTH = 4;
    // <Tire1Pressure> <Tire1Age> <Tire2Pressure> <Tire2Age> <Tire3Pressure> <Tire3Age> <Tire4Pressure> <Tire4Age>”
    private double[] pressure;
    private int[] age;

    public Tire() {
        pressure = new double[DFAULT_LENGTH];
        age = new int[DFAULT_LENGTH];
    }

    public Tire(double pressure1, int age1, double pressure2, int age2, double pressure3, int age3, double pressure4, int age4) {
        this ();
        this.pressure[0] = pressure1;
        this.age[0] = age1;
        this.pressure[1] = pressure2;
        this.age[1] = age2;
        this.pressure[2] = pressure3;
        this.age[2] = age3;
        this.pressure[3] = pressure4;
        this.age[3] = age4;
    }

    public double[] getPressure() {
        return this.pressure;
    }
}



