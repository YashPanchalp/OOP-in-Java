import java.util.ArrayList;
import java.util.List;

interface Result {
    void showResult();
}

class Student {
    String name;
    double marks;

    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    public void display() {
        System.out.println("Student: " + name + ", Marks: " + marks);
    }
}

class BE extends Student implements Result {
    public BE(String name, double marks) {
        super(name, marks);
    }

    @Override
    public void showResult() {
        System.out.println(name + " (BE) has " + (marks >= 50 ? "passed" : "failed"));
    }
}

class ME extends Student implements Result {
    public ME(String name, double marks) {
        super(name, marks);
    }

    @Override
    public void showResult() {
        System.out.println(name + " (ME) has " + (marks >= 50 ? "passed" : "failed"));
    }
}

public class Practical7C {
    public static void main(String[] args) {
        List<Student> beList = new ArrayList<>();
        beList.add(new BE("Yash", 78.5));
        beList.add(new BE("Raghav", 45.0));

        List<Student> meList = new ArrayList<>();
        meList.add(new ME("Mahesh", 82.0));
        meList.add(new ME("Raman", 49.5));

        System.out.println("BE STUDENTS:");
        for (Student student : beList) {
            student.display();
            ((Result) student).showResult();
        }

        System.out.println("\nME STUDENTS:");
        for (Student student : meList) {
            student.display();
            ((Result) student).showResult();
        }
    }
}
