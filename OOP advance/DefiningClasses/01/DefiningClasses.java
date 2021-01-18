import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class DefiningClasses {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, BankAccount> accoutns = new HashMap<>();

        String input = scan.readLine();
        while (!"End".equals(input)) {
            BankAccount account = new BankAccount();
            String[] raw = input.split("\\s+");
            String command = raw[0];
            int accountId = Integer.parseInt(raw[1]);

            switch (command) {
                case "Create":
                    if (!accoutns.containsKey(accountId)) {
                        account.setId(accountId);
                        accoutns.put(accountId, account);
                    } else {
                        System.out.println("Account already exists");
                    }
                    return;
                case "Deposit":
                    double deposit = Double.parseDouble(raw[2]);
                    if (accoutns.containsKey(accountId)) {
                        double balance = accoutns.get(accountId).getBalance();
                        if (balance + deposit >= balance) {
                            accoutns.get(accountId).makeDeposit(deposit);
                        }
                    } else {
                        System.out.println("Account does not exist");
                    }

                    return;
                case "Withdraw":
                    double withdraw = Double.parseDouble(raw[2]);
                    if (accoutns.containsKey(accountId)) {
                        double balance = accoutns.get(accountId).getBalance();
                        if (balance - withdraw >= 0) {
                            accoutns.get(accountId).makeWithdraw(withdraw);
                        }
                    } else {
                        System.out.println("Account does not exist");
                    }

                    return;
                case "Print":
                    if (accoutns.containsKey(accountId)) {
                        System.out.println(
                                String.format("Account ID%d, balance %.2f"
                                        , accoutns.get(accountId).getId()
                                        , accoutns.get(accountId).getBalance()));
                    } else {
                        System.out.println("Account does not exist");
                    }
                    return;
            }
            input = scan.readLine();
        }
    }
}
