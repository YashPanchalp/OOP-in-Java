public class Practical5A {
    double MRP;
    int QUANTITY;

    public void setdata(double mrp, int quantity) {
        this.MRP = mrp;
        this.QUANTITY = quantity;
    }

    public void display() {
        System.out.println("MRP: " + MRP);
        System.out.println("Quantity: " + QUANTITY);
    }

    // Main method for testing
    public static void main(String[] args) {
        Practical5A p1 = new Practical5A();
        p1.setdata(1000, 1);
        p1.display();
    }
}
