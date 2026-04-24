package Day11nd12;
import java.util.Scanner;

class Account {
    private double balance;

    Account(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    void debit(double amount) {
        if (amount > balance) {
            System.out.println("Debit amount exceeded account balance.");
        } else {
            balance = balance - amount;
            System.out.println("Debit successful.");
        }
    }

    double getBalance() {
        return balance;
    }
}

public class AccountTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account account = new Account(5000);

        System.out.println("Current Balance: " + account.getBalance());

        System.out.print("Enter debit amount: ");
        double amount = sc.nextDouble();

        account.debit(amount);

        System.out.println("Final Balance: " + account.getBalance());

        sc.close();
    }
}