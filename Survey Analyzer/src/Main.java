public class Main {
    public static void main(String[] args) {

        Survey s = new Survey();
        Analyzer a = new Analyzer();

        int[] responses = s.getResponses();

        a.countFrequency(responses);
    }
}