package p05_security_system;

import java.util.Scanner;

public class PinCodeCheck extends BaseSecurityCheck implements SecurityPIN{

    public PinCodeCheck() {

    }

    @Override
    public boolean validateUser(Scanner scanner) {
        int pin = this.requestPinCode(scanner);
        if (isValid(pin)) {
            return true;
        }

        return false;
    }

    private boolean isValid(int pin) {
        return true;
    }

    @Override
    public int requestPinCode(Scanner scanner) {
        System.out.println("enter your pin code");
        return Integer.parseInt(scanner.nextLine());
    }

}
