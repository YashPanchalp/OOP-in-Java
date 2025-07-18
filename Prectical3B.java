import java.util.Scanner;

class Account {
    int Ac_No;
    String Name;
    double Balance;

    public void setdata(int acNo, String name, double balance) {
        this.Ac_No = acNo;
        this.Name = name;
        this.Balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            Balance += amount;
            System.out.println("Amount Deposited Successfully!");
        } else {
            System.out.println("Invalid Deposit Amount!");
        }
    }

    public void display() {
        System.out.println("Account Number: " + Ac_No);
        System.out.println("Account Holder: " + Name);
        System.out.println("Balance: " + Balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Account acc1 = new Account();

        System.out.print("Enter Account Number: ");
        int acNo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = scanner.nextDouble();

        acc1.setdata(acNo, name, balance);
        acc1.display();

        System.out.print("Enter amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        acc1.deposit(depositAmount);
        acc1.display();

        scanner.close();
    }
}
