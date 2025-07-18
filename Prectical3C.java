class Student {
    static int EnrollmentNo;
    String Name;

    public void setdata(int enrollmentNo, String name) {
        EnrollmentNo = enrollmentNo;
        this.Name = name;
    }

    public void display() {
        System.out.println("Enrollment No: " + EnrollmentNo);
        System.out.println("Student Name: " + Name);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setdata(85, "Yash Panchal");
        s1.display();

        Student s2 = new Student();
        s2.setdata(100, "Rahul");
        s2.display();

    }
}
