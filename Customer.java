public class Customer extends Thread {
    private String customerName;
    private String productName;
    private static int productQuantity = 1;
    private static final Object lock = new Object();

    public Customer(String customerName, String productName) {
        this.customerName = customerName;
        this.productName = productName;
    }

    @Override
    public void run() {
        buyProduct();
    }

    public void buyProduct() {
        synchronized (lock) {
            if (productQuantity > 0) {
                System.out.println(customerName + " is buying " + productName);
                productQuantity--;
                System.out.println(customerName + " successfully bought the " + productName);
            } else {
                System.out.println(customerName + " tried to buy " + productName + " but it's out of stock.");
            }
        }
    }

    public static void main(String[] args) {
        Customer c1 = new Customer("Yash Panchal", "Mobile");
        Customer c2 = new Customer("Shubham", "Mobile");

        c1.start();
        c2.start();
    }
}
