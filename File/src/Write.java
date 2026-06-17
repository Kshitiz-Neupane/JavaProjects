import java.io.FileWriter;

public class Write {
    static void main(String[] args) {

        String data = "\nI am Kshitiz Neupane to new file:::::";

        try{
            FileWriter output = new FileWriter("info.txt",true);

            output.write(data);

            System.out.println("Data is written to the file");

            output.close();
        }

        catch(Exception e){
            System.out.println(e);
        }
    }
}


