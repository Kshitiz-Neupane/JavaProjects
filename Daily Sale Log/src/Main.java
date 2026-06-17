import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {

        // Array of 7 days sales
        double[] sales = {1200.5, 980.0, 1500.75, 1100.0, 1350.25, 900.0, 1600.0};

        try {
            FileWriter fw = new FileWriter("weekly_sales.txt");

            // Write each sales value into file
            for (double s : sales) {
                fw.write(s + "\n");
            }

            fw.close();
            System.out.println("File written successfully.");

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}

