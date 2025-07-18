import java.util.ArrayList;
import java.util.List;

interface Branch {
    void branchDetails();
}

class Account {
    String accountHolder;
    double balance;

    public Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void display() {
        System.out.println("Account Holder: " + accountHolder + ", Balance: $" + balance);
    }
}

class Savings extends Account implements Branch {
    public Savings(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public void branchDetails() {
        System.out.println(accountHolder + "'s savings account is in the main branch.");
    }
}

class Current extends Account implements Branch {
    public Current(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public void branchDetails() {
        System.out.println(accountHolder + "'s current account is in the city branch.");
    }
}

public class Practical7B {
    public static void main(String[] args) {
        List<Account> savingsList = new ArrayList<>();
        savingsList.add(new Savings("Yash", 8000.00));
        savingsList.add(new Savings("Aman", 7000.50));
        savingsList.add(new Savings("Manvir", 8000.75));

        List<Account> currentList = new ArrayList<>();
        currentList.add(new Current("Rahul", 12000.00));
        currentList.add(new Current("Ramesh", 15000.30));
        currentList.add(new Current("Raghav", 17000.80));

        System.out.println("SAVINGS ACCOUNTS:");
        for (Account acc : savingsList) {
            acc.display();
            ((Branch) acc).branchDetails();
        }

        System.out.println("\nCURRENT ACCOUNTS:");
        for (Account acc : currentList) {
            acc.display();
            ((Branch) acc).branchDetails();
        }
    }
}
