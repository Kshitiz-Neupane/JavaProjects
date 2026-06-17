public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[3];

        books[0] = new Book();
        books[0].setTitle("Physics");
        books[0].setAuthor("Ram");
        books[0].setPrice(-5);

        books[1] = new Book();
        books[1].setTitle("Maths");
        books[1].setAuthor("Shyam");
        books[1].setPrice(600);

        books[2] = new Book();
        books[2].setTitle("Science");
        books[2].setAuthor("Hari");
        books[2].setPrice(700);

        for(int i = 0; i <= 2; i++) {
            System.out.println("\nBook " + (i + 1));
            books[i].getTitle();
            books[i].getAuthor();
            books[i].getPrice();
        }
    }
}




