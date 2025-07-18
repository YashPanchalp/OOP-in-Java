import java.util.Scanner;

public class Prectical1C {
    public static void main(String[] args) {
        // input
        Scanner scanner = new Scanner(System.in);

        // Input year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        // Close the scanner
        scanner.close();
    }
}
