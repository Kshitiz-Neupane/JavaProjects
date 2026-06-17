import java.util.Scanner;
public class largest {
    static void main(String[] args) {
        Scanner kshitiz = new Scanner(System.in);

        System.out.println("Enter 3 numbers");
        int a= kshitiz.nextInt();
        int b= kshitiz.nextInt();
        int c= kshitiz.nextInt();


        if(a>b && a>c){
            System.out.println(a+"is the greatest number");
        } else if (b>c && b>a) {
            System.out.println(b+"is the greatest number");
        }
        else
            System.out.println(c+"is the greatest number");
    }
}
