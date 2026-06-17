public class Book {
    private String title;
    private String Author;
    private double price;

    void setTitle(String title){
        this.title= title;
    }

    void getTitle(){
        System.out.println("Title of book is: " + title);
    }

    void setAuthor(String Author){
        this.Author = Author;
    }

    void getAuthor() {
        System.out.println("Author of book is: " + Author);
    }

    void setPrice(double price){
        if(price < 0){
            System.out.println("Warning! Don't enter negative price");
            price= 0;
        }
        this.price= price;
    }

    void getPrice(){
        System.out.println("Price of the book is: "+ price);
    }
}
