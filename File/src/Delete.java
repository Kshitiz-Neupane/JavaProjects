import java.io.File;

public class Delete {
    static void main(String[] args) {

        File file = new File("info.txt");

        try{
            boolean value = file.delete();

            if(value){
                System.out.println("File is deleted");
            }
            else{
                System.out.println("File is not deleted");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

