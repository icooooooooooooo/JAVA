package car_salesman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader (new InputStreamReader (System.in));

        List<Car> carList = new ArrayList<> ();
        Map<String, Engine> engineList = new HashMap<> ();

        int N = Integer.parseInt (scan.readLine ()); //Total available Engine models
        while (N-- > 0) {
            String[] input = scan.readLine ().split ("\\s+");

            String engineModel = input[0];
            int enginePower = Integer.parseInt (input[1]);

            int arrLength = input.length;

            if (arrLength == 2) {
                Engine engine = new Engine (engineModel, enginePower);
                engineList.putIfAbsent (engineModel, engine);

            } else if (arrLength == 3) {
                if (input[2].matches ("\\d+")) {
                    int engineDisplacement = Integer.parseInt (input[2]);
                    Engine engine = new Engine (engineModel, enginePower, engineDisplacement);
                    engineList.putIfAbsent (engineModel, engine);

                } else {
                    String efficiency = input[2];
                    Engine engine = new Engine (engineModel, enginePower, efficiency);
                    engineList.putIfAbsent (engineModel, engine);

                }
            } else if (arrLength == 4) {
                int engineDisplacement = Integer.parseInt (input[2]);
                String efficiency = input[3];

                Engine engine = new Engine (engineModel, enginePower, engineDisplacement, efficiency);
                engineList.putIfAbsent (engineModel, engine);

            }

        }

        int M = Integer.parseInt (scan.readLine ()); //Total available Car models
        while (M-- > 0) {
            String[] input = scan.readLine ().split ("\\s+");

            String carModel = input[0];
            String engineName = input[1];

            Engine engine = engineList.get (engineName);
            Car car = new Car (carModel, engine);

            int arrLength = input.length;

            if (arrLength == 3) {
                if (input[2].matches ("\\d+")) {
                    int weight = Integer.parseInt (input[2]);
                    car = new Car (carModel, engine, weight);
                } else {
                    String color = input[2];
                    car = new Car (carModel, engine, color);
                }
            } else if (arrLength == 4) {
                int weight = Integer.parseInt (input[2]);
                String color = input[3];
                car = new Car (carModel, engine, weight, color);
            }
            carList.add (car);

        }

        //Your task is to print each car (in the order you received them) and its information in the format defined bellow,
        // if any of the optional fields has not been given print “n/a” in its place instead:
        carList.stream ().forEach (c -> {
            StringBuilder carSpec = new StringBuilder ();

            //<CarModel>:
            //<EngineModel>:
            //Power: <EnginePower>

            //A Car’s weight and color and its Engine’s displacements and efficiency are optional

            //Displacement: <EngineDisplacement>
            //Efficiency: <EngineEfficiency>

            //Weight: <CarWeight>
            //Color: <CarColor>

            carSpec.append (c.getModel ()).append (System.lineSeparator ());
            carSpec.append (c.getEngine ().getModel ()).append (System.lineSeparator ());
            carSpec.append ("Power:").append (c.getEngine ().getPower ()).append (System.lineSeparator ());

            int displacement = c.getEngine ().getDisplacement ();
            carSpec.append ("Displacement:");
            if (displacement == -1) {
                carSpec.append ("n/a").append (System.lineSeparator ());
            } else {
                carSpec.append (displacement).append (System.lineSeparator ());
            }
            carSpec.append ("Efficiency:").append (c.getEngine ().getEfficiency ()).append (System.lineSeparator ());

            int weigth = c.getWeight ();
            carSpec.append ("Weight:");
            if (weigth == -1) {
                carSpec.append ("n/a").append (System.lineSeparator ());

            } else {
                carSpec.append (weigth).append (System.lineSeparator ());
            }
            carSpec.append ("Color:").append (c.getColor ()).append (System.lineSeparator ());

            System.out.print (carSpec.toString ());
        });

    }
}
