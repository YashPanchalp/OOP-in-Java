class product2 {
    String name;
    double price;
    int quantity;

    public product2() {
        System.out.println("Welcome to Super-Market.");
    }

    public product2(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void display() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }

    public static void main(String[] args) {
        new Practical5A();

        if (args.length < 3) {
            System.out.println("Enter Product Name, Price, and Quantity as command-line arguments.");
            return;
        }

        product2 p = new product2(args[0], Double.parseDouble(args[1]), Integer.parseInt(args[2]));
        p.display();
    }
}
