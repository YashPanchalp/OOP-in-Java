import java.util.Scanner;

import javax.sound.midi.SysexMessage;

interface BankAccounts {

    void deposit(double da);

    void withdraw(double wa);

    void calculate_interest();

    void view_balance();

}

class SavingsAccount implements BankAccounts {

    private double balance;
    private double interest_rate;

    public SavingsAccount(double balance, double interest_rate) {

        this.balance = balance;
        this.interest_rate = interest_rate;
    }

    public void deposit(double da) {

        balance += da;
        System.out.println("Deposited Amount =" + da);
        System.out.println("Updated blance =" + balance);
    }

    public void withdraw(double wa) {

        balance -= wa;
        System.out.println("Withdrawed amount =" + wa);
        System.out.println("Updated blance =" + balance);
    }

    public void calculate_interest() {

        double interest = balance * (interest_rate / 100);
        balance += interest;
        System.out.println("Total interest added =" + interest);
        System.out.println("Updated blance =" + balance);
    }

    public void view_balance() {
        System.out.println("Total Savings Account final balance :" + balance);
    }
}

class CurrentAccount implements BankAccounts {

    private double balance;
    private double interest_rate;

    public CurrentAccount(double balance, double interest_rate) {

        this.balance = balance;
        this.interest_rate = interest_rate;
    }

    public void deposit(double da) {

        balance += da;
        System.out.println("Deposited Amount =" + da);
        System.out.println("Updated blance =" + balance);
    }

    public void withdraw(double wa) {

        balance -= wa;
        System.out.println("Withdrawed amount =" + wa);
        System.out.println("Updated blance =" + balance);
    }

    public void calculate_interest() {

        double interest = balance * (interest_rate / 100);
        balance += interest;
        System.out.println("Total interest added =" + interest);
        System.out.println("Updated blance =" + balance);
    }

    public void view_balance() {
        System.out.println("Total Current Account final balance :" + balance);
        System.out.println("Updated blance =" + balance);
    }
}

public class exam3 {

    public static void main(String[] args) {

        SavingsAccount s = new SavingsAccount(10000, 8);
        s.deposit(5000);
        s.withdraw(4000);
        s.calculate_interest();
        s.view_balance();

        CurrentAccount c = new CurrentAccount(50000, 7);
        c.deposit(10000);
        c.withdraw(2000);
        c.calculate_interest();
        c.view_balance();
    }
}