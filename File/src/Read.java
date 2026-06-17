import java.io.FileReader;

public class Read {
    static void main(String[] args) {

        char[] contents = new char[100];

        try {
            FileReader input = new FileReader("newFile.txt");

            input.read(contents);

            System.out.println(contents);

            input.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}


