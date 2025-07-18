import java.util.Arrays;

public class Prectical2B {
    public static void main(String[] args) {
        String[] words = { "Bombay", "Ahmedabad", "Hydrabad", "Chennai", "Indore" };
        System.out.println("Before Sorting: " + Arrays.toString(words));

        int n = words.length;
        String temp;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (words[j].compareTo(words[j + 1]) > 0) {
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                    temp = words[j];
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }

        System.out.println("After Sorting: " + Arrays.toString(words));
    }
}
