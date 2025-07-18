class Student2 {
    String enrollmentNo;
    String name;

    public Student2() {
        System.out.println("Welcome to Student-Information System.");
    }

    public Student2(String enrollmentNo, String name) {
        this.enrollmentNo = enrollmentNo;
        this.name = name;
    }

    public void display() {
        System.out.println("Enrollment No: " + enrollmentNo);
        System.out.println("Student Name: " + name);
    }
}

public class Prectical4C {
    public static void main(String[] args) {
        new Student2();

        if (args.length < 2) {
            System.out.println("Enter Enrollment Number and Name as command-line arguments.");
            return;
        }

        Student2 s = new Student2(args[0], args[1]);
        s.display();
    }
}
