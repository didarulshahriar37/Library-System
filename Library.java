public class Library{
    
    public void printPersonDetails(Person p){
        p.displayDetails();
    }

    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("The Object Oriented Thought Process", "Matt Wiesfeld", "ISBN 978-0-672-33016-2", 500);
        Book book2 = new Book("Database System Concepts", "McGraw-Hill Education", "ISBN 978-1-260-08450-4", 650);

        Student student = new Student("Didarul Shahriar", "didarul13579@gmail.com");
        student.borrowedBooks(book1);

        Faculty faculty = new Faculty("Abc Def", "abcdef123@gmail.com");
        faculty.borrowedBooks(book2);

        System.out.println("Total Books Issued from Library: " + Book.totalBooksIssued + "\n");

        library.printPersonDetails(student);
        library.printPersonDetails(faculty);
    }
}