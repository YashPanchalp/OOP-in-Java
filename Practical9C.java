import java.util.ArrayList;
import java.util.Scanner;

class Student {
    void searchStudent(String name, ArrayList<String> names) throws Exception {
        for (String s : names) {
            if (s.equalsIgnoreCase(name)) {
                System.out.println("Student " + s + " is Persent!");
                break;
            } else {
                throw new Exception("Student with name '" + name + "' not found!");
            }
        }
    }
}

public class Practical9C {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students in the class:");
        int n = sc.nextInt();

        ArrayList<String> studentNames = new ArrayList<>();
        studentNames.add("Yash");
        studentNames.add("Harshad");
        studentNames.add("Ramesh");

        Student s = new Student();

        try {
            s.searchStudent("Yash", studentNames);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
