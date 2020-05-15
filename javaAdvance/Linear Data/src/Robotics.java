import java.sql.Array;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Robotics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String[] factoryRobots = scanner.nextLine ().split (";");

        // exercises - no objects/classes
        // read robots and speed
        String[] robotsName = new String[factoryRobots.length];
        String[] robotsSpeed = new String[factoryRobots.length];
        for (int i = 0; i < factoryRobots.length; i++) {
            String[] robot = factoryRobots[i].split ("-");
            robotsName[i] = robot[0];
            robotsSpeed[i] = robot[1]; //time
        }

        //Read start of shift

        String[] shiftBegining = scanner.nextLine ().split (":");


        ArrayDeque<String> products = new ArrayDeque ();
        String product = scanner.nextLine ();
        do {
            products.offer (product);
            product = scanner.nextLine ();
        }
        while (!"End".equals (product));

        //Start time - using array
        int hours = Integer.parseInt (shiftBegining[0]);
        int minutes = Integer.parseInt (shiftBegining[1]);
        int seconds = Integer.parseInt (shiftBegining[2]);

        int localtime = hours * 3600 + minutes * 60 + seconds;

        // robots finishing time
        int[] finishingTime = new int[robotsName.length];
        for (int i = 0; i < robotsName.length; i++) {
            finishingTime[i] = localtime;
        }
        // process begins;

        while (!products.isEmpty ()) {
            localtime++;
            for (int i = 0; i < robotsName.length; i++) {
                if (localtime >= finishingTime[i]) {
                    finishingTime[i] = localtime + Integer.parseInt (robotsSpeed[i]);
                    String prod = products.poll ();

                    System.out.printf ("%s - %s [%02d:%02d:%02d]\n",robotsName[i], prod, localtime/3600,(localtime/60)%60, localtime%60);
                    break;
                }
            }

        }
    }
}
