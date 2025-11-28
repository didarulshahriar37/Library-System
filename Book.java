public class Book {
    protected String title;
    protected String author;
    protected String isbn;
    protected double price;

    // Parameterized Constructor
    Book(String title, String author, String isbn, double price){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
    }

    void displayDetails(){
        System.out.println("------Books Details------\n");
        System.out.println("Title: " + title + "\n");
        System.out.println("Auhtor: " + author + "\n");
        System.out.println("ISBN: " + isbn + "\n");
        System.out.println("Price: " + price + "\n");
    }
}
