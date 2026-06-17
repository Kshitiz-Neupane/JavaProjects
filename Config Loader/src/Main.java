import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

        ConfigLoader loader = new ConfigLoader();

        try {
            loader.readConfig();
        }
        catch (FileNotFoundException e) {
            System.out.println("Config file not found!");
            loader.createDefaultConfig();
        }
    }
}