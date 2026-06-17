import java.util.Scanner;
public class Mainn {
    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);

        Person person1 = new Person();

        System.out.print("Enter your name: ");
        String userName = k.nextLine();

        person1.setName(userName);

        System.out.println("Name: " + person1.getName());

        k.close();
    }
}

