import java.util.Scanner;

public class BuildingFloors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int allFloors = Integer.parseInt(scanner.nextLine());
        int spaces = Integer.parseInt(scanner.nextLine());

        for (int f = allFloors; f > 0; f--) { //floor = f
            for (int a = 0; a <= spaces; a++) { //spaces = a
                if (f == allFloors) {
                    System.out.print("L" + f + a +" ");

                } else if (f%2!=0) {
                    System.out.print("A" + f + a + " ");

                } else {
                    System.out.printf("O%d%d ",f,a);
                }
            }
            System.out.println();
        }
    }
}
