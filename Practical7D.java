import java.util.ArrayList;
import java.util.Scanner;

interface Bill {
    void showBill();
}

class Product {
    String name;
    double mrp;
    int quant;

    public Product(String name, double mrp, int quant) {
        this.name = name;
        this.mrp = mrp;
        this.quant = quant;
    }

    public Product(String name2, double price) {
        // TODO Auto-generated constructor stub
    }

    public void display() {
        System.out.println("Name of the product :" + name);
        System.out.println();
        System.out.println("MRP for" + name + "(of 1)=" + mrp);
        System.out.println();
        System.out.println("Quantitiy =" + quant);
        System.out.println();
    }
}

class Grocery extends Product implements Bill {

    double mrp1;

    public Grocery(String name, double mrp, int quant) {
        super(name, mrp, quant);
    }

    public void showBill() {

        mrp1 = (mrp * 0.18 + mrp) * quant;
        System.out.println(" Final amount =" + mrp * quant + "+" + (mrp * 0.18) * quant + " GST" + "=" + mrp1);
    }
}

class Cloths extends Product implements Bill {

    double mrp2;

    public Cloths(String name, double mrp, int quant) {
        super(name, mrp, quant);
    }

    public void showBill() {
        mrp2 = (mrp + mrp * 0.18 + mrp * 0.05) * quant;

        System.out.println(" Fianal Amount =" + mrp * quant + "+" + (mrp * 0.18) * quant + "GST" + (mrp * 0.05) * quant
                + " C-GST" + "=" + mrp2);
    }

}

class BeautyP extends Product implements Bill {

    double mrp2;

    public BeautyP(String name, double mrp, int quant) {
        super(name, mrp, quant);
    }

    public void showBill() {
        mrp2 = (mrp + mrp * 0.18 + mrp * 0.05 + mrp * 0.05) * quant;

        System.out.println(" Fianal Amount =" + mrp * quant + "+" + (mrp * 0.18) * quant + "GST" + (mrp * 0.05) * quant
                + " C-GST" + (mrp * 0.05) * quant + "S-GST" + "=" + mrp2);
    }

}

public class Practical7D {
    public static void main(String args[]) {

        System.out.println("------------ SUPER MARCKET BILL ---------");
        ArrayList<Product> glist = new ArrayList<>();
        glist.add(new Grocery("Wheat Flour", 1500, 5));
        glist.add(new Grocery("Refined Oil", 2800, 1));
        glist.add(new Grocery("Moong Dal", 70, 2));
        glist.add(new Grocery("Sunfeast Biscuits", 35, 3));
        glist.add(new Grocery("Detto Soap", 40, 6));

        ArrayList<Product> clist = new ArrayList<>();
        clist.add(new Cloths("T-shirt", 700, 1));
        clist.add(new Cloths("Jeans", 1000, 3));
        clist.add(new Cloths("Shirts", 1200, 2));
        clist.add(new Cloths("Cotton pants", 1250, 3));

        ArrayList<Product> blist = new ArrayList<>();
        blist.add(new BeautyP("Make up", 1450, 1));
        blist.add(new BeautyP("Foundation", 760, 2));
        blist.add(new BeautyP("Lip stick", 450, 3));

        System.out.println();
        System.out.println(" -----> Grocery Products:");
        for (Product p : glist) {
            p.display();
            ((Bill) p).showBill();
        }

        System.out.println();
        System.out.println();
        System.out.println(" -------> Cloths:");
        for (Product p : clist) {
            p.display();
            ((Bill) p).showBill();
        }

        System.out.println();
        System.out.println();
        System.out.println(" ------------> Beauty Products:");
        System.out.println();

        for (Product p : blist) {
            p.display();
            ((Bill) p).showBill();
        }

    }
}
