import java.util.Scanner;
public class att {
    static void main(String[] args) {
        Scanner kshitiz = new Scanner(System.in);

        System.out.println("What is your attendance percentage this session");
        int a = kshitiz.nextInt();

        if(a>75) {
            System.out.println("You are eligible for exam");
        } else if(a>50) {
            System.out.println("Medical Certification Required");
        }
        else
        System.out.println("Not eligible");

    }
}
