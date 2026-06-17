import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Create {
    static void main(String[] args) {

        File file = new File("guestbook.txt");

        try {
            boolean value = file.createNewFile();

            if (value) {
                System.out.println("File is created");
            } else {
                System.out.println("File is not created");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        Scanner k = new Scanner(System.in);
        System.out.println("\nEnter your name: ");
        String name = k.nextLine();
        String linespace = "\n";

        try {

            FileWriter output = new FileWriter("guestbook.txt", true);

            output.write(name);
            output.write(linespace);

            System.out.println("Your name is written to the file");

            output.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
