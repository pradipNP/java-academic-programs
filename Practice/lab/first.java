package Practice.lab;

import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String s) {
        super(s);
    }
}
class MinimumBalanceException extends Exception {
    public MinimumBalanceException(String s) {
        super(s);
    }
}
class Account {
    int accountNo;
    String name;
    float balance;
    Account(int accountNo, String name, float balance) throws NegativeNumberException {
        if (accountNo < 0 || name == null || name.isEmpty() || balance < 0) {
            throw new NegativeNumberException("Account number or balance cannot be negative and name cannot be empty");
        }
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
    }
    void deposit(float amount) throws NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException("Amount cannot be negative");
        }
        balance += amount;
    }
    void withdraw(float amount) throws NegativeNumberException, MinimumBalanceException {
        if (amount < 0) {
            throw new NegativeNumberException("Amount cannot be negative");
        }
        if (balance - amount < 500) {
            throw new MinimumBalanceException("Minimum balance should be atleast Rs.500");
        }
        balance -= amount;
    }
}

public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter account no: ");
            int accountNo = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter name: ");
            String name = sc.nextLine();
            
            System.out.print("Enter initial balance: ");
            float balance = sc.nextFloat();
            Account acc = new Account(accountNo, name, balance);

            System.out.println("Enter amount to deposit: ");
            float depositAmount = sc.nextFloat();
            acc.deposit(depositAmount);
            System.out.println("Deposited amount: " + depositAmount);
            System.out.println("Current balance: " + acc.balance);

            System.out.println("Enter amount to withdraw: ");
            float withdrawAmount = sc.nextFloat();
            acc.withdraw(withdrawAmount);
            System.out.println("Withdrew amount: " + withdrawAmount);
            System.out.println("Current balance: " + acc.balance);
        } catch (NegativeNumberException | MinimumBalanceException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
