import java.util.Scanner;

public class Landscape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double area = Double.parseDouble(scanner.nextLine());
        Double price = 7.61;
        Double discount = 0.18;

        Double Totalprice = area*price;
        Double discountsum = Totalprice*discount;
        Double discountedprice = Totalprice - discountsum;

        System.out.println(String.format("The final price is %.2flv.", discountedprice));
        System.out.println(String.format("The discount is %.2flv.", discountsum));

    }
}
