package raw_data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader (new InputStreamReader (System.in));

        List<Car> deliveryVehicles = new ArrayList<> ();
        int N = Integer.parseInt (scan.readLine ());

        String input = scan.readLine ();
        while (N-- > 0) {
            String[] raw = input.split ("\\s+");
            String carModel = raw[0];
            int engineSpeed = Integer.parseInt (raw[1]);
            int enginePower = Integer.parseInt (raw[2]);
            int cargoWeight = Integer.parseInt (raw[3]);
            String cargoType = raw[4];

            double tyrePressure1 = Double.parseDouble (raw[5]);
            int tireAge1 = Integer.parseInt (raw[6]);
            double tyrePressure2 = Double.parseDouble (raw[7]);
            int tireAge2 = Integer.parseInt (raw[8]);
            double tyrePressure3 = Double.parseDouble (raw[9]);
            int tireAge3 = Integer.parseInt (raw[10]);
            double tyrePressure4 = Double.parseDouble (raw[11]);
            int tireAge4 = Integer.parseInt (raw[12]);


            Engine engine = new Engine (engineSpeed, enginePower);
            Cargo cargo = new Cargo (cargoWeight, cargoType);
            Tire tires = new Tire (tyrePressure1, tireAge1, tyrePressure2, tireAge2, tyrePressure3, tireAge3, tyrePressure4, tireAge4);
            Car car = new Car (carModel, engine, cargo, tires);

            deliveryVehicles.add (car);
            input = scan.readLine ();
        }

        //After the N lines you will receive a single line with one of 2 commands “fragile” or “flamable” ,
        String command = input;
        switch (command) {
            case "fragile":
                // if the command is “fragile” print all cars whose Cargo Type is “fragile” with a tire whose pressure is  < 1,
                deliveryVehicles.stream ()
                        .filter (x -> x.getCargo ().getType ().equals (command))
                        .filter (p -> {
                            double[] tirePressures = Arrays.stream (p.getTires ().getPressure ()).toArray ();
                            double min = Double.MAX_VALUE;
                            for (double tirePressure : tirePressures) {
                                if (min > tirePressure) {
                                    min = tirePressure;
                                }
                            }

                            if (min < 1) {
                                return true;
                            } else {
                                return false;
                            }
                        })
                        .forEach (car -> System.out.println (car.getModel ()));
                break;
            case "flamable":
                // if the command is “flamable” print all cars whose Cargo Type is “flamable” and have Engine Power > 250.
                deliveryVehicles.stream ()
                        .filter (x -> x.getCargo ().getType ().equals (command))
                        .filter (x -> x.getEngine ().getPower () > 250)
                        .forEach (car -> System.out.println (car.getModel ()));

                break;
        }
        // The cars should be printed in order of appearing in the input.
    }
}
