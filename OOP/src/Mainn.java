import java.util.Scanner;
public class Mainn {
    static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        System.out.println("Enter your score");
        int score = k.nextInt();

        Std student1 = new Std(score);

        System.out.println("---------First Student----------");
        System.out.println("Score: " + student1.score);
        student1.checkpf(student1.score);

        System.out.println("Enter your score");
        int score1 = k.nextInt();

        Std student2 = new Std(score1);

        System.out.println("---------Second Student----------");
        System.out.println("Score: " +student2.score);
        student2.checkpf(student2.score);
    }
}

