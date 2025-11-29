public class Book {
    protected String title;
    protected String author;
    protected String isbn;
    protected double price;
    static int totalBooksIssued = 0;

    // Parameterized Constructor
    Book(String title, String author, String isbn, double price) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
        totalBooksIssued++;
    }

    // Default Constructor
    Book() {
        this.title = "title";
        this.author = "author";
        this.isbn = "isbn";
        this.price = 0.0;
    }

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Auhtor: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Price: " + price + "\n");
    }
}
