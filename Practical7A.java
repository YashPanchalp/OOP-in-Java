import java.util.ArrayList;
import java.util.List;

interface Place {
    void location();
}

class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void display() {
        System.out.println("Product: " + name + ", Price: $" + price);
    }
}

class Crockery extends Product implements Place {
    public Crockery(String name, double price) {
        super(name, price);
    }

    @Override
    public void location() {
        System.out.println(name + " is kept in the kitchen.");
    }
}

class Household extends Product implements Place {
    public Household(String name, double price) {
        super(name, price);
    }

    @Override
    public void location() {
        System.out.println(name + " is kept in the storage room.");
    }
}

class FoodItems extends Product implements Place {
    public FoodItems(String name, double price) {
        super(name, price);
    }

    @Override
    public void location() {
        System.out.println(name + " is stored in the refrigerator.");
    }
}

public class Practical7A {
    public static void main(String[] args) {
        List<Product> crockeryList = new ArrayList<>();
        crockeryList.add(new Crockery("Plate", 5.99));
        crockeryList.add(new Crockery("Cup", 3.49));
        crockeryList.add(new Crockery("Jug", 7.99));

        List<Product> householdList = new ArrayList<>();
        householdList.add(new Household("Broom", 10.99));
        householdList.add(new Household("Mop", 8.49));
        householdList.add(new Household("Bucket", 6.99));

        List<Product> foodItemsList = new ArrayList<>();
        foodItemsList.add(new FoodItems("Apple", 2.99));
        foodItemsList.add(new FoodItems("Milk", 1.49));
        foodItemsList.add(new FoodItems("Bread", 3.29));

        System.out.println("CROCKERY ITEMS:");
        for (Product item : crockeryList) {
            item.display();
            ((Place) item).location();
        }

        System.out.println("\nHOUSEHOLD ITEMS:");
        for (Product item : householdList) {
            item.display();
            ((Place) item).location();
        }

        System.out.println("\nFOOD ITEMS:");
        for (Product item : foodItemsList) {
            item.display();
            ((Place) item).location();
        }
    }
}
