class CustomerB extends Thread {
    private String customerName;
    private String bankName;
    private int withdrawAmount;
    private static int accountBalance = 1000;
    private static final Object lock = new Object();

    public CustomerB(String customerName, String bankName, int withdrawAmount) {
        this.customerName = customerName;
        this.bankName = bankName;
        this.withdrawAmount = withdrawAmount;
    }

    @Override
    public void run() {
        withdraw();
    }

    public void withdraw() {
        synchronized (lock) {
            System.out.println(customerName + " is trying to withdraw Rs." + withdrawAmount + " from " + bankName);
            if (withdrawAmount <= accountBalance) {
                System.out.println("Transaction approved for " + customerName);
                accountBalance -= withdrawAmount;
                System.out.println(customerName + " successfully withdrew Rs." + withdrawAmount);
                System.out.println("Remaining Balance: Rs." + accountBalance);
            } else {
                System.out.println("Transaction failed for " + customerName + ". Insufficient balance.");
            }
        }
    }

    public static void main(String[] args) {
        CustomerB c1 = new CustomerB("Yash Panchal", "HDFC", 600);
        CustomerB c2 = new CustomerB("Jaimin", "State Bank", 1500);

        c1.start();
        c2.start();
    }
}
