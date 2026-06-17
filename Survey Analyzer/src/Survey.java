import java.util.Random;

public class Survey {

    // generate 50 random responses (1 to 5)
    public int[] getResponses() {
        int[] responses = new int[50];
        Random rand = new Random();

        for (int i = 0; i < responses.length; i++) {
            responses[i] = rand.nextInt(5) + 1; // 1 to 5
        }

        return responses;
    }
}

