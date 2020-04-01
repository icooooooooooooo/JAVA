import java.util.Scanner;

public class PassCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Gosho = "Gosho";
        String Pesho = "Ivi";
        String passgosho = "password1!";
        String passpesho = "passwordtaina";
        System.out.println("Please enter your username");
        String username = scanner.nextLine();
        System.out.println("Please enter your password");
        String password = scanner.nextLine();

        if (username.equals(Gosho) && password.equals(passgosho)){
            System.out.println("Welcome, Gosho!");
        } else if (username.equals(Pesho) && password.equals(passpesho)){
            System.out.println("Welcome, Ivi!");
        } else {
            System.out.println("Invalid password or username");
        }
    }
}
