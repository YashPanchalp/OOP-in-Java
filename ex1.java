import java.util.*;

class bill {
    static String wel = "Bill of Super Marcket";
    String p_name;
    int items;
    int count;
    double price;
    double total;
    int gst;
    double f_total;

    // bill(String p_name, int items, double price) {
    // this.p_name = p_name;
    // this.items = items;
    // this.price = price;
    // }

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Product name :");
        p_name = sc.next();
        System.out.println("Ente the count of the Product =");
        items = sc.nextInt();
        System.out.println("Enter the Product price =");
        price = sc.nextDouble();
    }

    void display() {
        System.out.println(wel);
    }

    void calculate() {
        total = items * price;
        System.out.println("Selected item :" + p_name);
        System.out.println("No of items =" + items);
        System.out.println("Price of the item =" + price);
        System.out.println("Total amount =" + total);
    }

    void gst() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the gst :");
        gst = sc.nextInt();
        f_total = total + (total * gst);
        System.out.println("After gst total =" + f_total);
    }
}

public class ex1 {
    public static void main(String[] args) {
        bill b1 = new bill();
        b1.input();
        b1.display();
        b1.calculate();
        b1.gst();

    }
}