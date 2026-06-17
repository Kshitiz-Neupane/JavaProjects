import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Guest list with some duplicate names
        ArrayList<String> guests = new ArrayList<>();

        guests.add("Ram");
        guests.add("Sita");
        guests.add("Hari");
        guests.add("Ram");
        guests.add("Gita");
        guests.add("Sita");

        // Check duplicates using nested loops
        for (int i = 0; i < guests.size(); i++) {

            for (int j = i + 1; j < guests.size(); j++) {

                // If same name found
                if (guests.get(i).equals(guests.get(j))) {

                    System.out.println("Duplicate found: " + guests.get(i));
                    break; // avoid printing same duplicate multiple times
                }
            }
        }
    }
}

