class Bank {

    void withdraw(double w_amount, double balance) throws Exception {

        if (balance < w_amount) {
            throw new Exception("Amount withdraw Request Denied ! Insufficent balance " + balance);
        } else {
            System.out.println("Amount Withdrawed Sucessfully ! Balance = " + (balance - w_amount));
        }
    }
}

public class Practical9B {
    public static void main(String[] args) {

        Bank bank = new Bank();

        try {
            bank.withdraw(2000, 1300);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            bank.withdraw(2500, 4280);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}