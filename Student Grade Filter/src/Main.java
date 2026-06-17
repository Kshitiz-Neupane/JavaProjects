import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        // Create ArrayList to store scores
        ArrayList<Integer> scores = new ArrayList<>();

        // Add sample scores
        scores.add(95);
        scores.add(82);
        scores.add(35);
        scores.add(90);
        scores.add(45);

        // Check each score
        for (int score : scores) {

            // Distinction for 90 and above
            if (score >= 90) {
                System.out.println(score + " : Distinction");
            }

            // Pass for 40 to 89
            else if (score >= 40) {
                System.out.println(score + " : Pass");
            }

            // Fail for below 40
            else {
                System.out.println(score + " : Fail");
            }
        }
    }
}

