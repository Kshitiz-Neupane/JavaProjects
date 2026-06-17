import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ConfigLoader {

    // try reading config file
    public void readConfig() throws FileNotFoundException {
        File file = new File("config.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }

        sc.close();
    }

    // create default config file
    public void createDefaultConfig() {
        try {
            FileWriter writer = new FileWriter("config.txt");

            writer.write("app_mode=default\n");
            writer.write("version=1.0\n");
            writer.write("theme=light\n");

            writer.close();

            System.out.println("Default config file created.");

        } catch (Exception e) {
            System.out.println("Error creating config file.");
        }
    }
}