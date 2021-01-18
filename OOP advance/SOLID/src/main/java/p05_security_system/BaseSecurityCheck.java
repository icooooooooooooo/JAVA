package p05_security_system;

import java.util.Scanner;

public abstract class BaseSecurityCheck implements SecurityCheck{

    @Override
    public abstract boolean validateUser(Scanner scanner);

}
