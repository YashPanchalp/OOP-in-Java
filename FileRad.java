import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRad {
    public static void main(String[] args) {

        try (FileReader r = new FileReader("YASH PHOTO.jpg")) {

            int reader;

            while ((reader = r.read()) != -1) {
                System.out.print(reader);
            }

        }

        catch (Exception e) {
            System.out.println(e);
        }

        try {
            FileWriter w = new FileWriter("temp.txt");

            w.write("Password is 23048");
            w.close();
        }

        catch (IOException e) {
            System.out.println(e);
        }

    }
}