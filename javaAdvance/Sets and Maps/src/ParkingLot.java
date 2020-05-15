import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        Set<String> plates = new HashSet<> ();
        String input = scanner.nextLine ();

        while (!"END".equals (input)) {

            String[] command = input.split (",");
            String direction = command[0];
            String plate = command[1];

            if ("IN".equals (direction)) {
                plates.add (plate);
            } else if ("OUT".equals (direction)) {
                plates.remove (plate);
            }

            input = scanner.nextLine ();
        }

        if (plates.isEmpty ()) {
            System.out.println ("Parking Lot is Empty");
        } else {
            for (String plate : plates) {
                System.out.println (plate);
            }
        }
    }
}
