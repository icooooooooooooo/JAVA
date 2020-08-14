public class BankAccount2 {
    private static final double DEFAULT_INTEREST = 0.02;
    private static int bankAccountCount;

    private int id;
    private double balance;
    private double rate = DEFAULT_INTEREST;

    public BankAccount2() {
        this.id = ++bankAccountCount;
    }

    public double getInterest(int years) {
        return this.balance * years * rate;
    }

    public void setInterest(double amount) {
        this.balance += amount;
    }

    @Override
    public String toString() {
        return "ID"+this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposite(double amount) {
        if (amount >= 0) {
            this.balance += amount;
        } else {
            // return exception
        }
    }
    //•	deposit(double amount): void
}
