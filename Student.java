import java.util.ArrayList;
import java.util.List;

class Student extends Person {

    private List<Book> borrowedBooks;

    // Parameterized constructor
    Student(String name, String email) {
        super(name, email);
        borrowedBooks = new ArrayList<>();
    }

    // Default Constructor
    Student() {
        super();
        borrowedBooks = new ArrayList<>();
    }

    @Override
    void displayDetails() {
        // Personal Info
        System.out.println("------Student Details------");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email + "\n");

        // Books info
        System.out.println("------Borrowed Books------");
        for(Book book: borrowedBooks){
            book.displayInfo();
        }
    }

    public void borrowedBooks(Book book) {
        borrowedBooks.add(book);
    }
}
