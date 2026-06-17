import java.io.File;

public class Create {
    static void main(String[] args) {
        File file = new File("daily_log.txt");

        try {
            boolean value = file.createNewFile();

            if (value) {
                System.out.println("The new file is created");
            } else {
                System.out.println("The file already exists");
            }
        }
        catch(Exception e){
                System.out.println(e);
            }

        }
    }

