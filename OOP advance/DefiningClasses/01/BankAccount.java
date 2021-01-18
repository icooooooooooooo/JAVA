public class BankAccount {
    private int idCounter = 0;
    private int id;
    private double balance;

    public String toString() {
        return String.format("Account ID%d, balance %.2f", this.id, this.balance);
    }

    public String toStringAccBalance() {
        return String.format("Account has balance of %.2f", this.balance);
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public void makeDeposit(double deposit) {
        if (deposit + this.balance >= this.balance) {
            this.balance += deposit;
        } else {
        }

    }

    public void makeWithdraw(double withdraw) {
        if (this.balance - withdraw >= 0) {
            this.balance -= withdraw;
        } else {

        }
    }

}
