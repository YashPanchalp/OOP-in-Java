import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class BankAccount {
    int acNo;
    String name;
    double balance;

    public BankAccount(int acNo, String name, double balance) {
        this.acNo = acNo;
        this.name = name;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account No: " + acNo + ", Name: " + name + ", Balance: ₹" + balance;
    }
}

class Customer extends Thread {
    int acNo;
    double amount;
    ArrayList<BankAccount> accounts;

    public Customer(int acNo, double amount, ArrayList<BankAccount> accounts) {
        this.acNo = acNo;
        this.amount = amount;
        this.accounts = accounts;
    }

    @Override
    public void run() {
        synchronized (accounts) {
            boolean found = false;
            for (BankAccount acc : accounts) {
                if (acc.acNo == acNo) {
                    found = true;
                    if (acc.balance >= amount) {
                        acc.balance -= amount;
                        System.out.println("Withdrawal of ₹" + amount + " successful from A/C No " + acNo);
                    } else {
                        System.out.println("Insufficient Balance in A/C No " + acNo);
                    }
                    break;
                }
            }
            if (!found) {
                System.out.println("Account number " + acNo + " not found.");
            }
        }
    }
}

public class Practical12B {
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- BANK MENU ---");
            System.out.println("1. Set Account Details");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Search Account");
            System.out.println("4. Delete Account");
            System.out.println("5. Show All Accounts");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    int acNo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Account Holder Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Initial Balance: ");
                    double balance = sc.nextDouble();
                    accounts.add(new BankAccount(acNo, name, balance));
                    System.out.println("Account created successfully.");
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    int withdrawAc = sc.nextInt();
                    System.out.print("Enter Amount to Withdraw: ");
                    double amount = sc.nextDouble();
                    Customer customer = new Customer(withdrawAc, amount, accounts);
                    customer.start();
                    try {
                        customer.join(); // wait for thread to finish
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;

                case 3:
                    System.out.print("Enter Account Number to Search: ");
                    int searchAc = sc.nextInt();
                    boolean found = false;
                    for (BankAccount acc : accounts) {
                        if (acc.acNo == searchAc) {
                            System.out.println("Account Found: " + acc);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Account not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Account Number to Delete: ");
                    int delAc = sc.nextInt();
                    Iterator<BankAccount> itr = accounts.iterator();
                    boolean deleted = false;
                    while (itr.hasNext()) {
                        if (itr.next().acNo == delAc) {
                            itr.remove();
                            System.out.println("Account deleted.");
                            deleted = true;
                            break;
                        }
                    }
                    if (!deleted) {
                        System.out.println("Account not found.");
                    }
                    break;

                case 5:
                    if (accounts.isEmpty()) {
                        System.out.println("No accounts stored.");
                    } else {
                        System.out.println("Stored Accounts:");
                        for (BankAccount acc : accounts) {
                            System.out.println(acc);
                        }
                    }
                    break;

                case 0:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);

        sc.close();
    }
}
