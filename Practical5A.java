class Product {
    protected double MRP;
    protected int QUANTITY;

    public void setData(double MRP, int QUANTITY) {
        this.MRP = MRP;
        this.QUANTITY = QUANTITY;
    }

    public void display() {
        System.out.println("MRP: " + MRP + ", Quantity: " + QUANTITY);
    }
}

class Crockery extends Product {
}

class Household extends Product {
}

class FoodItems extends Product {
}

public class Practical5A {
    public static void main(String[] args) {
        Crockery crockery = new Crockery();
        crockery.setData(500.0, 10);
        crockery.display();

        Household household = new Household();
        household.setData(1200.0, 5);
        household.display();

        FoodItems foodItems = new FoodItems();
        foodItems.setData(200.0, 20);
        foodItems.display();
    }
}
