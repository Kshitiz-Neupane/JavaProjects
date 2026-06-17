import java.util.Scanner;
public class vote {
    public static void main(String[] args) {
        Scanner kshitiz = new Scanner(System.in);

        System.out.print("enter you age");
        int a= kshitiz.nextInt();

        if(a>=18)
        {
            System.out.println("The person can vote");
        }
        else
            System.out.println("The person cannot vote");
    }
}
