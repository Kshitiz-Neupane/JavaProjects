import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Take age input
        Scanner k = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = k.nextInt();

        // Create object
        VotingEligibility voter = new VotingEligibility();

        try {
            // Check eligibility
            voter.checkEligibility(age);
        }

        // Handle custom exception
        catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        k.close();
    }
}

