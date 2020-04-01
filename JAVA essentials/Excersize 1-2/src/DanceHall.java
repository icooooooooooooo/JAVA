import java.util.Scanner;

public class DanceHall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double side1 = Double.parseDouble(scanner.nextLine());
        double side2 = Double.parseDouble(scanner.nextLine());
        double wardrobeside = Double.parseDouble(scanner.nextLine());
        double totalspace = side1*side2;
        double wardrobesize = Math.pow(wardrobeside,2);
        double benchsize = totalspace /10;
        double totalfreespace = totalspace-wardrobesize-benchsize;
        double totalfreespaceincentimeters = totalfreespace*10000;



               //freespaceincentimeters = (side1 * side2 - ((side1 * side2)*0.1)- Math.pow(wardrobeside, 2))*10000;


        double maxocupacy = Math.floor(totalfreespaceincentimeters/(40+7000));

        System.out.println(String.format("%f", maxocupacy));


        }
    }