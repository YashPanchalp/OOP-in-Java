
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

class Student {

    String name;
    ArrayList<String> names;

    String result;

    public Student(String name, ArrayList<String> names) {
        this.name = name;
        this.names = names;
    }

    void searchStudent() throws Exception {

        for (String s : names) {
            if (s.equalsIgnoreCase(name)) {
                result = "Student " + s + " is Persent!";
                System.out.println(result);
                break;
            } else {
                result = "Student with name '" + name + "' not found!";
                throw new Exception(result);
            }
        }

        try {
            FileWriter writer = new FileWriter("practical10c.txt");
            writer.write(result);
            writer.close();
        } catch (Exception e) {
            System.out.println("Error while writing file:" + e.getMessage());
        }
    }
}

public class Practical10C {
    public static void main(String[] args) {

        final Scanner sc;
        sc = new Scanner(System.in);

        System.out.print("Enter the number of students in the class:");
        int n = sc.nextInt();

        // or just simply add the names without input
        ArrayList<String> studentNames = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the Student" + (i + 1) + " name :");
            String s = sc.next();
            studentNames.add(s);
        }

        Student s = new Student("Yash", studentNames);

        try {
            s.searchStudent();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
