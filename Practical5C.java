class Student {
    protected int EnrollmentNo;
    protected String Name;

    public void setData(int EnrollmentNo, String Name) {
        this.EnrollmentNo = EnrollmentNo;
        this.Name = Name;
    }

    public void display() {
        System.out.println("Enrollment No: " + EnrollmentNo + ", Name: " + Name);
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

public class Practical5C {
    public static void main(String[] args) {
        BE beStudent = new BE();
        beStudent.setData(6085, "Yash Panchal");
        beStudent.setEntryYear(2023);
        beStudent.display();

        ME meStudent = new ME();
        meStudent.setData(6086, "Rahuil");
        meStudent.setEntryYear(2022);
        meStudent.display();
    }
}