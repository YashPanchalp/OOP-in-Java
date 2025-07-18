public class Prectical4B {
    String accNo;
    String name;
    double balance;

    public Prectical4B() {
        System.out.println("Welcome to Bank.");
    }

    public Prectical4B(String accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    public void display() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        new Prectical4B();

        if (args.length < 3) {
            System.out.println("Enter Account Number, Name, and Balance as command-line arguments.");
            return;
        }

        Prectical4B acc = new Prectical4B(args[0], args[1], Double.parseDouble(args[2]));
        acc.display();
    }
}
