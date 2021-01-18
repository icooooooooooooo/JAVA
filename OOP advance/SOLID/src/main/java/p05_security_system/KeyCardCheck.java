package p05_security_system;

import java.util.Scanner;

public class KeyCardCheck extends BaseSecurityCheck implements SecurityKey {


    public KeyCardCheck() {

    }

    @Override
    public boolean validateUser(Scanner scanner) {
        String code = this.requestKeyCard(scanner);

        return isValid(code);
    }

    private boolean isValid(String code) {
        return true;
    }

    @Override
    public String requestKeyCard(Scanner scanner) {
        System.out.println("slide your key card");
        return scanner.nextLine();
    }
}
