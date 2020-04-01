import java.util.Scanner;

public class OldLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lookedForBook = scanner.nextLine();
        int capacity = Integer.parseInt(scanner.nextLine());
        String currentBook = scanner.nextLine();

        int checkedBooks = 0;
        boolean foundBook = true;

        while (!lookedForBook.equals(currentBook)) {
            checkedBooks++;
            if (capacity==checkedBooks) {
                foundBook=false;
                break;
            }
            currentBook = scanner.nextLine();
        }
        if (foundBook) {
            System.out.println(String.format("You checked %d books and found it",checkedBooks));
        } else {
            System.out.printf("The book you search is not here!\nYou checked %d books.",checkedBooks);
        }
    }
}
