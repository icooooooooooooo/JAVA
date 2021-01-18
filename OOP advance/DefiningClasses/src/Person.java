import java.util.ArrayList;
import java.util.List;

public class Person {


    private String name;
    private int age;
    private List<BankAccount2> accounts;

    //The class should have constructors:
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.accounts = new ArrayList<>();
    }

    public Person(String name, int age, BankAccount2 account) {
        this.name = name;
        this.age = age;
        this.accounts.add(account);
    }

    public double getBalance() {
        return this.accounts.stream().mapToDouble(x -> x.getBalance()).sum();
    }

}
