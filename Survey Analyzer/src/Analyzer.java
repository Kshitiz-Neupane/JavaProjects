public class Analyzer {

    public void countFrequency(int[] responses) {

        int[] freq = new int[6]; // index 1 to 5 used

        for (int r : responses) {
            freq[r]++;
        }

        // print results
        for (int i = 1; i <= 5; i++) {
            System.out.println("Rating " + i + " : " + freq[i]);
        }
    }
}