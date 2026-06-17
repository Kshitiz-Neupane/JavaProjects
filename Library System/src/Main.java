public class Main {
    public static void main(String[] args) {

        Searchable ebook = new EBook();
        Searchable pbook = new PhysicalBook();

        ebook.search("Java");
        pbook.search("Inheritance");
    }
}
