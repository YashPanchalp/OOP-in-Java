public class Prectical2A {
    public static void main(String[] args) {
        int[] numbers = { 9, 10, 154, 174, 407, 501, 1634 };

        System.out.println("Armstrong numbers in the array:");

        for (int num : numbers) {
            int originalNumber = num;
            int sum = 0;
            int digits = String.valueOf(num).length();

            int temp = num;
            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }

            if (sum == originalNumber) {
                System.out.println(num);
            }
        }
    }
}
