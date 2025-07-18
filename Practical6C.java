import java.util.Scanner;
import java.util.*;

interface Result {
    double percentage = 0;

    void getMarks();
}

class Student implements Result {
    private double percentage;

    @Override
    public void getMarks() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks for three subjects:");
        double subject1 = scanner.nextDouble();
        double subject2 = scanner.nextDouble();
        double subject3 = scanner.nextDouble();

        percentage = (subject1 + subject2 + subject3) / 3;

        System.out.println("Average Percentage: " + percentage + "%");
    }
}

public class Practical6C {
    public static void main(String[] args) {
        Student student = new Student();
        student.getMarks();
    }
}
