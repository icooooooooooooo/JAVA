import java.util.Scanner;

public class AquariumVolume {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Double width = Double.parseDouble(scanner.nextLine());
        Double depth = Double.parseDouble(scanner.nextLine());
        Double height = Double.parseDouble(scanner.nextLine());
        Double percentsand = Double.parseDouble(scanner.nextLine());

        Double volume = width*depth*height * (1-percentsand*0.01);
        Double waterneededinliters = volume * 0.001;

        System.out.println(String.format("The amount of water needed is %.3f liters.", waterneededinliters));

    }
}
