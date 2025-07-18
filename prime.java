public class prime {

    public static void main(String args[]) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, };

        for (int n : arr) {

            if (n <= 1) {

                continue;
            }

            for (int i = 2; i < n * n; i++) {

                if (n % i != 0) {
                    System.out.println(n + " ");
                    break;
                }
            }

        }
    }

}
