import java.util.InputMismatchException;
import java.util.Scanner;

public class EXCEPTION {

    public static void main(String[] args) {

        try {
            // ArithmaticExcpetion
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);

        } catch (ArithmeticException e) {

            System.out.println("Can't Divide by zero!");
        }

        // ArayyIndexOutOfBounds
        try {
            int[] arr = { 1, 2, 3 };
            int temp = arr[5];
            System.out.println(temp);
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Try to acess another element");
        }

        // NullPointerException

        try {
            String str = null;
            int length = str.length();
            System.out.println(length);
        } catch (NullPointerException e) {

            System.out.println("Cannot found length for emty string");
        }

        // NumberFormatException

        try {
            String s = "acv";
            int x = Integer.parseInt(s);
            System.out.println(x);
        } catch (NumberFormatException e) {
            System.out.println("String not contain int");
        }

        // InputMismatchException

        try {
            Scanner sc = new Scanner(System.in);

            int a = sc.nextInt();
            System.out.println(a);
        } catch (InputMismatchException e) {

            System.out.println("Enter the input of interger only ");
        }

        try {
            int age = -1;
            if (age < 0) {
                throw new IllegalArgumentException("Age is not negatuve");
            }
        } finally {

        }

    }

}
