import java.util.Scanner;

public class AnimalType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String animalinput = scanner.nextLine();
        switch (animalinput) {
            case "dog":
                System.out.println("Mamal");
                break;
            case ("gecko"):
                System.out.println("reptile");
                break;

            default:
                System.out.println("Wrong input");
                break;
            }
        }
    }
