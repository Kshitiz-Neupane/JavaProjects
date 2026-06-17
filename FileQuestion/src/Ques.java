import java.io.File;
import java.io.FileWriter;

public class Ques {
    static void main(String[] args) {

        String data = "Log Entry: System Started at 8:00 AM";

        try {
            FileWriter output = new FileWriter("daily_log.txt");

            output.write(data);

            System.out.println("Hey Existing log file detected. Overwriting data.....");

            output.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
