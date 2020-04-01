import java.util.Scanner;

public class Quilting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tables = Integer.parseInt(scanner.nextLine());
        double lenght = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());

        double tableclothareaprice = ((lenght +0.60) * (width+0.60))*7;
        double coversareaprice = (Math.pow((lenght/2),2))*9;

        double priceUSD = tables*(tableclothareaprice+coversareaprice);
        double priceBGN = priceUSD * 1.85;

        System.out.println(String.format("%.2f USD\n%.2f BGN", priceUSD, priceBGN));


        }
    }
