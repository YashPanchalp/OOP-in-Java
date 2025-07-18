import java.io.FileWriter;
import java.io.IOException;

class Store {

    String item;
    int stock;
    int req;

    public Store(String item, int stock, int req) {

        this.item = item;
        this.stock = stock;
        this.req = req;
    }

    void getItems() throws Exception {

        String result;

        if (stock < req) {

            result = "Not enough " + item + " in stock!" + "Only " + stock + "in the stock " + "while demanded " + req;
            throw new Exception(result);
        } else {
            result = "Purchased " + req + " " + item + "(s).";
            System.out.println(result);
        }

        try {
            FileWriter writer = new FileWriter("prac10.txt");
            writer.write("Result :" + result);
            writer.close();
        } catch (IOException e) {
            System.out.println("Error while writing result :" + e.getMessage());
        }
    }
}

public class Practical10A {
    public static void main(String[] args) {

        Store s1 = new Store("Apples", 10, 5);

        try {
            s1.getItems();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Store s2 = new Store("Bananas", 10, 34);

        try {
            s2.getItems();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}