interface Shape {
    void calculateArea();

    void calculatePerimeter();
}

class Circle implements Shape {

    double radius;

    void setradius(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {

        double area = Math.PI * radius * radius;

        System.out.println("Area of circle =" + area);

    }

    public void calculatePerimeter() {

        double peri = 2 * Math.PI * radius;
        System.out.println("Perifer of the circle =" + peri);

    }
}

class Triangle implements Shape {

    double s1;
    double base;
    double s3;
    double h;

    void setdata(double s1, double base, double s3, double h) {
        this.s1 = s1;
        this.base = base;
        this.s3 = s3;
        this.h = h;
    }

    public void calculateArea() {

        double area = 0.5 * base * h;

        System.out.println("Area of triangle =" + area);
    }

    public void calculatePerimeter() {

        double perimeter = s1 + base + s3;

        System.out.println("Perimter of the triangle =" + perimeter);
    }
}

public class exam2 {

    public static void main(String[] args) {

        Circle c = new Circle();
        c.setradius(45.50);
        c.calculateArea();
        c.calculatePerimeter();

        Triangle t = new Triangle();
        t.setdata(10.0, 2.00, 4.20, 4.54);
        t.calculateArea();
        t.calculatePerimeter();
    }

}