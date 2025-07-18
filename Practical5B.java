class Account {
    protected int Ac_No;
    protected String Name;
    protected double Balance;

    public void setData(int Ac_No, String Name, double Balance) {
        this.Ac_No = Ac_No;
        this.Name = Name;
        this.Balance = Balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            Balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void display() {
        System.out.println("Account No: " + Ac_No + ", Name: " + Name + ", Balance: " + Balance);
    }
}

class Savings extends Account {
}

class Current extends Account {
}

public class Practical5B {
    public static void main(String[] args) {
        Savings savings = new Savings();
        savings.setData(101, "Alice", 5000.0);
        savings.deposit(1500.0);
        savings.display();

        Current current = new Current();
        current.setData(102, "Bob", 10000.0);
        current.deposit(3000.0);
        current.display();
    }
}
