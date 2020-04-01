import java.util.Scanner;

public class FootballSouveniers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String souveniere = scanner.nextLine();
        int num = Integer.parseInt(scanner.nextLine());
        boolean isCountryValid = true;
        boolean isSouveniereValid = true;

        double price = 0;
        switch (country) {
            case "Argentina":
                if (souveniere.equals("flags")) {
                    price = 3.25;
                    break;
                } else if (souveniere.equals("caps")) {
                    price = 7.2;
                    break;
                } else if (souveniere.equals("posters")) {
                    price = 5.1;
                    break;
                } else if (souveniere.equals("stickers")) {
                    price = 1.25;
                    break;
                } else {
                    isSouveniereValid = false;
                }
                break;
            case "Brazil":
                if (souveniere.equals("flags")) {
                    price = 4.2;
                    break;
                } else if (souveniere.equals("caps")) {
                    price = 8.5;
                    break;
                } else if (souveniere.equals("posters")) {
                    price = 5.35;
                    break;
                } else if (souveniere.equals("stickers")) {
                    price = 1.2;
                    break;
                } else {
                    isSouveniereValid = false;
                }
                break;
            case "Croatia":
                if (souveniere.equals("flags")) {
                    price = 2.75;
                    break;
                } else if (souveniere.equals("caps")) {
                    price = 6.9;
                    break;
                } else if (souveniere.equals("posters")) {
                    price = 4.95;
                    break;
                } else if (souveniere.equals("stickers")) {
                    price = 1.1;
                    break;
                } else {
                    isSouveniereValid = false;
                }
                break;
            case "Denmark":
                if (souveniere.equals("flags")) {
                    price = 3.1;
                    break;
                } else if (souveniere.equals("caps")) {
                    price = 6.5;
                    break;
                } else if (souveniere.equals("posters")) {
                    price = 4.8;
                    break;
                } else if (souveniere.equals("stickers")) {
                    price = 0.9;
                    break;
                } else {
                    isSouveniereValid = false;
                }
                break;
            default:
                isCountryValid = false;
        }
        if (isCountryValid == false) {
            System.out.printf("Invalid country!");

        } else if (isSouveniereValid == false) {
            System.out.printf("Invalid stock!");

        } else if (isCountryValid && isSouveniereValid) {
            System.out.printf("Pepi bought %d %s of %s for %.2f lv.", num, souveniere, country, price * num);

        }
    }
}
