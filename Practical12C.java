import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    String course;

    public Student(int rollNo, String name, String course) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + name + ", Course: " + course;
    }
}

public class Practical12C {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- STUDENT MENU ---");
            System.out.println("1. Add Student Details");
            System.out.println("2. Update Student Details");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student Details");
            System.out.println("5. Show All Students");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll No: ");
                    int rollNo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();
                    students.add(new Student(rollNo, name, course));
                    System.out.println("Student added successfully.");
                    break;

                case 2:
                    System.out.print("Enter Roll No to update: ");
                    int updateRoll = sc.nextInt();
                    sc.nextLine();
                    boolean updated = false;
                    for (Student s : students) {
                        if (s.rollNo == updateRoll) {
                            System.out.print("Enter New Name: ");
                            s.name = sc.nextLine();
                            System.out.print("Enter New Course: ");
                            s.course = sc.nextLine();
                            System.out.println("Student details updated.");
                            updated = true;
                            break;
                        }
                    }
                    if (!updated) {
                        System.out.println("Student not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll No to search: ");
                    int searchRoll = sc.nextInt();
                    boolean found = false;
                    for (Student s : students) {
                        if (s.rollNo == searchRoll) {
                            System.out.println("Student Found: " + s);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Roll No to delete: ");
                    int deleteRoll = sc.nextInt();
                    Iterator<Student> itr = students.iterator();
                    boolean deleted = false;
                    while (itr.hasNext()) {
                        if (itr.next().rollNo == deleteRoll) {
                            itr.remove();
                            System.out.println("Student deleted.");
                            deleted = true;
                            break;
                        }
                    }
                    if (!deleted) {
                        System.out.println("Student not found.");
                    }
                    break;

                case 5:
                    if (students.isEmpty()) {
                        System.out.println("No student records found.");
                    } else {
                        System.out.println("All Student Records:");
                        for (Student s : students) {
                            System.out.println(s);
                        }
                    }
                    break;

                case 0:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);

        sc.close();
    }
}
