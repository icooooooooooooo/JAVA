package p05_security_system;

import java.util.Scanner;

public class SecurityManager {

    private SecurityCheck keyCardCheck;
    private SecurityCheck pinCodeCheck;
    private Scanner scanner;

    public SecurityManager(SecurityCheck keyCardCheck, SecurityCheck pinCodeCheck, Scanner scanner) {
        this.keyCardCheck = keyCardCheck;
        this.pinCodeCheck = pinCodeCheck;
        this.scanner = scanner;
    }

    public void check() {

        int option = Integer.parseInt(this.scanner.nextLine());
        switch (option) {
            case 1:
                System.out.println(keyCardCheck.validateUser(this.scanner));
                break;
            case 2:
                System.out.println(pinCodeCheck.validateUser(this.scanner));
                break;
        }
    }


}
