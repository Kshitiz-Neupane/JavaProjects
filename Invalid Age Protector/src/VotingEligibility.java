// Class containing eligibility method
class VotingEligibility {

    // Check voting eligibility
    void checkEligibility(int age) throws InvalidAgeException {

        // Throw exception if age is less than 18
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        }

        // Eligible message
        System.out.println("You are eligible to vote.");
    }
}

