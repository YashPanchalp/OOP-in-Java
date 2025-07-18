import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Product {
    String name;
    double mrp;
    int quantity;

    public Product(String name, double mrp, int quantity) {
        this.name = name;
        this.mrp = mrp;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product Name: " + name + ", MRP: ₹" + mrp + ", Quantity: " + quantity;
    }
}

class Customer extends Thread {
    String customerName;
    String productName;
    static ArrayList<Product> productList;
    static Scanner sc;

    public Customer(String customerName, String productName, ArrayList<Product> products) {
        this.customerName = customerName;
        this.productName = productName;
        productList = products;
    }

    @Override
    public void run() {
        synchronized (productList) {
            for (Product p : productList) {
                if (p.name.equalsIgnoreCase(productName)) {
                    if (p.quantity > 0) {
                        p.quantity--;
                        System.out.println(customerName + " bought 1 unit of " + productName);
                        return;
                    } else {
                        System.out.println("Sorry " + customerName + ", " + productName + " is out of stock.");
                        return;
                    }
                }
            }
            System.out.println(productName + " not found.");
        }
    }
}

public class Practical12A {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Set MRP and Quantity for Product");
            System.out.println("2. Buy Product");
            System.out.println("3. Search Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Show All Products");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter MRP: ");
                    double mrp = sc.nextDouble();
                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();
                    products.add(new Product(name, mrp, qty));
                    System.out.println("Product added successfully!");
                    break;

                case 2:
                    System.out.print("Enter customer name: ");
                    String customerName = sc.nextLine();
                    System.out.print("Enter product name to buy: ");
                    String productToBuy = sc.nextLine();
                    Customer c = new Customer(customerName, productToBuy, products);
                    c.start();
                    try {
                        c.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;

                case 3:
                    System.out.print("Enter product name to search: ");
                    String searchName = sc.nextLine();
                    boolean found = false;
                    for (Product p : products) {
                        if (p.name.equalsIgnoreCase(searchName)) {
                            System.out.println("Found: " + p);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Product not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter product name to delete: ");
                    String deleteName = sc.nextLine();
                    Iterator<Product> iterator = products.iterator();
                    boolean deleted = false;
                    while (iterator.hasNext()) {
                        if (iterator.next().name.equalsIgnoreCase(deleteName)) {
                            iterator.remove();
                            deleted = true;
                            System.out.println("Product deleted.");
                            break;
                        }
                    }
                    if (!deleted) {
                        System.out.println("Product not found.");
                    }
                    break;

                case 5:
                    if (products.isEmpty()) {
                        System.out.println("No products stored.");
                    } else {
                        System.out.println("Stored Products:");
                        for (Product p : products) {
                            System.out.println(p);
                        }
                    }
                    break;

                case 0:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 0);

        sc.close();
    }
}
