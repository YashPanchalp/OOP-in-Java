class Number extends Thread {
    private int enrollmentNumber;

    public Number(int enrollmentNumber) {
        this.enrollmentNumber = enrollmentNumber;
    }

    @Override
    public void run() {
        if (enrollmentNumber % 2 == 0) {
            System.out.println("Even Enrollment Number: " + enrollmentNumber);
        } else {
            System.out.println("Odd Enrollment Number: " + enrollmentNumber);
        }
    }

    public static void main(String[] args) {

        Number a1 = new Number(84);
        Number a2 = new Number(85);

        a1.start();
        a2.start();
    }
}
