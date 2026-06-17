public class EBook implements Searchable {

    @Override
    public void search(String keyword) {
        System.out.println("Searching in EBook for: " + keyword);
    }
}