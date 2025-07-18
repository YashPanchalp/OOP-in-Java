class Store {

    public void getItems(String item, int stock, int req) throws Exception {

        if (stock < req) {
            throw new Exception(
                    "Not enough " + item + " in stock!" + "Only " + stock + "in the stock " + "while demanded " + req);
        } else {
            System.out.println("Purchased " + req + " " + item + "(s).");
        }
    }
}

public class Practical9A {

    public static void main(String[] args) {

        Store s = new Store();

        try {
            s.getItems("Ice creames", 25, 30);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            s.getItems("Cold drink", 15, 10);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
