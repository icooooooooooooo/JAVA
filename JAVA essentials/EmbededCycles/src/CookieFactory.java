import java.util.Scanner;

public class CookieFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int batch = Integer.parseInt(scanner.nextLine());
        int flour = 0;
        int eggs = 0;
        int sugar = 0;

        for (int i = 1; i <= batch; i++) {

            String ingridient = scanner.nextLine();


            while ((!ingridient.equals("Bake!"))) {
                switch (ingridient) {
                    case "flour":
                        flour++;
                        break;
                    case "eggs":
                        eggs++;
                        break;
                    case "sugar":
                        sugar++;
                        break;
                }

                ingridient = scanner.nextLine();
            }
            if (ingridient.equals("Bake!")) {
                if (sugar != 0 && eggs != 0 && flour != 0) {
                    sugar--;
                    eggs--;
                    flour--;
                    System.out.printf("Baking batch number %d...\n",i);
                } else {
                    i--;
                    System.out.printf("The batter should contain flour, eggs and sugar!");
                }

            }

        }
    }

}
