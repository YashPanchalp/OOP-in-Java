class Student {

    private String name;
    private int en_no;

    void setName(String name) {

        this.name = name;
    }

    void setEn(int en_no) {

        this.en_no = en_no;
    }

    String getName() {

        return this.name;
    }

    int getEn() {
        return this.en_no;
    }
}

public class abstraction {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setName("Yash");
        s1.setEn(85);
        System.out.println("The Stuent name is " + s1.getName() + " and Enrollment no:" + s1.getEn());

    }
}
