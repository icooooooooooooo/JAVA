import java.util.Scanner;

public class SwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine()); //in seconds
        int distance = Integer.parseInt(scanner.nextLine()); //in meters
        double personaltimeforameter = Double.parseDouble(scanner.nextLine()); //lichno vreme za metar

        double time = distance*personaltimeforameter;
        double delay = (distance/15)*12.5;

        double totaltime=time+delay;

        if (record>totaltime) {
            System.out.printf("Yes, he succeded! The new world record is %.2f seconds", totaltime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.",totaltime-record);
        }
    }
}
