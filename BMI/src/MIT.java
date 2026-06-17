public class MIT {
    void findcube(int number) {
        int result = number*number*number;
        System.out.println("Cube of " + number + " is " + result);
    }

    static void main(String[] args) {
        MIT ks = new MIT();

        ks.findcube(5);
    }
}

