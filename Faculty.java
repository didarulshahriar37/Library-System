import java.util.ArrayList;
import java.util.List;

class Faculty extends Person {

    private List<Book> borrowedBooks;

    // Parameterized contructor
    Faculty(String name, String email) {
        super(name, email);
        borrowedBooks = new ArrayList<>();
    }

    // Default Constructor
    Faculty() {
        super();
        borrowedBooks = new ArrayList<>();
    }

    @Override
    void displayDetails() {
        // Personal Info
        System.out.println("------Faculty Details------");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email + "\n");

        // Books Info
        System.out.println("------Borrowed Books------");
        for(Book book: borrowedBooks){
            book.displayInfo();
        }
    }

    public void borrowedBooks(Book book) {
        borrowedBooks.add(book);
    }
}