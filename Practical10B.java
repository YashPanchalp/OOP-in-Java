import java.io.FileWriter;

class Bank {

    double w_amount;
    double balance;

    public Bank(double w_amount, double balance) {

        this.w_amount = w_amount;
        this.balance = balance;

    }

    void withdraw() throws Exception {

        String result;

        if (balance < w_amount) {
            result = "Amount withdraw Request Denied ! Insufficent balance " + balance;
            throw new Exception(result);
        } else {
            result = "Amount Withdrawed Sucessfully ! Balance = " + (balance - w_amount);
            System.out.println(result);
        }

        try {
            FileWriter writer = new FileWriter("practical10b.txt");
            writer.write(result);
            writer.close();
        } catch (Exception e) {
            System.out.println("Error in file writing :" + result);
        }
    }
}

public class Practical10B {
    public static void main(String[] args) {

        Bank bank = new Bank(2000, 1300);

        try {
            bank.withdraw();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Bank bank2 = new Bank(2000, 4000);
        try {
            bank2.withdraw();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}