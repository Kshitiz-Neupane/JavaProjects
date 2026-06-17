public class PhysicalBook implements Searchable {

    @Override
    public void search(String keyword) {
        System.out.println("Looking up index in Physical Book for: " + keyword);
    }
}