import java.io.*;

interface Place {
    int BlockNo = 0;

    void search();
}

class Student implements Place, Serializable {
    protected int EnrollmentNo;
    protected String Name;

    public void setData(int EnrollmentNo, String Name) {
        this.EnrollmentNo = EnrollmentNo;
        this.Name = Name;
    }

    public void display() {
        System.out.println("Enrollment No: " + EnrollmentNo + ", Name: " + Name);
    }

    public void search() {
        System.out.println("Searching student details...");
    }
}

class BE extends Student {
    private int EntryYear;
    private final int Duration = 4;

    public void setEntryYear(int EntryYear) {
        this.EntryYear = EntryYear;
    }

    public void display() {
        super.display();
        System.out.println("Entry Year: " + EntryYear + ", Duration: " + Duration + " years");
    }
}

class ME extends Student {
    private int EntryYear;
    private final int Duration = 2;

    public void setEntryYear(int EntryYear) {
        this.EntryYear = EntryYear;
    }

    public void display() {
        super.display();
        System.out.println("Entry Year: " + EntryYear + ", Duration: " + Duration + " years");
    }
}

public class Practical6A {
    public static void main(String[] args) {
        BE beStudent = new BE();
        beStudent.setData(6090, "Manav");
        beStudent.setEntryYear(2020);
        beStudent.display();
        beStudent.search();

        ME meStudent = new ME();
        meStudent.setData(6091, "Jatin");
        meStudent.setEntryYear(2022);
        meStudent.display();
        meStudent.search();

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("students.dat"))) {
            out.writeObject(beStudent);
            out.writeObject(meStudent);
            System.out.println("Data saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("students.dat"))) {
            BE loadedBE = (BE) in.readObject();
            ME loadedME = (ME) in.readObject();
            System.out.println("Data loaded from file:");
            loadedBE.display();
            loadedME.display();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
