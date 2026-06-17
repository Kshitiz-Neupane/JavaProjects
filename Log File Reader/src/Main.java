import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> errorLogs = new ArrayList<>();

        try {
            // Open file
            File file = new File("server.log");
            Scanner k = new Scanner(file);

            // Read file line by line
            while (k.hasNextLine()) {

                String line = k.nextLine();

                // Check if line contains ERROR
                if (line.contains("ERROR")) {
                    errorLogs.add(line);
                }
            }

            k.close();

            // Print stored ERROR logs
            System.out.println("ERROR Logs:");
            for (String log : errorLogs) {
                System.out.println(log);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}

